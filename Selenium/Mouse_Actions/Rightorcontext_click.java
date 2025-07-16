package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightorcontext_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    Thread.sleep(2000);
	    Actions act = new Actions(driver);
	    WebElement rightclickhere = driver.findElement(By.xpath("//span[text()='right click me']"));
	   Thread.sleep(2000);
	   act.moveToElement(rightclickhere).contextClick().build().perform();
	  // act.contextClick(rightclickhere).click().perform();
	 // WebElement clickedit = driver.findElement(By.xpath("//span[text()='Edit']"));
	 // act.click(clickedit).click().perform();
	   

	}

}
