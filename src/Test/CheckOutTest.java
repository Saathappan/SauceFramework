package Test;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.CheckOutInformation;
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
public class CheckOutTest extends TestBase{
	
	CheckOutInformation CheckOutInformation=PageFactory.initElements(driver, CheckOutInformation.class);
	File file;
	FileInputStream stream;
	Properties prop;
@Test
public void CheckOutInformation() throws IOException, InterruptedException {
	
	
	CheckOutInformation CheckOutInformation=PageFactory.initElements(driver, CheckOutInformation.class);  
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 
	 
	 
	 String ActualHeader =  CheckOutInformation.VerifyCHECKOUTINFORMATIONHeader();
	  
	    String ExpectedHeader = "CHECKOUT: YOUR INFORMATION";
	     SoftAssert softAssertion= new SoftAssert();
	    
	   softAssertion.assertEquals(ActualHeader, ExpectedHeader, "Sauce Labs application landed in Check Out Your Information page successfully");
	 softAssertion.assertAll();
	
	
	CheckOutInformation.EnterFirstname(prop.getProperty("Firstname"));
 CheckOutInformation.EnterLastname(prop.getProperty("Lastname"));
 CheckOutInformation.EnterZipcode(prop.getProperty("Zipcode"));
 CheckOutInformation.SelectContinueButton();
 

 
 
	


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
