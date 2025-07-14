package Crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowserTestDemo {
	WebDriver driver;
	//launch browser
	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			default:
				driver=null;
				break;
		}
	}
	//verifyTitle
	@Test
	public void verifyTitle()
	{
	driver.get("http://www.google.com");
	String ActualTile = driver.getTitle();
	Assert.assertEquals(ActualTile, "Google");
			
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
}
