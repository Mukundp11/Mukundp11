package com.selenium.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Actions a=new Actions(driver);
		WebElement company=driver.findElement(By.xpath("//a[@title='Explore top companies hiring on Naukri']"));
		a.moveToElement(company).build().perform();
		Thread.sleep(5000);
		WebElement jobs=driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		//a.moveToElement(jobs).build().perform();
		a.contextClick(jobs).build().perform();
		
		//driver.close();

	}

}
