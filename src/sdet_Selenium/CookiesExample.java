package sdet_Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		Set<Cookie> cookies = driver.manage().getCookies(); // capture all the cookies from the browser
		
		System.out.println("size of cookies:"+cookies.size()); // print size of cookies
		
		for(Cookie cookie:cookies) // read and print all the cookies
		{
			System.out.println(cookie.getName()+":"+cookie.getValue()); // prints name and value of cookies
			}
		//adding new cookies to browser
		Cookie cookieobj=new Cookie("mycookie123","123456");
		
		driver.manage().addCookie(cookieobj); // add new cookie to the browser
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies:"+cookies.size());
		
		for(Cookie cookie:cookies) // read and print all the cookies
		{
			System.out.println(cookie.getName()+":"+cookie.getValue()); // print name and value of cookies
		}
		
		// deleting cookie
		driver.manage().deleteCookie(cookieobj);
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies:"+cookies.size());
		driver.manage().deleteAllCookies(); //delete all the cookies
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies:"+cookies.size());  // 0
		driver.quit();
	}

}
