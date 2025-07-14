package UploadFile;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byusing_sendKeys {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
			 //launch chrome browser
			WebDriver driver=new ChromeDriver();
	//maximise browser
			driver.manage().window().maximize();
	//waits
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	//launch url
			driver.get("https://demoqa.com/upload-download");
	//find element and choose file		
			
			driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\VAISHALI\\Desktop\\VaishaliVishwasMore_Fresher.pdf");
			
			
			

	}

}
