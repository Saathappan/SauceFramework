package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CheckOutInformation {

	WebDriver driver;
	
	
	public CheckOutInformation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	public WebElement Firstname;

	@FindBy(xpath="//input[@id='last-name']")
	public WebElement Lastname;
	@FindBy(xpath="//input[@id='postal-code']")
	public WebElement Zipcode;
	@FindBy(xpath="//input[@id='continue']")
	public WebElement ContinueButton;
	@FindBy(xpath="//div[@id='header_container']/div[2]/span")
	public WebElement CHECKOUTINFORMATION;
	public void EnterFirstname(String value)
	{
Firstname.sendKeys(value);
	}
	
	public void EnterLastname(String value)
	{
		Lastname.sendKeys(value);
	}
	
	public void EnterZipcode(String value)
	{
		Zipcode.sendKeys(value);
	}
	
	public void SelectContinueButton()
	{
		ContinueButton.click();
	}
	
	public String VerifyCHECKOUTINFORMATIONHeader()
	{
		return CHECKOUTINFORMATION.getText();
	}
}