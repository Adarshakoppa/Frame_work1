package runner;

import org.testng.annotations.Test;

//@Test(groups="include tests")
public class Groups1 {
	@Test(groups="sanity")
	public void test1() 
	{
		System.out.println("hello world");
	}
	@Test(groups= {"sanity","smoke"})
	public void test2()
	{
		System.out.println("hello india");
	}
	@Test(groups="smoke")
	public void test3()
	{
		System.out.println("hello bengaluru");
	}

}
