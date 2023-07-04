package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Generic_demo;
import pom.Pom_demo;

public class Demoqa extends Generic_demo 
{
	@Test//(dataProvider = "testdata")
	public void te1()
	{
		
		Pom_demo p1=new Pom_demo(driver);
		p1.passFn("adarsh");
		p1.passLn("koppa");
		p1.passEmail("adarshannayak@gmail.com");
		p1.clickbuttonM();
		p1.passmob("9945391330");
		p1.clickDob();
		driver.findElement(By.xpath("//div[text()='15']")).click();
        p1.passSub("English");
	    p1.clickHobbies("hb");
	    driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']")).click();
	    p1.uploadPics("C:\\Users\\Sony\\OneDrive\\Desktop\\fireflink defect 1.png");
		p1.addres("indira nagar 3rd cross koppa");
	}
	/*@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "admin", "1234" },
	   { "Anne", "4567"},
	 };
	}*/
}
