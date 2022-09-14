package naveenlabTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"env","browser","url","emailId"})
	public void yahooLoginTest(String env,String browser,String url,String emailId) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		} else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");	
			driver=new FirefoxDriver();
		
		}
		driver.get(url);
	//	driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId); // enter username
		driver.findElement(By.xpath("//input[@id='login-signin']")).click(); // click on next button
		
	}

}
