package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3_maxzimise_minimize {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			//driver.manage().window().maximize();
			driver.manage().window().minimize();
			

		}
		

	}


