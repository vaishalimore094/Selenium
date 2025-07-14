package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {//title are use 

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(300);
			//driver.getTitle();
		
    // System.out.println(driver.getTitle());//---type1
//webpage open //--but see the print in console
			 String Title=driver.getTitle();//return string
			 System.out.println("title is "+Title);
			 
			 //to store ref variable title name in string	 
	}

}
