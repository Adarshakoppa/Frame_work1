package assignment1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.Generic_read_data_excel;

public class Runneru extends genericu
{
	@Test
	public void te1()
	{
	Pomu p=new Pomu(driver);
	String un = Generic_read_data_excel.getData("Sheet1",0,0);
	String pwd = Generic_read_data_excel.getData("Sheet1",0,1);
	System.out.println(un); 
	System.out.println(pwd);
	p.passUN(un);
	p.passPWD(pwd);
	p.clicklogin();
	}


}
