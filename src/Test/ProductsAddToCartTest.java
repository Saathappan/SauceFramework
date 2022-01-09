package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.Products;
import Pages.SauceLogin;

import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;


    public class ProductsAddToCartTest extends TestBase
    {
    	  Products ProductsAdd=PageFactory.initElements(driver, Products.class); 
			File file;
			FileInputStream stream;
			Properties prop;
  @Test
  public void ProductsToAddCartTest() throws IOException, InterruptedException {
	  
	  Products ProductsAdd=PageFactory.initElements(driver, Products.class);  
	     
	  
	  ProductsAdd.AddToCartBackpack();
	  ProductsAdd.AddToCartBikeLight();
	  
	String ActualAddedCount =  ProductsAdd.AddedCartCount();

	     
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	    String ExpectedAddedCount = "2";
	    
	 System.out.println(ActualAddedCount); 
	 SoftAssert softAssertion= new SoftAssert();
	 softAssertion.assertEquals(ActualAddedCount, ExpectedAddedCount, "Two products addedd successfully in cart");
	 softAssertion.assertAll();
	 
	  ProductsAdd.SelectCartButton();
	  
	  String Expected = "Swag Labs";
	    String Actual = driver.getTitle(); 
	    
	
	 softAssertion.assertEquals(Actual, Expected, "Sauce Labs application came to your cart's page successfully");
	 softAssertion.assertAll();
	 
  }
 
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  file=new File("C:\\Automation\\SauceFramework\\Sauce.properties");
	  stream=new FileInputStream(file);
	  prop=new Properties();
	  prop.load(stream);	  
  }

}