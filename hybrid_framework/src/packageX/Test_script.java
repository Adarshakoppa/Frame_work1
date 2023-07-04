package packageX;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import generic.Base_test;

public class Test_script extends Base_test {
	
			@Test(dataProvider = "testdata")
		public void test(String d1,String d2) throws InterruptedException
		{
			Pom p=new Pom(driver);
			
			p.passUN(d1);
			p.passPWD(d2);
			Thread.sleep(1000);
			p.clicklogin();
			Assert.fail();
		}
		@DataProvider(name = "testdata")
		public Object[][] createData1() {
		 return new Object[][] {
		   { "adarsh", "12345"},
		   { "rajesh", "14578"},
		 };
		}
	}
