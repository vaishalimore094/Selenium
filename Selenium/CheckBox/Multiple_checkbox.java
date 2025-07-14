package multiple_checkbox_linkPages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multiple_checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		//------------handle notification----------------
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//how many check boxes
		
		System.out.println(CheckBoxes.size());
		
		// how to click on each check-box
		
				//1.for
				//2.iterator
				//3.for each
				//4.listIterator
		
		//click checkBox in Ascending Order
		
//		for(WebElement We:CheckBoxes)
//		{
//			Thread.sleep(1000);
//			We.click();
//		}
		
		//click checkBox in reverse Order
		
		for(int i=CheckBoxes.size()-1;i>=0;i--)
		{	Thread.sleep(1000);
			CheckBoxes.get(i).click();
		}
		
		
	}




	}


