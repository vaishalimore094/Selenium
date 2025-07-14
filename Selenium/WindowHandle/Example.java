package multiple_windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver","D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//get id of first window
		
	  //  String windowId=driver.getWindowHandle();
	  //  System.out.println("printId of "+ windowId);
	    
	    //get id of multiple window
	    
	    
	    driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	    Set<String> windowIDs=driver.getWindowHandles();
	    
	  
	  // by using iterator captureID
	   
	  Iterator<String> it=windowIDs.iterator();
	  String parentwindowID=it.next();
	  String chieldwindowID=it.next();
	  System.out.println("parent window ID "+parentwindowID);
	  System.out.println("child window ID "+chieldwindowID);

	}

}
