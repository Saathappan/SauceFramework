package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.CheckOutComplete;
import Pages.SauceLogin;

public class CheckOutCompleteTest extends TestBase{

	CheckOutComplete CheckOutComplete=PageFactory.initElements(driver, CheckOutComplete.class);
	File file;
	FileInputStream stream;
	Properties prop;
	
	@Test
	  public void CheckOutOverViewTest() throws IOException, InterruptedException {
		CheckOutComplete CheckOutComplete1=PageFactory.initElements(driver, CheckOutComplete.class);
		  
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  String ActualHeader =   CheckOutComplete1.VerifyCHECKOUTCOMPLETEHeader();
		  
		    String ExpectedHeader = "CHECKOUT: COMPLETE!";
		     SoftAssert softAssertion= new SoftAssert();
		    
		   softAssertion.assertEquals(ActualHeader, ExpectedHeader, "Sauce Labs application landed in Check Out Complete page successfully");
		 softAssertion.assertAll();
		 

		 
		 
	  }
	
	
}
