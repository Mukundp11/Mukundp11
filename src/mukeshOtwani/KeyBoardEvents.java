package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyBoardEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		

	}

}
