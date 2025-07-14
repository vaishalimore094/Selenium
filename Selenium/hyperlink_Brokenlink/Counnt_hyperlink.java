package hyperlink_Brokenlink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counnt_hyperlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		 //launch chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://www.calculator.net/");
	
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		//find size
		System.out.println("Toatal links of webpags   :" +alllinks.size());
		
		//print all links
		 for(WebElement el:alllinks)
		 {
			 System.out.println(el.getText());
		
	    }

}
}

