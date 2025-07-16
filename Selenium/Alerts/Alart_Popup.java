package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart_Popup {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://demo.guru99.com/test/delete_customer.php");
			 Thread.sleep(2000);
			 driver.findElement(By.name("submit")).click();
    //--dont handled alrat popup and tried to next action -------unhandledAlartExpection
	// Thread.sleep(2000);
	// driver.findElement(By.name("res")).click();
			 
	//1======// ----we need to swich selenium focus from main page to alartpopup------
			 
			Alert alt=driver.switchTo().alert();
// Alert is an interface which contains only one use in attime
//1.accept()---use click on ok button
//2.dissmiss()--USe to click on cancle button
//3.gettext()---use to get text present
			
			
//----1..use first get text------call any method as par need
			System.out.println(alt.getText());
			//alt.accept();----------2. method
			//Thread.sleep(2000);
			//alt.accept();
			alt.dismiss();
			
	}

}//----we can not inspect alart popup
