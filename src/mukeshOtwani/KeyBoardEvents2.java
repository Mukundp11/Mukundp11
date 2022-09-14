package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class KeyBoardEvents2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.linkText("Create New Account")).click();
		//driver.findElement(By.name("firstname")).sendKeys("selenium");
		Actions act=new Actions(driver);
		
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("webdriver")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("8888888888")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("password")
		.build().perform();

	}

}
