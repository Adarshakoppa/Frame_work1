package pom;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import generic.BasePage;

public class Pom_demo extends BasePage
{

public	WebDriver driver;

		@FindBy(id = "firstName")
		private WebElement fname;
		
		@FindBy(id = "lastName")
		private WebElement lname;
		
		@FindBy(id = "userEmail")
		private WebElement email;
		
		@FindBy(xpath ="//label[@class='custom-control-label' and @for='gender-radio-1']")
		private WebElement genderM;
		
		@FindBy(xpath = "//input[@placeholder='Mobile Number']")
		private WebElement mobile;
		
		@FindBy(id = "dateOfBirthInput")
		private WebElement dob;
		
		@FindBy(xpath = "//input[@id='subjectsInput']")
	    private WebElement subjects;
		
		@FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
		private WebElement hobbies;
		
		@FindBy(id = "uploadPicture")
		private WebElement picture;
		
		@FindBy(id = "currentAddress")
		private WebElement address;
		
		
		public Pom_demo(WebDriver driver)
		{
		super(driver);
		}
		
		public void passFn(String un)
		{
			fname.sendKeys(un);
		}
		
		public void passLn(String ln)
		{
			lname.sendKeys(ln);
		}
		
		public void passEmail(String mail)
		{
			email.sendKeys(mail);
		}
		
		public void clickbuttonM()
		{
			genderM.click();
		}
		
		public void passmob(String no)
		{
			mobile.sendKeys(no);
		}
		
		public void clickDob()
		{
			dob.click();
		}
		
		public void passSub(String sub) 
		{
		subjects.sendKeys(sub);
		try {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		public void clickHobbies(String hb)
		{
			hobbies.sendKeys(hb);
			
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				}
			catch (AWTException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void uploadPics(String abc)
		{
		picture.sendKeys(abc);
		}
		
		public void addres(String add)
		{
			address.sendKeys(add);
		}
		
}

