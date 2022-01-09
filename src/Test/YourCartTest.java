package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.YourCart;
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
    public class YourCartTest extends TestBase
    {
	YourCart YourCart=PageFactory.initElements(driver, YourCart.class);
			File file;
			FileInputStream stream;
			Properties prop;
  @Test
  public void YourCart() throws IOException, InterruptedException {
	  YourCart YourCart=PageFactory.initElements(driver, YourCart.class);  
	     
	     YourCart.SelectCheckOutButton();
	     
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	    String Expected = "Swag Labs";
	    String Actual = driver.getTitle(); 
	    
	 System.out.println(Actual); 
	 SoftAssert softAssertion= new SoftAssert();
	 softAssertion.assertEquals(Actual, Expected, "Sauce Labs application came to your check out page successfully");
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