package Pages;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	
	public class CheckOutOverView {
		WebDriver driver;
		
		
		public CheckOutOverView(WebDriver driver)
		{
			this.driver=driver;
		}
		
		@FindBy(xpath="//button[@id='finish']")
		public WebElement FinishButton;
		@FindBy(xpath="//div[@id='header_container']/div[2]/span")
		public WebElement CHECKOUTOVERVIEWHeader;
		public void SelectFinishButton()
		{
			FinishButton.click();
		}
		
		public String VerifyCHECKOUTOVERVIEWHeader()
		{
			return CHECKOUTOVERVIEWHeader.getText();
		}
		

	}
