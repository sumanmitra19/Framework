package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(how = How.NAME, using = "userName")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement passWord;
	
	@FindBy(how = How.XPATH, using = "//input[@name='login']")
	WebElement signIn;
	
	
	public void loginToApp(String uname, String pswrd)
	{
		userName.sendKeys(uname);
		passWord.sendKeys(pswrd);
		signIn.click();
	}
}
