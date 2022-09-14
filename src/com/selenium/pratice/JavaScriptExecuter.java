package com.selenium.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		String sendkeys="arguments[0].setAttribute('value','mukund')";
		WebElement search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		j.executeScript(sendkeys, search);
		WebElement mobile=driver.findElement(By.xpath("//div[text()='Mobiles']"));
		
		//double a=200.5d;
		// int b=(int)a;
		
		String click="arguments[0].click()";
		j.executeScript(click,mobile );

	}

}
