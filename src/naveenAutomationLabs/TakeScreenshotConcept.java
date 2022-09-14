package naveenAutomationLabs;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import org.openqa.selenium.WebDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		// take screenshot and store as a file format 
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyfile //method
		FileHandler.copy(src,new File("C:\\Users\\mukund\\eclipse-workspace\\SeleniumProject\\src\\naveenAutomationLabs/google.png"));
	
		//driver.close();
		

	}

}
