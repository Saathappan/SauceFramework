package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SauceLogin {
	WebDriver driver;
	public SauceLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	public WebElement UserName;
	@FindBy(xpath="//input[@id='password']")
	public WebElement Password;
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement LoginButton;
	
	public void enterusername(String value)
	{
		UserName.sendKeys(value);
	}
	public void enterpassword(String value)
	{
		Password.sendKeys(value);
	}
	
	public void LoginButton()
	{
		LoginButton.click();
	}

}
