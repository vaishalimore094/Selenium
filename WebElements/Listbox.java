package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://techcanvass.com/Examples/multi-select.html");
	   WebElement listbox = driver.findElement(By.id("multiselect"));
        Select s1=new Select(listbox);//create object class
        System.out.println(s1.isMultiple());//check multiple selectable or not
        s1.selectByIndex(0);
        Thread.sleep(1000);//select
        s1.selectByIndex(1);
        Thread.sleep(1000);
        s1.selectByIndex(2);
        Thread.sleep(1000);
        s1.selectByIndex(3);
        
      //  s1.deselectAll();//decelect all
        s1.deselectByIndex(2);//decelect by one using index
        Thread.sleep(1000);
        s1.deselectByValue("suzuki");//select by value
        Thread.sleep(1000);
        s1.deselectByVisibleText("Audi");//select by text
        Thread.sleep(1000);
	}

}
