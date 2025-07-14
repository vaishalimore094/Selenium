package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class ismultile_Droupdown {
	//in droupdown , first we are to check select tagname is present or not if present then
	//we are handle the droupdown by using select class
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		Thread.sleep(3000);
		//1.identify listbox to be handled and store in reference variable
		// we are handle date
		
		WebElement Day_list=driver.findElement(By.name("birthday_day"));
		 Select sd=new Select(Day_list);// create select is class
          sd.selectByValue("12");
          Thread.sleep(3000);
          sd.selectByValue("16");
          Thread.sleep(3000);
          sd.selectByValue("22");
          
          
          //check if that element is multiple selectable
          
          System.out.println(sd.isMultiple());//will return true or false
          
          // to gettext of first select value------------
          
          System.out.println(sd.getFirstSelectedOption().getText());
          
     
     
        		  
     //-------is multiple selectlable is false bcz it is mnot selected multiple--   		  
		
		}
		

}
