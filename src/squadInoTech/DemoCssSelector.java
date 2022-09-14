package squadInoTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/");
		// tag and id===>Css----> tagname#valueOfid
		
		wd.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		// tag and attribute===>Css--->tagename[attribute=valueofattribute]
		wd.findElement(By.cssSelector("input[type=password]")).sendKeys("admin123");
		// tag and classname ====>Css---->tagname.valueOfclassname
		wd.findElement(By.cssSelector("input.button")).click();
		
		
	}
	
}
