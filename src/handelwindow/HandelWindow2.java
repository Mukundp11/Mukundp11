package handelwindow;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Set;

public class HandelWindow2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("parent window id is"+parent);
		
		Set<String> allwindows=driver.getWindowHandles();
		
		ArrayList<String> tabs=new ArrayList<>(allwindows);
		
		driver.switchTo().window(tabs.get(2));
		
		driver.close();
		driver.switchTo().window(tabs.get(1));
		
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		
		System.out.println("title of parent window is"+driver.getTitle());
		

	}

}
