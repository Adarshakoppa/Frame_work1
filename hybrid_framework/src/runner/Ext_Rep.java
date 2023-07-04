package runner;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Ext_Rep {
	@Test
	public void te1()
	{
		ExtentReports rep=new ExtentReports("./reports/r.html",false);
		ExtentTest t1=rep.startTest("tc1");
		t1.log(LogStatus.PASS,"passed tc");
		//t1.log(LogStatus.FAIL,"failed tc");
		t1.log(LogStatus.SKIP,"tc skipped");
		rep.endTest(t1);
		rep.flush();
	}
	

}
