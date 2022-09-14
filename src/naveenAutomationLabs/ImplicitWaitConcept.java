package naveenAutomationLabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); // launch chrome
		
		driver.manage().window().maximize(); // maximize windows
		
		driver.manage().deleteAllCookies(); // delete all cookies
		
		driver.get("https://jqueryui.com/droppable/");   // enter url
		
		// dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}

}
