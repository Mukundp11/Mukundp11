package naveenlabTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest()
	{
	     String	title=driver.getTitle();
	     System.out.println(title);
	}	
	
	@Test(priority=3,groups="Logo")
	public void googlelogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	@Test(priority=2,groups="Link Test")
	public void maillinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("test3");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}