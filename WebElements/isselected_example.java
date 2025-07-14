package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class isselected_example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		//------------handle notification----------------
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
		     driver.findElement(By.xpath("(//a[@ role='button'])[2]")).click();
			Thread.sleep(2000);
			 WebElement Maleradio = driver.findElement(By.xpath("//input[@value='2']"));
			boolean result=Maleradio.isSelected();
			System.out.println("male rdio is selected  :"+result);
			//driver.findElement(By.xpath("//input[@value='2']")).click();
			//boolean Result1=Maleradio.isSelected();
			//System.out.println("Male radio is selected now  :"+Result1);
			
			if(result==true)
			{
			System.out.println("radio button is already selected thank u");
				
		}
			else
			{
				Maleradio.click();
				boolean Result1=Maleradio.isSelected();
				System.out.println("Male radio is selected now :"+Result1);
				if(Result1==true) {
					System.out.println("radio button is selected");
					}
				else
				{
					System.out.println("there is some issue please check");
		}
			}
			

	}

}
