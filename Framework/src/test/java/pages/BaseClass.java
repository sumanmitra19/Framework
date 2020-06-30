package pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import utilities.BrowserFactory;
import utilities.ConfigDataProvider;
import utilities.Helper;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite()
	{
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setUp()
	{
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingURL());
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void failedTestCase(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Helper.captureScreenshot(driver);
		}
	}	
}
