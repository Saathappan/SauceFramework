package Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.CheckOutOverView;
import Pages.SauceLogin;

public class CheckOutOverViewTest extends TestBase{

	CheckOutOverView CheckOutOverView=PageFactory.initElements(driver, CheckOutOverView.class);
	File file;
	FileInputStream stream;
	Properties prop;
	
	@Test
	  public void CheckOutOverViewTest() throws IOException, InterruptedException {
		CheckOutOverView CheckOutOverView1=PageFactory.initElements(driver, CheckOutOverView.class);

		
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  String ActualHeader =   CheckOutOverView1.VerifyCHECKOUTOVERVIEWHeader();
		  
		    String ExpectedHeader = "CHECKOUT: OVERVIEW";
		     SoftAssert softAssertion= new SoftAssert();
		    
		   softAssertion.assertEquals(ActualHeader, ExpectedHeader, "Sauce Labs application landed in Check Out Over View page successfully");
		 softAssertion.assertAll();
		 
		     CheckOutOverView1.SelectFinishButton();
		
	
		     

	  }
	
	
}
