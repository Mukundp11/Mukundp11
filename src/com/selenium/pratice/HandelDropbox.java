package com.selenium.pratice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelDropbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.vivaahfashions.com/registration");
		
		// handel a drop box
		
		Select select=new Select(driver.findElement(By.id("ddlCountry")));
		select.selectByVisibleText("india");
		
	}

}
