package hyperlink_Brokenlink;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium setup\\chromedriver-win32\\chromedriver.exe");
		 //launch chrome browser
		WebDriver driver=new ChromeDriver();
//maximise browser
		driver.manage().window().maximize();
//waits
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//launch url
		driver.get("http://www.deadlinkcity.com/");
//find hyperlink
		List<WebElement> linkedlist = driver.findElements(By.tagName("a"));
//print total link
		System.out.println("totallinkk on page  :"+linkedlist.size());
		
		int responcecode=200;// 2xx  responce code is valid link
		int countbrokenlink=0;
//print overall URL link
		for(WebElement el:linkedlist)
		{
			String url = el.getAttribute("href");
			try 
			{
				URL urllink=new URL(url);
				HttpURLConnection huc=(HttpURLConnection)urllink.openConnection();//open uRl bye using HTTP connection
				huc.setRequestMethod("HEAD");//sed req of link
				huc.connect();//connect link
				
				//check responce code
				responcecode=huc.getResponseCode();
				if(responcecode>=400)
				{
					System.out.println(url+ "brokenlink");
					countbrokenlink++;
				}
			}
			catch(MalformedURLException e)
			{
			}
			catch(Exception e)
			{
				
			}
			
		}
		System.out.println("total broken link  :"+countbrokenlink);
	}

}
