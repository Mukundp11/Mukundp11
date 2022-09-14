package sdet_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferanceExceptionDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pavantestingtools.com/");
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Online Training']"));
		link.click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		try {
		
		  link.click();
		}
		catch(StaleElementReferenceException e) {
			link=driver.findElement(By.xpath("//a[text()='Online Training"));
			link.click();
		}
	}

}
