package day6_selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDifferentType {

	public static void main(String[] args) throws InterruptedException {
		
	//when to use n how //WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		/*WebElement username=driver.findElement(By.id("txtUsername"));
		
		System.out.println(username.isDisplayed());
		
		System.out.println(username.isEnabled());
		username.sendKeys("Admin");
           */
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			System.out.println("Login success");
		}
		else
		{
			System.out.println("login fail");
		}
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		if (driver.getCurrentUrl().contains("login"))
		{
			System.out.println("Logout Success");
		}
		else
		{
			System.out.println("Logout failed");
		}
		driver.quit();
	}

}
