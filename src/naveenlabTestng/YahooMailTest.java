package naveenlabTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooMailTest {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch GC");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login to app");
	}
	
	@Test(priority=1)
	public void compositeMailTest() {
		System.out.println("composite mail test");
	}
	
	@Test(priority=2,enabled=false)
	public void deleteMailTest() {
		System.out.println("delete mail test");
	}
	@Test(priority=3)
	public void searchMailTest() {
		System.out.println("search Mail test");
	}
	@Test(priority=4)
	public void sentItemsMailTest() {
		System.out.println("sent Items Mail Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void quitBrowser() {
		System.out.println("Quit browser");
	}

}
