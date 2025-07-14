package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class is_Enable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		//------------handle notification----------------
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	    driver.get("https://www.discoveryplus.in/");
	    driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	    Thread.sleep(3000);
	    WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
	    boolean result = element.isEnabled();
	    System.out.println(result);
	    driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("7777777");
	    
	    Thread.sleep(3000);
	    WebElement element1 = driver.findElement(By.xpath("//button[@type='submit']"));
	    boolean result1 = element1.isEnabled();
	    System.out.println(result1);

	if(result1==true)
	{
		System.out.println("Getotp is enabled");
	}
	else
	{
		System.out.println("create some issue");
	}
	
	}

}
