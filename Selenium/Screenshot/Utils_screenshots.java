package Screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;




public class Utils_screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Launc url

	driver.get("https://omayo.blogspot.com");
	
	         File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	              File Dist=new File("D:\\Screenshots\\s.png");
	            // FileUtils.copyFile(Source, Dist);
	            FileHandler.copy(Source, Dist);
	              
	}

}
