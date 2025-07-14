package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText());

		}//get text only use get text in webpage and display output of console 
		

	


	}


