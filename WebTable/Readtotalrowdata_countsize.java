package Webtable_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Readtotalrowdata_countsize {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
			//------------handle notification----------------
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.get("D:\\appache poi setup\\webtable\\table.html");
		    Thread.sleep(2000);
//-------read totalrowcount method----------1		    ...00
		    
		   List<WebElement> totalrowcount = driver.findElements(By.tagName("tr"));
		  System.out.println(totalrowcount.size());//-----------size
		   
//-----read total rowdata--------------------------
		   
//		   for(WebElement w:totalrowcount)
//		   {
//			   System.out.println(w.getText());
//		   }

	}

		
}
