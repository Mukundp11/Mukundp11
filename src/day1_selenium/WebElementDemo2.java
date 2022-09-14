package day1_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo2 {

	public static void main(String[] args) {
		
	//when to use n how //WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		/*WebElement username=driver.findElement(By.id("txtUsername"));
		
		System.out.println(username.isDisplayed());
		
		System.out.println(username.isEnabled());
		username.sendKeys("Admin");
           */
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//driver.close();
	}

}
