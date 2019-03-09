package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	@Parameters ({"Browser"})
	public void startdriver(@Optional("chrome") String BrowserName)

	{
		if (BrowserName.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) 
		{

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}



		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.nopcommerce.com/");

	}
	@AfterSuite
	public void stopdriver() 
	{
		driver.quit();
	}

	// take screenshot when the test case fail and add it in to screenshots folder
	@AfterMethod
	public void screenshotonfailure(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Failed");
			System.out.println("Taking screenshot...");
			Helper.capturescreenshot(driver, result.getName());
			
		}
	}
}
