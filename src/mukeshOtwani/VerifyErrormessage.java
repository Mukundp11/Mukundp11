package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyErrormessage {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		driver.findElement(By.xpath("//*[@id='next']")).click();
		
		Thread.sleep(2000);
		
		String actual_error=driver.findElement(By.xpath("//*[@id='errormsg_0_Email']")).getText();
		
		String expected_error="Please enter your email.";
		
		//type1
		Assert.assertEquals(actual_error, expected_error);
		
		//type2
		Assert.assertTrue(actual_error.contains("Please enter your email"));
		
		System.out.println("Test Completed");
		
		
	
	}

}
