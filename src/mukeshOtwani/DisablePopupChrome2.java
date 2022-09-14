package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
public class DisablePopupChrome2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://www.google.com");
		

	}

}
