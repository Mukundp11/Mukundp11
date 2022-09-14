package mukeshOtwani;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollForElement {
	
	@Test
	public void scrolling() {
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDriver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		// pass application URL
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		// CREATE INSTANCE of javascript executor
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		// identify the WebElement which will appear after scrolling down
		
		WebElement element=driver.findElement(By.xpath("//*[@id='mCSB_3_container']/p[3]"));
		
		// now execute query which will actually scroll unitl that element is not appeared on page.
		je.executeScript("arguments[0].scrollIntoView(true)", element);
		
		// extract the text and verify
		System.out.println(element.getText());
		
	}

}
