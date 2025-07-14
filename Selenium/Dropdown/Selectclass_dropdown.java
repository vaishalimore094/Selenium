package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		 //launch chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//launch url
		
		driver.get("https://myudyogaadhar.org/");
		Thread.sleep(2000);
		 WebElement state = driver.findElement(By.id("office_state"));
		 Select s=new Select(state);
		//s.selectByVisibleText("ANDHRA PRADESH");
		//s.selectByValue("ARUNACHAL PRADESH");
		s.selectByIndex(0);
		
		//check ismultiple select droupdown 
		
		
		if(s.isMultiple())
		{
			System.out.println("droupdown is multiple");
			
		}
		else
		{
			System.out.println("droupdown is not multiple");
		}
		
		//print all options
		
		
		 List<WebElement> getalldroupdownoptions = s.getOptions();
		 System.out.println("Total options  :"+getalldroupdownoptions.size());
		 for(WebElement el:getalldroupdownoptions)
		 {
			 System.out.println(el.getText());
		 }
				 
	}

}
