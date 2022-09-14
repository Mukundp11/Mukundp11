package squadInoTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/");
		wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("admin");
		
		
		wd.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		
		//tagname[@attribute=valueofattribute]
		wd.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
	}
	

}
