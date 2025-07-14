package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestDemo1 {
	
	@BeforeClass
	public void beforeclass()
	{
	System.out.println("............Before class.........\n");
	}
	@AfterClass
	public void afterclass()
	{
	System.out.println("............Afterclass class.........");
	}
	
	@BeforeMethod
	public  void beforeMethod()
	{
		System.out.println("@---This is BeforeMethod----@");
	}
	@AfterMethod
	public  void afterMethod()
	{
		System.out.println("@--This is AfteMethod---@..\n");
	}
	
	@Test
	public void test3()
	{
		System.out.println("---This is test3---");
		}
	
	@Test
	public void test4()
	{
	System.out.println("---This is test4---");
	}
}
