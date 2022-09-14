package naveenAutomationLabs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("C:\\Users\\mukund\\eclipse-workspace\\SeleniumProject\\src\\naveenAutomationLabs\\config.properties");
		
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url=prop.getProperty("URL");
		System.out.println(url);
		
		String browserName=prop.getProperty("browser") ;
		
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver(); // launch chrome
		}
		else if(browserName.equals("FF"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver_win32\\internetexplorerdriver.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("CreateNewAccount_xpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.linkText(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys("email");
	}

}
