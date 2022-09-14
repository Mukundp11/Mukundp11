package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
public class SetScriptTimeout {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://learn-automation.com/launch-chrome-browser-using-selenium-webdriver/");
		
		driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
