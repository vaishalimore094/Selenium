package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
	
	

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
			//------------handle notification----------------
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.manage().window().maximize();
		    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		    Thread.sleep(2000);
		    WebElement doubleclickbutton = driver.findElement(By.xpath("//button[contains(text(),Double-Click)]"));
		    Actions act = new Actions(driver);
		   // act.moveToElement(doubleclickbutton).perform();
		   // act.doubleClick().perform();
		    //act.moveToElement(doubleclickbutton).doubleClick().build().perform();//---case1
		    //act.doubleClick(doubleclick).perform();//case--2
		    act.click(doubleclickbutton).doubleClick().perform();
		    

	}

}
