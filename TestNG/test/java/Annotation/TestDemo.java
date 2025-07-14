package Annotation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestDemo {
	@BeforeSuite
	public void beforesuit()
	{
	System.out.println("............Before suit.........");
	}
	@AfterSuite
	public void Aftersuit()
	{
	System.out.println("............Aftersuit.........");
	}
	@BeforeTest
	public void beforeTest()
	{
	System.out.println("............Before Test.........");
	}
	@AfterTest
	public void AeforeTest()
	{
	System.out.println("............After Test.........");
	}
	@BeforeClass
	public void beforeclass()
	{
	System.out.println("............Before class.........\n");
	}
	@AfterClass
	public void afterclass()
	{
	System.out.println("............Afterclass .........");
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
	public void test1()
	{
		System.out.println("---This is test1---");
		}
	
	@Test
	public void test2()
	{
	System.out.println("---This is test2---");
	}	
}
