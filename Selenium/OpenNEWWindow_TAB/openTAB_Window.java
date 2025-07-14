package OpenNEWWindow_TAB;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class openTAB_Window {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
			 //launch chrome browser
			WebDriver driver=new ChromeDriver();
	//maximise browser
			driver.manage().window().maximize();
	//waits
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	//launch url
			driver.get("https:www.google.com");
			System.out.println(driver.getTitle());
			
			
			
	//open new TAB;
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https:www.facebook.com");
			System.out.println("secondTAB"+driver.getTitle());
			
	//get window handlles of open window
			Set<String> windowHandles = driver.getWindowHandles();
			List<String>handles=new ArrayList<String>();
			handles.addAll(windowHandles);
			driver.close();
	//return switch google.com
			driver.switchTo().window(handles.get(0));
			System.out.println("first page"+driver.getTitle());
			
	}

}
