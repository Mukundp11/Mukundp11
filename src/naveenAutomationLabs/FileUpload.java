package naveenAutomationLabs;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class FileUpload {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("");
		
		
	

	}

}
