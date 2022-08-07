package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

    
		@BeforeTest
		public void beforetest() 
		{
			System.out.println("Before Test...");
		}
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("Before class");
		}
		@BeforeMethod
		public void Beforemethod()
		{
			System.out.println("Before Method");
		}
		@Test
		public void test1() {
			System.out.println("test case1");
		}
		@Test
		public void test2() {
			System.out.println("Test case2");
		}
		
		@AfterTest
		public void aftertest()
		{
			System.out.println("After test");
		}
	@AfterMethod
	public void aftermethod()
	{
		
		System.out.println("after method");
	} 
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	@BeforeClass
	public void beforeClass2() {
		System.out.println("Before class2");
	}
	@AfterClass
	public void afterClass2() {
		System.out.println("after class2");
	}

	
}

