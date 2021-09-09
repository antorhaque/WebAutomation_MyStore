package testCasesMyStore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC006_Scroll extends DriverSetup {

	public static String baseUrl = "http://automationpractice.com/index.php";

	@Test
	public static void scroll() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(3000);

		WebElement e = driver.findElement(By.xpath("//em[@id='icon-truck']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(3000);

	}

}
