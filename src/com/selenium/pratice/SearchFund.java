package com.selenium.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFund {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://groww.in/mutual-funds");
		driver.findElement(By.xpath("//span[@class='rodal-close']")).click();
		driver.findElement(By.xpath("//input[@id='globalSearch23']")).sendKeys("tata digital fund");
		//driver.findElement(By.xpath("//*[@id=\"suggestionstata-digital-india-fund-direct-growth\"]/div[2]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='sipSliderThumb sipSliderThumb-0 ']")).sendKeys(Keys.ENTER);
		

	}

}
