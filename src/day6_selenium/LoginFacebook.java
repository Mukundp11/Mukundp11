package day6_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("mukund");
		
		driver.findElement(By.name("lastname")).sendKeys("puyad");
		
		driver.findElement(By.name("reg_email__")).sendKeys("abc@123");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("123abc");
		
		Select month=new Select(driver.findElement(By.name("birthday_day")));
		
		System.out.println("current value is"+month.getFirstSelectedOption().getText());
		
		// 1st 
		month.selectByIndex(3);
		
		Thread.sleep(4000);
		
		// 2nd
		month.selectByValue("19");
		
		Thread.sleep(4000);
		
		//3rd
		month.selectByVisibleText("30");
		
		List<WebElement> allvalues=month.getOptions();
		
		for(WebElement ele:allvalues)
		{
			System.out.println(ele.getText());
			
			if(ele.getText().equals("15"))
			{
				System.out.println("value is available");
				
				break;
			}
		}
		
		//tagname[text function()='text which we have to find']
		// example
		// label[text()='Male']
		// a[text()='click here']
		// input[text=()='Mukund']
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
