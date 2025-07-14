package ListenersStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListenersStudy.Listenersclass.class)
public class ListenersDemoTestclass {
 
	@Test
	public void login() throws InterruptedException, IOException
	{
		//chromedriver sertup
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		//find username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//findpassword
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//clickon login buttton
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	@Test
		public void screenshot(WebDriver driver, String TCID) throws IOException
		{
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("E:\\AutomationDataDriven_Freamwork\\Maven_freamworkScreenshot\\photo"+TCID+".png ");
		FileHandler.copy(Source,dest);
		
	}
	
	      
		

	
	@Test
	public void testfail()
	{
		System.out.println("failed testcases");
		Assert.assertTrue(false);
	}
	@Test
	public void skipped()
	{
		System.out.println("skipped testcases");
		throw new SkipException("skip expection thrown------");
	}
}
