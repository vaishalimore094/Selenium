package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 //capture cookies from browser
		 Set<Cookie>cookies=driver.manage().getCookies();
		 System.out.println("size of cookies:"+cookies.size());
		 
		 //print coockes frombrowser
		 for (Cookie cookie:cookies)
		 {
			 System.out.println(cookie.getName()+ " :"+ cookie.getValue());
		 }
			 
		   //add coockies to the browser
		 
		 Cookie cockieobj=new Cookie("mycoockie123","12345");
		 driver.manage().addCookie(cockieobj);
		 
		 cookies=driver.manage().getCookies();
		 System.out.println("Size of coockies after adding :"+cookies.size());
		 
		// delete specific cookies
		 driver.manage().deleteCookie(cockieobj);
		 driver.manage().deleteCookieNamed("mycoockie123");
		 cookies=driver.manage().getCookies();
		 System.out.println("Size of cookeis after deletion:"+cookies.size());
		 
		 
	}

}
