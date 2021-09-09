package testCasesMyStore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC001_Login_BuyDress extends DriverSetup {

	public static String baseURL = "http://automationpractice.com/index.php";
	public static String email = "moinulhaq108@gmail.com";
	public static String pass = "Antor@123";

	@Test
	public static void login() throws InterruptedException {

		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(pass);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]"))
				.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//div[@class='top-pagination-content clearfix']//form[@class='compare-form']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//a[@title='Printed Dress'][normalize-space()='Printed Dress']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).submit();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"))
				.click();
		Thread.sleep(2000);

	}
}
