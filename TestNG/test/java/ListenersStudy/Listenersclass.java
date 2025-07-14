package ListenersStudy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenersclass implements ITestListener
{
	 private static final WebDriver Webdriver = null;
	ListenersDemoTestclass sc=new ListenersDemoTestclass();
			 
   @Override
public void onTestStart(ITestResult result) {
	
	System.out.println("revoke on test start method");
}	
   @Override
	public void onTestSuccess(ITestResult result) {
	   System.out.println("method succusssfylly passed"+result.getName());
	  
	  String TCID = result.getName();
	  try {
		sc.screenshot(Webdriver , TCID);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
   }
	  
   
		
		
   @Override
	public void onFinish(ITestContext context) {
	   System.out.println("revoke on test finish method");
		
	}
   @Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("method skippepd"+result.getName());
	}
   @Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
   @Override
	public void onStart(ITestContext context) {
		System.out.println("method start");
	}
   @Override
	public void onTestFailure(ITestResult result) {
	   System.out.println("method succusssfylly failed"+result.getName());
   }
}