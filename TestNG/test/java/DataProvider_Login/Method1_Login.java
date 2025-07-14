package DataProvider_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Method1_Login {
	@Test(dataProvider="logintestData")
	public void TestLogin(String Username,String PAssword)
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("texUsername")).sendKeys(Username);
		driver.findElement(By.id("texPassword")).sendKeys(PAssword);
		driver.findElement(By.id("btnLogin")).click();
	}
		@DataProvider(name="logintestData")
		public Object[][]loginData(){
			Object[][]data=new Object[2][2];
			data[0][0]="Admin";
			data[0][1]="Admin123";
			
			data[1][0]="Adimin1";
			data[1][1]="taj";
			
			
			return data;
					
			
		}
			
		
}
