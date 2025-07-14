package ImagesLink;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagelink_webppage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		 //launch chrome browser
		WebDriver driver=new ChromeDriver();
//maximise browser
		driver.manage().window().maximize();
//waits
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//launch url
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
	//find webelement image link open cart
		
     driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
    
     //verify title
     if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"));
     {
    	 System.out.println("test passes");
     }
	}
	

}
