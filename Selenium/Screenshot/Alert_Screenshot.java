package Screenshot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alert_Screenshot {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Launc url

	driver.get("https://omayo.blogspot.com");
	
	//Click on alert
	
	driver.findElement(By.id("alert1")).click();
	   Robot robot =new Robot();
	   Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	   Rectangle rectangle=new Rectangle(d);//java.awt
	   BufferedImage image = robot.createScreenCapture(rectangle);
	   String dest=System.getProperty("user.dir")+"\\Screenshots\\robotalert.png";//C:\Users\VAISHALI\eclipse-workspace\selenium4\Screenshots
	   ImageIO.write(image,"png",new File(dest));
	   
	   //Handle alert
	   
	   Alert alert = driver.switchTo().alert();
	   alert.accept();
	   driver.close();
	}
	}


