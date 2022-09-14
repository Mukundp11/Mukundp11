package mukeshOtwani;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
		driver.get("https://learn-automation.com/launch-chrome-browser-using-selenium-webdrive");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
