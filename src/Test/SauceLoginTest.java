package Test;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
    public class SauceLoginTest extends TestBase
    {
	SauceLogin Sauce=PageFactory.initElements(driver, SauceLogin.class);
			File file;
			FileInputStream stream;
			Properties prop;
  @Test
  public void SauceLogin() throws IOException, InterruptedException {
	  SauceLogin Sauce=PageFactory.initElements(driver, SauceLogin.class);  

	     driver.get(prop.getProperty("url"));
	     Thread.sleep(2000);
	     
	     Sauce.enterusername(prop.getProperty("username"));
	     Sauce.enterpassword(prop.getProperty("password"));
	     Sauce.LoginButton();
	     
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	    String Expected = "Swag Labs";
	    String Actual = driver.getTitle(); 
	    
	 System.out.println(Actual); 
	 SoftAssert softAssertion= new SoftAssert();
	 softAssertion.assertEquals(Actual, Expected, "Sauce Labs application logged in successfully");
	 softAssertion.assertAll();
  }
 
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  file=new File("C:\\Automation\\SauceFramework\\Sauce.properties");
	  stream=new FileInputStream(file);
	  prop=new Properties();
	  prop.load(stream);	  
  }

  @AfterMethod
  public void afterMethod() {
	//  SauceLoginTest.driver.quit();
  }
}