package squadInoTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMulti {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", null);
		WebDriver wd=new ChromeDriver();
		wd.get(""); //html file
		
		Select s=new Select(wd.findElement(By.id("colour")));
		{
			if(s.isMultiple())
			{
				s.selectByIndex(0);
				s.selectByValue("2");
				s.selectByVisibleText("yellow");
				Thread.sleep(3000);
				s.deselectAll();
			}
		}
	}

}
