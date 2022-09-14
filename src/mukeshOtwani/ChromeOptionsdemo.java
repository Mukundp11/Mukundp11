package mukeshOtwani;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsdemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
	//	opt.addExtensions(new File(""));
		
		option.addArguments("disable-infobars");
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://www.google.com");
		
	}

}
