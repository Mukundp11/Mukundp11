package naveenAutomationLabs;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // launch chrome
		
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://classic.freecrm.com/index.html?e=1");  // enter url
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");

	}

}
