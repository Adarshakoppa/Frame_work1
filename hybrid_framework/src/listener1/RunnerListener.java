package listener1;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class RunnerListener {
	@Test
	public void test1()
	{
		System.out.println("hello sql");
	}
	@Test
	public void test2()
	{
		System.out.println("hello java");
		Assert.fail();
	}
	@Test(dependsOnMethods = "test2")
	private void test3() 
	{
		System.out.println("tata bye bye ");
	}

}
