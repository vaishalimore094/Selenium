package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidermethod1class {

	
		@Test(dataProvider="searchDataset",dataProviderClass=DataproviderMethod1.class)
		public void TestCasesGoolesearch(String country,String monomment)
		{
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.google.com");
			
			WebElement searchbox= driver.findElement(By.name("q"));
			searchbox.sendKeys(country + " "+monomment);
			
			driver.findElement(By.name("btnK")).submit();
		
		
		}

	}


	
