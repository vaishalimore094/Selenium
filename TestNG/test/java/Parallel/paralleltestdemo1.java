package Parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralleltestdemo1 {
	 WebDriver driver;
	 @Test
	 public void verifyloginbutton() throws InterruptedException
	 {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
		 
		 Assert.assertEquals(driver.getTitle(),"Swag Labs");
		 driver.quit();
}
}
