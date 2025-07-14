package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys_clear_click {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println("-------------");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaishali more");//use only textfield..ex..name,password
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vaishali@222294");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='pass']")).clear();
			driver.findElement(By.xpath(" //button[@type='submit']")).click();//use only for click---login click button
			
			


	}

}
