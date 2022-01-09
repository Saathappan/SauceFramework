package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class TestBase {
	  
public static WebDriver driver;
	 
  @BeforeSuite
  public void beforeSuite() {
 System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver&Jars\\chromedriver.exe");		
 driver =  new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  }

  @AfterSuite
  public void afterSuite(){
    driver.quit();
	  
  }

}
