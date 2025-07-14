package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_position {
public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 Point d=new Point(300,600);//width,height
 driver.manage().window().setPosition(d);
 System.out.println(driver.manage().window().getPosition());
 //driver.manage().window().maximize();

	}

}
	