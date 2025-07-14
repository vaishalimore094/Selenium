package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_navigate {

		public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
			
				//driver.get("https://www.google.com/");----use only cuttent tab
                Thread.sleep(300);//script pause for 300milisecond
				driver.navigate().to("https://www.google.com/");
				Thread.sleep(400);
				driver.navigate().back();
				Thread.sleep(500);
				driver.navigate().forward();
				Thread.sleep(500);
				 driver.navigate().refresh();

}//----navigate--means moving the next place(first time u have someplace then goes next place)
		
}//--get--u r going first time open(no any history back)
// open multiple navigate
