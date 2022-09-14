package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DragDropDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.xpath("//span[text()='Thrillers']"));
		WebElement dest=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		act.clickAndHold(src)
		.pause(Duration.ofSeconds(2))
		.moveToElement(dest)
		.pause(Duration.ofSeconds(2))
		.release()
		.build()
		.perform();

	}

}
