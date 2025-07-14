package Screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FullPage_Screenshot_AShotAPI {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Launc url

	driver.get("https://omayo.blogspot.com");
	//Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
//	String dest=System.getProperty("user.dir")+"\\Screenshots\\fullpagechrome.png";
//	ImageIO.write(screenshot.getImage(),"png",new File(dest));
	
	
	}
	}