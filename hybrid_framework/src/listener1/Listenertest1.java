package listener1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenertest1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc is skipped");
	}

	

}
