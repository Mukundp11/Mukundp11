package com.selenium.pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  // delete All the Cookies 
		
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//driver.get("http://www.half.ebay.com"); // enter url
		driver.get("http://www.vivaahfashions.com/registration");
		driver.findElement(By.xpath("//input[@Class='nameFld']")).sendKeys("java");

	}

}
