package com.selenium.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groww.in/mutual-funds");
		driver.findElement(By.xpath("//span[@class='rodal-close']")).click();
//		WebElement searchfield=driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
//		searchfield.sendKeys("mukund is hero");
		Thread.sleep(5000);
		driver.close();

	}

}
