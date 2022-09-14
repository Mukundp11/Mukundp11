package day1_selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartChrome {

	public static void main(String[] args) {
		
		/**
		 * 
		 * ChromeDriver
		 * FirefoxDriver
		 * EdgeDriver
		 * SafariDriver
		 * OperaDriver
		 * 
		 * /**
		 * pre define properties for browser
		 * 
		 * webdriver.chrome.driver
		 * 
		 * webdriver.geck.driver
		 * 
		 * webdriver.edge.driver
		 * 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://learn-automation.com");
		
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
