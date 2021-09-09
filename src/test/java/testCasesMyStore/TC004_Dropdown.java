package testCasesMyStore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC004_Dropdown extends DriverSetup {

	public static String baseUrl = "http://automationpractice.com/index.php";

	@Test
	public static void dropdown() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(3000);

		Select selectByvisibletext = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
		Thread.sleep(3000);

		selectByvisibletext.selectByVisibleText("In stock");
		Thread.sleep(5000);
	}
}
