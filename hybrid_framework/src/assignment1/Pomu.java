package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomu 
{
		@FindBy(id="email")
		private WebElement username;
		@FindBy(id="pass")
		private WebElement password;
		@FindBy(name="login")
		private WebElement Login;
		
		public Pomu(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
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
