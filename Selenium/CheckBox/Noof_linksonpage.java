package multiple_checkbox_linkPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Noof_linksonpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		//------------handle notification----------------
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		//List<WebElement> Links = driver.findElements(By.tagName("a"));
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		//how many links are there
		System.out.println("Total number of links are "+Links.size());
		
		// what are those links 
		//1.for
		//2.iterator
		//3.for each
		//4.listIterator
		
		for(WebElement w:Links)
		{
			System.out.println(w.getText());
		}
		
	}

}



