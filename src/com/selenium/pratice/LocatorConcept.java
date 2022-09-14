package com.selenium.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.vivaahfashions.com/registration");
		// 1. xpath ---2
		// absolute xpath should not be used
		// only relative xpath should be used
		//driver.findElement(By.xpath("//*[@id=\"txtFname\"]")).sendKeys("tom");
		//driver.findElement(By.xpath("/html/body/form/div[4]/table/tbody/tr[2]/td[2]/input")).sendKeys("peter");
		//driver.findElement(By.xpath("/html/body/form/div[4]/table/tbody/tr[6]/td[2]/input")).sendKeys("ak street");
		
		// 2.id-----1
		//driver.findElement(By.id("txtFname")).sendKeys("Tom");
		//driver.findElement(By.id("txtLname")).sendKeys("peter");
		//driver.findElement(By.id("txtEmail")).sendKeys("sgs@gmail.com");
		
		//d 3.NAME
		driver.findElement(By.name("txtFname")).sendKeys("tom");
		driver.findElement(By.name("txtLname")).sendKeys("peter");
		
		//d 4.LINK this is only for links
		//driver.findElement(By.linkText("Login")).click();
		
		//d 5.PARTICAL LINK TEXT THIS IS NOT USEFUL
		//driver.findElement(By.partialLinkText("shipping")).click();
		
		//D 6. CSSSELECTOR-----2
		// if id is there...#{id}
		// if class is there .{class}
		//driver.findElement(By.cssSelector("#txtFname")).sendKeys("tom");
		//driver.findElement(By.cssSelector("#txtLname")).sendKeys("PETER");
		
		// D7.CLASS NAME ----4
		//driver.findElement(By.className("nameFld")).sendKeys("tom");
		//driver.findElement(By.className("nameLld")).sendKeys("peter");
		
		// 8.

	}

}
