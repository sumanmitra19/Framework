package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test
	public void loginApp()
	{
		LoginPage lpage = PageFactory.initElements(driver, LoginPage.class);
		lpage.loginToApp(config.getUsername(), config.getPassword());
	}
}
