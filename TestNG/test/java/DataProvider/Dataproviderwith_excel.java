package DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderwith_excel {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}
	    @Test(dataProvider="dataprovidersearch")
		public void Searchkeyword(String keyword)
		{
			WebElement searchbox = driver.findElement(By.name("q"));
			searchbox.sendKeys(keyword);
			searchbox.sendKeys(Keys.ENTER);
		}
	    @DataProvider(name="dataprovidersearch")
	    public Object[][] searchdataprovidermethod() throws EncryptedDocumentException, IOException 
	    {
//	    	Object[][] searchData=new Object[2][1];
//	    	searchData[0][0]="Taj Mahal";
//	    	searchData[1][0]="India Gate";
	    	String filename="E:\\AutomationDataDriven_Freamwork\\DataproviderExceldata.xlsx";
	    	
	    	
			 String[][] searchData = getexceldata(filename,"Sheet1");
			
			return searchData;
	    }
	   
		public String[][]getexceldata(String filename,String sheetName) throws EncryptedDocumentException, IOException
	    {
	    	String[][]data=null;//array declare
	    	try {
				FileInputStream inputStream=new FileInputStream(filename);
				 Sheet excelsheet = WorkbookFactory.create(inputStream).getSheet(sheetName);
				 
				 int ttlrow = excelsheet.getLastRowNum()+1;//get totle rows
				 int ttlcoloumn=excelsheet.getRow(1).getLastCellNum();
				 //initilise array
				 data=new String[ttlrow-1][ttlcoloumn];
				 for(int i=1;i<ttlrow;i++)
				 {
					 for(int j=0;j<ttlcoloumn;j++)
					 {
						 data[i-1][j]=excelsheet.getRow(i).getCell(j).getStringCellValue();
					 }
				 }
				         
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			return data;
	    }
	@AfterMethod	
	public void closebrowser()
	{
		driver.quit();
	}

}
