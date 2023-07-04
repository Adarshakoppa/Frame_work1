package listener1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {
	@Test(dataProvider = "testdata" )
	private void test(String un,String pwd) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", "12345"},
	   { "Anne", "87654"},
	 };
	}
}
	 

