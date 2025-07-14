package UploadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Byusing_Robotclass {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		 //launch chrome browser
		WebDriver driver=new ChromeDriver();
//maximise browser
		driver.manage().window().maximize();
//waits
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//launch url
		driver.get("https://demoqa.com/upload-download");
		
//prform action for click	
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).click();--------not work
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));///--work
		Actions action=new Actions(driver);
		action.moveToElement(button).click().perform();
//create robot class		
		Robot rb=new Robot();
		rb.delay(2000);
		
///copy file to clipboard
		StringSelection ss=new StringSelection("C:\\Users\\VAISHALI\\Desktop\\VaishaliVishwasMore_Fresher.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//perform control+v action
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
//Enter key press
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		

}

	}


