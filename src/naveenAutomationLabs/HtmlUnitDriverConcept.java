package naveenAutomationLabs;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver(); // launch chrome
		
		//HtmlUnitdriver is not available in selenium 3.x version.
		//htmlunitdriver ---to use this concept,we need to download HtmlUnitdriver JAR file
		
		// advantages:
		//1.testing is happening behind the scene-- no browser is launched
		//2.very fast -- execution of test cases--very fast--performance of the script
		//3.not suitable for action class--user action--mousemovement,doubleclick,drag and drop
		//4.Ghost driver--Headless browser
		   // --HtmlUnit Driver--jAVA
		   // --PhantomJS--javascript
		WebDriver driver=new HtmlUnitDriver();
		
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies();  // delete all cookies
		
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		System.out.println("Before login, title is: "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a")).click();
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.linkText("Login")).click();
		System.out.println("After login,title is "+driver.getTitle());

	}

}
