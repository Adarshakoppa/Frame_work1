package runner;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi.generic;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import generic.Base_test;
import generic.Generic_read_data_excel;
import pom.Pom_fb;

public class Test_fb extends Base_test
{
	@Test
	public void test(String un,String pwd) throws InterruptedException
	{
		Pom_fb p=new Pom_fb(driver);
		String user = Generic_read_data_excel.getData("Sheet1", 0, 0);
		String pass = Generic_read_data_excel.getData("Sheet1", 0, 1);
		p.passUN(user);
		p.passPWD(pass);
		p.clicklogin();
			Thread.sleep(1000);
	}
	/*(dataProvider = "testdata")
	@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "adarsh", "12345"},
	   { "rajesh", "14578"},
	 };
	}
}*/
}

