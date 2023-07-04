package packageX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselect {
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("C:\\Users\\Sony\\OneDrive\\Desktop\\p1\\multiple_select.html");
			WebElement ele = driver.findElement(By.id("maruthi hotel"));
		 List<WebElement> s = Generic_Sel.selectOptions(ele);
			for (int i = 0; i<s.size() ; i++) 
			{
			 Generic_Sel.selectIndex(ele, i);
			} 
			Thread.sleep(1000);
			for (int i = s.size()-1; i>=0 ; i--) 
			{
			 Generic_Sel.deselect_index(ele, i);
			 Thread.sleep(1000);
			} 
			
			}
			
			//Generic_Sel.selectvalue(ele, "j");
			//Generic_Sel.deselect_index(ele, 1);
			//Generic_Sel.deselectall(ele);
			//Generic_Sel.selectVisibleText(ele, "kushka");
			/*Select s=new Select(ele);
			s.selectByIndex(1);
			Thread.sleep(3000);
			s.selectByValue("l");
			Thread.sleep(2000);
			s.selectByVisibleText("chilly chicken");
			Thread.sleep(2000);
			s.deselectAll();*/
		}

	

