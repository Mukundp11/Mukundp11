package day1_selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) {
		/*
		 *  browser navigation
		 */
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		/*Options opt=driver.manage();
		
		 Window win=opt.window();
		 win.maximize();
		 */
		
		driver.get("http://google.com");
		
		driver.get("http://www.facebook.com");
		
		driver.get("http://www.linkedin.com");
		
	//	System.out.println(driver.getTitle());
		
	//  driver.quit();
		
	//	ChromeDriver driver1=new ChromeDriver();
		
	//	driver1.get("http://twitter.com");
		
	//	System.out.println(driver.getTitle());
		
	//	driver1.close();
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();

	}

}
