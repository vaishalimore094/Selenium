package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrent_url {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());//;---type1
		//String url= driver.getCurrentUrl();
		//System.out.println("current url is "+url);

	}//geturl method of webdriver and works on browser

}
