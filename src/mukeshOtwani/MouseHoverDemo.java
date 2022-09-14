package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseHoverDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement ele=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		int total_count=links.size();
		
		for(int i=0;i<total_count;i++)
		{
			WebElement element=links.get(i);
			
			String text=element.getAttribute("innerHTML");
			
			boolean status=element.isEnabled();
			
			System.out.println("Link name is "+text+"and the link status is"+status);
			
			if(text.equalsIgnoreCase("Appium"))
			{
				element.click();
				break;
			}
		}
		
		

	}

}
