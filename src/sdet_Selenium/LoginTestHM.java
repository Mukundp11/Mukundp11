package sdet_Selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestHM {
	
	static HashMap <String, String> logindata(){
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("x","mercury@mercury");
		hm.put("y","mercury@mercury1");
		hm.put("z","mercury@mercury2");
		return hm;
		
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// login as x
		String credentials = logindata().get("x");
		
		String arr[]=credentials.split("@"); // mercury mercury
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(arr[0]);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(arr[1]);
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		// validation
		if (driver.getTitle().equals("OrangeHRM:mercury:")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		

		
	}

}
