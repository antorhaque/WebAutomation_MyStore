package testCasesMyStore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC007_Slider extends DriverSetup {
	
	
	public static String baseUrl = "http://automationpractice.com/index.php?id_category=3&controller=category";

	@Test
	public static void scroll() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//ul[@id='ul_layered_manufacturer_0']//a[1]"));
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView();", e);
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-widget-header ui-corner-all']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		
		a.dragAndDropBy(e1, 50, 0).build().perform();
		Thread.sleep(3000);
;
		
}

}