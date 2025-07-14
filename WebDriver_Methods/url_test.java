package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//actual=expected
//get in browser= get in srs document
public class url_test {
            public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
			Thread.sleep(300);//dont have copy paste url
            String Actualurl=driver.getCurrentUrl();//thats why use getcurrenturl
      String expectedurl="https://www.facebook.com/";
      if(Actualurl.equals(expectedurl))
      {
    	  System.out.println("url is matching and tc is passed");
      }
      else {
    	  System.out.println("url is not matching so tc failed");
      }
	}

}
