package squadInoTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","");
		WebDriver wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/");
		
		wd.findElement(By.id("txtUsername")).sendKeys("admin");
		
		
		
	}

}
