package testCasesMyStore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC003_CheckBox extends DriverSetup {
	
	
	public static String baseUrl = "http://automationpractice.com/index.php";
	@Test
	public static void checkBox() throws InterruptedException{
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='layered_category_8']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_2']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='layered_id_feature_5']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='layered_id_feature_13']")).click();
		Thread.sleep(3000);
		
		
	
	
	}
	
	
}
