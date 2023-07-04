package packageX;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Sel {

	public static void deselectall(WebElement ele)
	{
		Select s=new Select(ele);
		if (s.isMultiple())
		s.deselectAll();
		else 
		System.out.println("select class is not multiple");
	}
	public static void deselect_index(WebElement ele,int value)
	{
		Select s=new Select(ele);
		if (s.isMultiple())
		s.deselectByIndex(value);
		else 
			System.out.println("select class is not multiple");
		
	}
	public static void deselect_value(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.deselectByValue(value);
	}
	public static void deselect_visible_text(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	public static void sequals(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.equals(value);
	}
	public static void getAlloptions(WebElement ele)
	{
		Select s=new Select(ele);
		s.getAllSelectedOptions();
	}
	public static void getFirstOption(WebElement ele)
	{
		Select s=new Select(ele);
		s.getFirstSelectedOption();
	}
	public static void getWrapdElemnt(WebElement ele)
	{
		Select s=new Select(ele);
		s.getWrappedElement();
	}
	public static void isMultpl(WebElement ele)
	{
		Select s=new Select(ele);
		s.isMultiple();
	}
	public static void selectIndex(WebElement ele,Integer value)
	{
		Select s=new Select(ele);
		s.selectByIndex(value);
	}
	public static void selectvalue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	public static void selectVisibleText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public static List<WebElement> selectOptions(WebElement ele)
	{
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		return  opt;
		
	}
	
	

}
