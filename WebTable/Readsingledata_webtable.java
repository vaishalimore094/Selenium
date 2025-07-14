package Webtable_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Readsingledata_webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		//------------handle notification----------------
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	    driver.get("D:\\appache poi setup\\webtable\\table.html");
	    Thread.sleep(2000);
//	    String tabletext = driver.findElement(By.xpath("//td[text()=' selenium ']")).getText();
//	   System.out.println(tabletext);
	   //---------------------or----------------------------------------
	  System.out.println(driver.findElement(By.xpath("//table[@id='1234']//tr[4]//td[2]")).getText());
	      

	}
	

}
