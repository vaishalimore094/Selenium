package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		//------------handle notification----------------
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
    Thread.sleep(2000);
    
 // ----identify dropdown to be handled and store in it ref variable-------
    
              WebElement day = driver.findElement(By.id("day"));
              Thread.sleep(3000);
    
   //----------create object of select class which will accept webelement as argument
              
                  //---select s=new select (status)
    
                  Select s=new Select(day);//create a select class
    
 //-------There are 3 main methods in select class to handle dropdown
 //1.----select by visibleText :select by visible text(string arugs)
 //2.----select by index :select by index(int arguments)
 //3.----select by value : select by value(String arguments)   
    
                   s.selectByVisibleText("12");//----------select by visiable text
                   Thread.sleep(4000);
                   
                   
                   WebElement month = driver.findElement(By.name("birthday_month"));
                    Select s1=new Select(month);
                  //  s1.selectByVisibleText("May");------------------select by text
                    s1.selectByIndex(4);//---------------------select by index
                   Thread.sleep(4000);
                   
              // -------------to printlistof month------to use getoptions method-------------------
                   
                   List<WebElement> months = s1.getOptions();
                   System.out.println(months.size());//------------to get size -------
                  for( int i=0;i<=months.size()-1;i++)
                {
	             System.out.println(months.get(i).getText());  
                }
                  
    WebElement year = driver.findElement(By.id("year"));
    Select s2=new Select(year);
    s2.selectByValue("1994");//select by value
    List<WebElement> years = s2.getOptions();
     System.out.println(years.size());
     for(int i=0;i<=years.size()-1;i++)
    {
	System.out.println(years.get(i).getText());
	}
    
    
    
    
    

	}  
	

}
