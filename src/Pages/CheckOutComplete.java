package Pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	public class CheckOutComplete {
		WebDriver driver;
		public CheckOutComplete(WebDriver driver)
		{
			this.driver=driver;
		}
		
		@FindBy(xpath="//*[contains(text(),'THANK YOU FOR YOUR ORDER')]")
		public WebElement ThankYouMessageText;
		@FindBy(xpath="//div[@id='header_container']/div[2]/span")
		public WebElement CHECKOUTCOMPLETEHeader;
		
		public String VerifyThankYouMessageText()
		{
			return ThankYouMessageText.getText();
		}
		
		public String VerifyCHECKOUTCOMPLETEHeader()
		{
			return CHECKOUTCOMPLETEHeader.getText();
		}

}
