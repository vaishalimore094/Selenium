package Radio_button;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		 //launch chrome browser
		WebDriver driver=new ChromeDriver();
//maximise browser
		driver.manage().window().maximize();
//waits
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//launch url
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		// find radio buttons on webpage
		 
		List<WebElement> radiobuttonList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		//Total number of radio buton
		
		System.out.println("Total number of radio buttons on webpage :" +radiobuttonList.size());
		
		
		//close browser
		driver.close();
	}

}
