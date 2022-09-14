package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DoubleClickExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://api.jquery.com/dblclick");
		
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();
		
		System.out.println(driver.getTitle());

	}

}
