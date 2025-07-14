package Webtable_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class readSinglerow_webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		//------------handle notification----------------
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("D:\\appache poi setup\\webtable\\table.html");
	    Thread.sleep(2000);
	    
	    
	    //----------------read  header-------------------------
	   
	    //List<WebElement> header = driver.findElements(By.tagName("th"));
	    //List<WebElement> header = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[1]"));
	    
	    // it sure first row is header then-------1.
	    
	  //List<WebElement> header = driver.findElements(By.xpath("//table[@id='1234']//tr[1]"));
	  //List<WebElement> header = driver.findElements(By.xpath("//table[@id='1234']//tr//th"));
	  
		  
	   // System.out.println(header.size());//---to check size
	    
//	   for(WebElement w:header)//---to get data
//	   {
//	    System.out.println(w.getText());
//	    	
//	    }
	   //-------------------read single row-------------------------
	    
	   List<WebElement> row3 = driver.findElements(By.xpath("//table[@id='1234']//tr[4]"));
	    for(WebElement w:row3)
	    {
	    	System.out.println(w.getText());
	    	
	    }

}
	


}
