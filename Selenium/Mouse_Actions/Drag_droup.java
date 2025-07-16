package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_droup {
public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demo.guru99.com/test/drag_drop.html");
 Thread.sleep(2000);
		WebElement Source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions act=new Actions(driver);
		//act.moveToElement(Source).clickAndHold().moveToElement(dest).release().build().perform();
		act.dragAndDrop(Source, dest).perform();
		

	}

}
