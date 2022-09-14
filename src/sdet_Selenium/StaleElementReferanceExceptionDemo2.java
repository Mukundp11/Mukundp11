package sdet_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferanceExceptionDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("pavanoltraining");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("xyz");
		driver.navigate().refresh();
		
		
		try {
		username.sendKeys("pavanoltraning"); }
		catch(StaleElementReferenceException e) {
			username=driver.findElement(By.xpath("//input[@name='email']"));
			username.sendKeys("pavanoltraning");
		}
	}

}
