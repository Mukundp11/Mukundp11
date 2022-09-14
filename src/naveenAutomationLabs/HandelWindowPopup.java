package naveenAutomationLabs;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandelWindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(" ");
		
		driver.findElement(By.xpath(" ")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		
		System.out.println("parent window id"+parentWindowId);
		
		String childWindowId = it.next();
		
		System.out.println("child window id"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("child window pop up title"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("parent window title"+driver.getTitle());
		

	}

}
