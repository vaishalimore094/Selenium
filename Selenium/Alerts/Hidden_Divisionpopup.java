package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Divisionpopup {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z' ]")).click();

	}
//---------colourfull
//--inspect
//--by using inspect we can handle of this popup..no need to switch 
}
