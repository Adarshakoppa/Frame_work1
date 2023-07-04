package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parallel_exec{
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void exec(String browser)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
		}
		else
		{
			driver=new EdgeDriver();
			driver.get("https://www.amazon.in");
		}
	
	}
}
	
