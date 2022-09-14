package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class VerifyLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		//List<WebElement> links = driver.findElement(By.tagName("a"));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are"+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
		
		}}
	public static void verifyLinkActive(String linkUrl)
	{
		try {
		
			URL url=new URL(linkUrl);
			
			HttpURLConnection a=(HttpURLConnection)url.openConnection();
			
			a.setConnectTimeout(3000);
			
			a.connect();
			
			if(a.getResponseCode()==200)
			{System.out.println(linkUrl+"-"+ a.getResponseMessage());}
			
			if(a.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				
				System.out.println(linkUrl +"-"+a.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);}
			}
		 catch (Exception e) {}
	}}


