package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class webelement_Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Launc url

	driver.get("https://omayo.blogspot.com");
	WebElement loginsection = driver.findElement(By.id("Blog1"));
	File srcfile = loginsection.getScreenshotAs(OutputType.FILE);
	File Dist=new File("D:\\Screenshots\\Section4.png");
    //     FileUtils.copyFile(Source, Dist);
         FileHandler.copy(srcfile, Dist);
	}

}
