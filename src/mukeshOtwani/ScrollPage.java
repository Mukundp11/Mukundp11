package mukeshOtwani;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollPage {
	
	@Test
	public void scrollPageDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
	}

}
