package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataproviderexample {
	//1. India Qutubminar
	//2.Agra Tajmahal      //3 rows and 2 coloun
	//3.Hydrabad charminar
	@DataProvider(name="searchDataset")
	public Object[][] serchData()
	{
		Object[][]searchkeyword=new Object[3][2];
		searchkeyword[0][0]="India";
		searchkeyword[0][1]="Qutubminar";
		
		searchkeyword[1][0]="Agra";
		searchkeyword[1][1]="tajmahal";
		
		searchkeyword[2][0]="Hydrabad";
		searchkeyword[2][1]="Charminar";
		return searchkeyword;
				
		
	}
	@Test(dataProvider="searchDataset")
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
