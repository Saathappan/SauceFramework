package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Products {
	WebDriver driver;
	public Products(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	public WebElement AddToCartBackpack;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	public WebElement AddToCartBikeLight;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	public WebElement AddToCartTShirt;
	@FindBy(xpath="//div[@id='shopping_cart_container']/a/span")
	public WebElement AddedCartCount;
	@FindBy(xpath="//div[@id='shopping_cart_container']/a")
	public WebElement SelectCartButton;
	
	public void AddToCartBackpack()
	{
		AddToCartBackpack.click();
	}
	
	public void AddToCartBikeLight()
	{
		AddToCartBikeLight.click();
	}
	
	
	public void AddToCartTShirt()
	{
		AddToCartTShirt.click();
	}
	
	public String AddedCartCount()
	{
		return AddedCartCount.getText();
	}
	
	public void SelectCartButton()
	{
		SelectCartButton.click();
	}
	

}
