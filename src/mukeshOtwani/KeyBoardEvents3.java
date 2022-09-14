package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyBoardEvents3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/key_presses?");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ESCAPE).perform();
		
		if(driver.findElement(By.xpath("//p[@id='result']")).getText().contains("ESCAPE"));
		{
			System.out.println("KEY PRESSED");
		}

	}

}
