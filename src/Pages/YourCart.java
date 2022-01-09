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

	
	public void SelectCheckOutButton()
	{
		SelectCheckOutButton.click();
	}
}

	
