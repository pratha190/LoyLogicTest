package basic.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author Pratha
 */

public class TestBase {
	public static WebDriver driver = null;

	@BeforeSuite
	public void initialize() throws IOException, Exception {

		// set Chrome path
		System.setProperty("webdriver.chrome.driver",
				"C:\\RedicalSilenium\\31-aug-2019(drivers)\\chromedriver_win32_B39\\chromedriver.exe");

		// Creating Webdriver object
		driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// To open Amazon
		driver.get(" https://www.amazon.in/");
	}

	@AfterSuite
	// Test cleanup
	public void TeardownTest() {
		// TestBase.driver.quit();
	}
}
