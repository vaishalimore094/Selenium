package pop_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//also called window popup
public class Child_Popup {
	public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://skpatro.github.io/demo/links/");
			 Thread.sleep(2000);
			 driver.findElement(By.name("NewWindow")).click();
			 Thread.sleep(2000);

//--1.to handle the child browser popup	---------------------
			 //--we need to switch main page to childbrowser
			 
//1	//---to get address of main page
			 
			// String MainpageID = driver.getWindowHandle();//---syntax
			// System.out.println(MainpageID);
			 
//2	//we get address of main page as well as child page 
			 
			 Set<String> Allpagesids = driver.getWindowHandles();//---syntax
			 System.out.println(Allpagesids);
			
			Iterator<String> it=Allpagesids.iterator();
			String  MainpageID=it.next();
			String childPage1 = it.next();
			Thread.sleep(2000);
			
//3	// now you are need to switch in child page
			
			driver.switchTo().window(childPage1);
			//take a action as par need in chield page like,close,maximize
			driver.manage().window().maximize();
			driver.close();
			//no such window exception found bcz dont switch to main page 
	   // String Text = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		//System.out.println(Text);	
			
			
//4.//now we are need to switch in main page
			
			driver.switchTo().window(MainpageID);
			String Text = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
			System.out.println(Text);	
			
			
	
			
			
	}

}
