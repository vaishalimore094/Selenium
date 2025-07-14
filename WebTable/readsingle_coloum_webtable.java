package Webtable_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class readsingle_coloum_webtable {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
			//------------handle notification----------------
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.get("D:\\appache poi setup\\webtable\\table.html");
		    Thread.sleep(2000);
//		    //-------------read singlee coloumn data-----------------
//		    String secondcoloumndata = driver.findElement(By.xpath("//table[@id='1234']//tr[2]//td[2]")).getText();
//		    System.out.println(secondcoloumndata);
//		    
//		    //----------------read 1 coloumn data------------------------
//		    
//		     List<WebElement> coloumn2 = driver.findElements(By.xpath("//table[@id='1234']//tr//td[2]"));
//		    for(WebElement w:coloumn2)
//		    {
//		    	System.out.println(w.getText());
//		    	
//		    }
		    //-------------------read all coloumns----------------------
		     List<WebElement> allcoloumdata = driver.findElements(By.xpath("//table[@id='1234']//tr//td"));
		    for(WebElement w: allcoloumdata)
		    {
		         System.out.println(w.getText());
		    }
		    
		    
		    

	}

}
