package testCasesMyStore;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import basicPackage.DriverSetup;

public class TC005_BackForwardRefresh extends DriverSetup {

	public static String baseUrl = "http://automationpractice.com/index.php";

	@Test
	public static void BackForwardRefresh() throws InterruptedException {

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.navigate().to("http://automationpractice.com/index.php?controller=contact");
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);
	}
}
