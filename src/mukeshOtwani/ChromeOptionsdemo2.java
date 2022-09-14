package mukeshOtwani;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptionsdemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-infobars");
		
		opt.merge(cap);
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://www.google.com");
	}

}
