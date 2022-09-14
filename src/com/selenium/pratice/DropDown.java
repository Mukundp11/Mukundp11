package com.selenium.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		//driver.findElement(By.xpath("//input[@name="firstname"]").sen
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("mukund");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("puyad");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("mpuyad@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("face@100");
		
		// select class will be used for handling drop down
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		//s.selectByVisibleText("21");
		//s.selectByIndex(0);
		s.selectByValue("20");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("May");
		//driver.findElement(By.)
		WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		gender.click();
	}

}
