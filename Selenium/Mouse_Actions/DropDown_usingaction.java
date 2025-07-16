package mouse_actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DropDown_usingaction {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
			//------------handle notification----------------
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(opt);
		    driver.get("https://www.facebook.com/");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		    Thread.sleep(1000);
		    WebElement day = driver.findElement(By.id("day"));
		    Thread.sleep(3000);
		    Actions act=new Actions(driver);
		    act.moveToElement(day).click().build().perform();
		    Thread.sleep(2000); 
		    act.sendKeys(Keys.ARROW_UP);
		    //  act.sendKeys(Keys.ENTER).perform();
		   // act.sendKeys(Keys.ARROW_DOWN);
		    for(int i=0;i<=10;i++)
		    {
		    	Thread.sleep(2000);
		    	act.sendKeys(Keys.ARROW_UP).perform();
		    }Thread.sleep(2000);
		    act.sendKeys(Keys.ENTER).perform();
		   // for(int i=0;i<=18;i++)
		   // {
		    //	act.sendKeys(Keys.ARROW_DOWN).perform();
		  //  }
	}

}
