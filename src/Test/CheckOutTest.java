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

 driver.get(prop.getProperty("url"));
 Thread.sleep(2000);
 
 CheckOutInformation.EnterFirstname(prop.getProperty("Firstname"));
 CheckOutInformation.EnterLastname(prop.getProperty("Lastname"));
 CheckOutInformation.EnterZipcode(prop.getProperty("Zipcode"));
 
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
