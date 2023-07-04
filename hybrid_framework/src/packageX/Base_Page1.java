package packageX;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page1 {


		public WebDriver driver;
		public Base_Page1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	}
