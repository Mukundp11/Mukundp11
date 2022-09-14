package handelwindow;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandelWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		
		String parent=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		 
		 int count=allwindows.size();
		 
		 System.out.println("Total window"+count);
		 
		 for(String child:allwindows)
		 {
			 if(!parent.equalsIgnoreCase(child))
			 {
				 driver.switchTo().window(child);
				 
				 driver.findElement(By.name("q")).sendKeys("selenium webdriver");
				 
				 Thread.sleep(3000);
				 
				 driver.close();
			 }
		 }
		 driver.switchTo().window(parent);
		 System.out.println("parent window title is"+driver.getTitle());
		 

	}

}
