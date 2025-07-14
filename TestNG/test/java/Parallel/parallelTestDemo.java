package Parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTestDemo {

	 WebDriver driver;
	 @Test
	 public void verifyTitle() throws InterruptedException
	 {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com");
		 String title = driver.getTitle();
		 Assert.assertEquals(title,"Swag Labs");
		 		 Thread.sleep(2000);
	 }
	 @Test
	 public void verifylogo() throws InterruptedException
	 {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com");
		
		 Thread.sleep(2000);
		 WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		 Assert.assertTrue(logo.isDisplayed());
		 Thread.sleep(2000);
		 driver.quit();
			 
	 }
}
