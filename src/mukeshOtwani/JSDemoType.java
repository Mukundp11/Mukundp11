package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class JSDemoType {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://login.yahoo.com/");
		
		//driver.findElement(By.name("username")).sendKeys("randomgmail.com");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement email=driver.findElement(By.name("username"));
		
		js.executeScript("arguments[0].value='randomgmail.com'",email);
		
		Thread.sleep(3000);
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='persistent']"));
		js.executeScript("arguments[0].click()",checkbox);
	}

}
