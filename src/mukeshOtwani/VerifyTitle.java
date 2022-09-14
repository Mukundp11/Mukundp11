package mukeshOtwani;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyTitle {

	
	
	@Test 
	public void verifyApplicationTitle()
	{
	//	System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/");
		
		// actual title
		String my_title=driver.getTitle();
		
		System.out.println("Title is"+my_title);
		
		String expected_title="Selenium Webdriver Tutorials- Free Selenium ";
		
	//	Assert.assertEquals(my_title, expected_title);
		
		Assert.assertTrue(my_title.contains("Selenium Webdriver Tutorials"));
		
		System.out.println("Test completed");
	}
	
	

}
