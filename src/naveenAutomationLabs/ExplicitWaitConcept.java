package naveenAutomationLabs;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ExplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(30, );
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		clickon(driver,driver.findElement(By.xpath("//button[@id='u_0_9_oh']")),20); // login button
		clickon(driver,driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")),10);
		//driver.get("http://www.google.com");

	}
	
	public static void clickon(WebDriver driver,WebElement locator,int timeout) {
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
		
	}

}
