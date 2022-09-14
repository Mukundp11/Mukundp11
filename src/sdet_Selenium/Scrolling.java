package sdet_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // maximize browser windows
		driver.get("https://www.tatamotors.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1. Scrolling by using pixel
		//js.executeScript("window.scrollBy(0,1000)","");
		
		//2.scrolling page till we find element
	//	WebElement motor=driver.findElement(By.xpath("//img[@class='img-responsive']"));
	//	js.executeScript("arguments[0].scrollIntoView();",motor);
		
		//3.scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
