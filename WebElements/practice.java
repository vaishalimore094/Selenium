package webelements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","path");
		WebDriver driver=new ChromeDriver();
		driver.get("url");
		 
	}

}
