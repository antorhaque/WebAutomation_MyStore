package testCasesMyStore;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import basicPackage.DriverSetup;
import junit.framework.Assert;

public class TC002_VerifyTitle extends DriverSetup {

	public static String baseURL = "http://automationpractice.com/index.php";

	@Test (priority=1)
	public static void verifyTitle() throws InterruptedException {

		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String actualPageTitle = driver.getTitle();
		System.out.println("The page title is: " + actualPageTitle);
		Thread.sleep(3000);

		String expectedPageTitle = "My Store";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
	}

	@Test (priority=2)
	public static void websiteSecured() throws InterruptedException {

		String getUrl = driver.getCurrentUrl();

		if (getUrl.contains("https")) {
			System.out.println("This site is secured");
		}

		else {

			System.out.println("This site is not secured");
		}
	}

}
