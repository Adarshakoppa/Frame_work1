package packageX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom extends Base_Page1 {
		@FindBy(id = "email")
		private WebElement username;
		@FindBy(id = "pass")
		private WebElement password;
		@FindBy(name = "login")
		private WebElement Login;
		
		public Pom(WebDriver driver)
		{
			super(driver);
		}
		public void passUN(String un)
		{
			username.sendKeys(un);
		}
		public void passPWD(String pwd)
		{
			password.sendKeys(pwd);
		}
		public void clicklogin()
		{
			Login.click();
		}
		


	}

