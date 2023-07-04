package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generic.Framework_const1;
import generic.Generic_screenshot;

public class genericu implements Framework_const1
{
	public WebDriver driver;
	@BeforeMethod
	public void ge1() 
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	@AfterMethod
	public void ge2(ITestResult res) 
	{
		if(ITestResult.FAILURE==res.getStatus())
			Generic_screenshot.getphoto(driver);
		    driver.close();
	}
	

}
