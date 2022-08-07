package testcases;

import org.testng.annotations.Test;

public class SetPriority {
	
	@Test(priority=2)
	public void test1()
	{
		System.out.println("Test case1 ");
	}
	@Test(priority=1,enabled=false)
	public void test2()
	{
		System.out.println("Test case2");
	}
	@Test(priority=0)
	public void test3(){
		System.out.println("test case");
	}
}
