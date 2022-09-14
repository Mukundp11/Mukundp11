package sdet_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		// Initate driver
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximize page
		driver.manage().window().maximize();
		
		// implicit wait for 10 sec
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// open URL of app
		driver.get("https://www.amazon.com/");
		
		// capture links from a webpage
		 List<WebElement> links = driver.findElements(By.name("a"));
		// number of links
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) { 
			
			int element=links.size();
		
			
		}
		
		
	}

}
