package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class JSforClick {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://login.yahoo.com/");
		
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]")).click();
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeAsyncScript("document.getElementById('persistent').click()");
	}

}
