package i_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.vctcpune.com/selenium/practice.html");
	    Thread.sleep(2000);
	    
	    //below element is present inside----no such element exception found
	  //  driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
	    
//1======//----we need to switch to selenium focus from mainpage to iframe------------//
	    
	    driver.switchTo().frame("iframe-name");//switching from webpage to iframe
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
	    
	    
	    
	    //---------we take practice page text on  main page----//
	    //below element present in mainpge inside----nosuchelement exception
	   // System.out.println(driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText());
	    
//2========  //---- we need to work again on main page------------//
	        //-----we need to switch to from i frame to main page---//
	    
	   // driver.switchTo().parentFrame();//switch to immidate parent e.x---10 page then back is 9 th page
	    driver.switchTo().defaultContent();//always switch to main page use ---2 page auomatic back main page
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText());
	    
	    
	    
	    

	}

}
