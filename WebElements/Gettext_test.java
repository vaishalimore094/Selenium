package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Gettext_test {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps ')]")).getText());
			String Actualtext = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps ')]")).getText();

			String ExpectedText = "Facebook helps you connect and share with the people in your life.";
			
			if(Actualtext.equals(ExpectedText))
			{
				System.out.println("tc is passed");
			}
			else
			{
				System.out.println("Tc is failed");
			}
				
				
				
			}


	}


