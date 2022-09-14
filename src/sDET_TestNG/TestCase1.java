package sDET_TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestCase1 {
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("This will execute before the class");
	}
	@AfterClass 
	void afterClass()
	{
		System.out.println("This will execute after the class");
	}
	@BeforeMethod 
	void beforeMethod()
	{
		System.out.println("This will execute before every Method");
	}
	@AfterMethod
	void afterMethod()
	{
		System.out.println("This will execute after every Method");
	}
	@Test
	void test1()
	{
		System.out.println("This is test1");
	}
	@Test 
	void test2()
	{
		System.out.println("This is test2");
	}
	@BeforeTest
	void beforeTest() { System.out.println("This will execute before test");
		
	}
	@AfterTest
	void afterTest() {System.out.println("This will execute after test");}

}
