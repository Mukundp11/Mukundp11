package squadInoTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://blazedemo.com/");
		
		Select from=new Select(wd.findElement(By.name("fromPort")));
		//from.selectByIndex(1);
		//from.selectByValue("Portland");
		from.selectByVisibleText("Boston");
		
		Select to =new Select(wd.findElement(By.name("")));
		to.selectByIndex(0);
		to.selectByValue("");
		to.selectByVisibleText("");
		
		
		
		
		
	}

}
