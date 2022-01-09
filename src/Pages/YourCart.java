package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class YourCart {
	WebDriver driver;
	public YourCart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	public WebElement SelectCheckOutButton;
	@FindBy(xpath="//div[@id='header_container']/div[2]/span")
	public WebElement YourCartHeader;
	
	public void SelectCheckOutButton()
	{
		SelectCheckOutButton.click();
	}
	public String VerifyYourCartHeader()
	{
		return YourCartHeader.getText();
	}
	
	
}

	
