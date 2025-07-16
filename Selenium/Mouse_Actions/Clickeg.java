package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Clickeg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		//------------handle notification----------------
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
					    driver.get("https://www.flipkart.com/");
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    Thread.sleep(2000);
		    
		    //1.create object of action class
		    
		    Actions act = new Actions(driver);//syntax
		    
		    //2.by using desired action and take action
		    //find x path of desired location and store in ref variable
		    
		   WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Login']"));
		   
		   //as every single action use perform method to complete action
		   
		     act.moveToElement(loginbutton).perform();//-----case1
		     Thread.sleep(2000);
		     act.click().perform();
		   //as every multiple action use build then perform method to complete action
		     
		  // act.moveToElement(loginbutton).click().build().perform();//----case2
		//  act.click(loginbutton).perform();//case3-----
		    
		    
		    
	}

}