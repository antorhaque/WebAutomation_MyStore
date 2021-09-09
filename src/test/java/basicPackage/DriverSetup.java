package basicPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {

	public static WebDriver driver;

	@BeforeSuite
	public static void SetDriver() throws InterruptedException {

		System.setProperty("wedriver.chrome.driver", ".\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterSuite
	public static void close() {

		driver.close();
	}

}
