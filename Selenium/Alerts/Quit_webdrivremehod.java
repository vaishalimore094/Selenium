package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Quit_webdrivremehod {

		public static void main(String[] args) throws InterruptedException {
				 System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
				 ChromeOptions options=new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 
				 
				 WebDriver driver=new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get("https://skpatro.github.io/demo/links/");
				 Thread.sleep(2000);
				 driver.findElement(By.name("NewWindow")).click();
				 Thread.sleep(2000);
				 //driver.close();
				 driver.quit();
			

}
}		
