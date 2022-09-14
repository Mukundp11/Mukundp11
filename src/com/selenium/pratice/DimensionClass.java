package com.selenium.pratice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension d=new Dimension(1000,1000);
		driver.manage().window().setSize(d);
		Point p=new Point(400,0);
		driver.manage().window().setPosition(p);
		driver.get("https://www.flipkart.com/");
		

	}

}
