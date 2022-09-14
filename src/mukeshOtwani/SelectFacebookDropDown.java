package mukeshOtwani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SelectFacebookDropDown {

	//public static void main(String[] args) {
		
		public void selectDDValues ()
		{
		//	System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("Create New Account")).click();
					

			WebElement month_dropdown=driver.findElement(By.xpath("//select[@title='Month']"));
			
			Select month_dd=new Select(month_dropdown);
			
			month_dd.selectByIndex(3);
			
			month_dd.selectByValue("10");

		}}


