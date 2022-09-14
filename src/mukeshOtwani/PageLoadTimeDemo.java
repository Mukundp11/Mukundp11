package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
public class PageLoadTimeDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts time = driver.manage().timeouts();
		time.pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//driver.get("http://google.com");
		
		driver.get("http://learn-automation.com/launch-chrome-browser-using-selenium-webdriver/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
