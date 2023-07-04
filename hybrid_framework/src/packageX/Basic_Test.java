package packageX;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basic_Test implements Framework_const2{

	    public WebDriver driver;
		@BeforeMethod
		public void openAppln()
		{
			System.setProperty(chrome_key, chrome_value);
			driver=new ChromeDriver();
			driver.get(base_url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		@AfterMethod
		public void closeAppln(ITestResult res) throws IOException
		{ 
			if(ITestResult.FAILURE==res.getStatus())
				Generic_Shots.getphoto(driver);
			driver.close();
		}

	}

