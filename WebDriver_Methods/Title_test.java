package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_test {

	public static void main(String[] args) {
	//use of get url and title
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			//Actual url means opened in browser
			//dont have copy paste url
      String ActualTitle=driver.getTitle();//thats why use getcurrenturl
      String expectedTitle="Facebook-log in or sign up";
      //expected url is given is SRS
      if(ActualTitle.equals(expectedTitle))
      {
    	  System.out.println("Title is matching and tc is passed");
      }
      else {
    	  System.out.println("Title is not matching so tc failed");
    	  driver.close();
      }
	}


	}


