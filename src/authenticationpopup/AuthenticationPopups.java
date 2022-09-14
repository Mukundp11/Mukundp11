package authenticationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.get("https://the-internet.herokuapp.com/basic_auth"); //https://the-internet.herokuapp.com/basic_auth
		
		// https://username:password@test.com
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
		
		
		

	}

}