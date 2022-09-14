package naveenlabTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {
//	@BeforeSuite --- setup system property for chrome--I
//	@BeforeTest-- launch chrome Browser--II
//	@BeforeClass-- login to app--III
	
//	@BeforeMethod-- enter URL
//	@Test--google logo test
//	@AfterMethod --logout to app
	
//	@BeforeMethod-- enter URL
//	@Test--google Title Test
//	@AfterMethod --logout to app
	
//	@BeforeMethod-- enter URL
//	@Test--search test
//	@AfterMethod --logout to app
	
//	@AfterClass -- close brpwser
//	@AfterTest-- deleteAllCookies
//	PASSED: googleLogoTest

	
	//Pre-Conditions annotations---Starting with @Before
	
	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite --- setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest-- launch chrome Browser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("@BeforeClass-- login to app");
	}
	
	/*
	 * @BeforeMethod
	 * @Test-1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test-2
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test-3
	 * @AfterMethod
	 * 
	 */
	
	
	
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("@BeforeMethod-- enter URL");
	}
	
	//Test cases--Starting with @Test
	@Test //5
	public void googleTitleTest() {
		System.out.println("@Test--google Title Test");
	}
	
	@Test 
	public void searchTest() {
		System.out.println("@Test--search test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test--google logo test");
	}
	
	//Post conditions---Starting with @After
	
	@AfterMethod //6
	public void logOut() {
		System.out.println("@AfterMethod --logout to app");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("@AfterClass -- close brpwser");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest-- deleteAllCookies");
	}
	
	
	@AfterSuite //9
	public void generateTestReport() {
		System.out.println("generate Test Report");
	}

}
