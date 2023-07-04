package packageX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Act 
{
	public static void RightClick(WebDriver driver,WebElement ele) 
	{
		Actions a=new Actions(driver);
		a.contextClick(ele);
	}
	public static void DoubleClick(WebDriver driver,WebElement ele) 
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele);
	}
	public static void DragandDrop(WebDriver driver,WebElement from,WebElement to) 
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(from,to);
	}
	public static void action(WebDriver driver,WebElement ele) 
	{
		Actions a=new Actions(driver);
		a.contextClick(ele);
	}


}
