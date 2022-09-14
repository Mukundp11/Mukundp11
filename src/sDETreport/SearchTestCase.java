package sDETreport;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SearchTestCase {
//	ExtentReports extent=new ExtentReport();
//	ExtentSparkReport spark=new ExtentSparkReport("");
//
//	WebDriver driver;
//	
//	@BeforeTest
//	public void Browserlaunch() {
//	spark.config().setTheme(Theme.DARK);
//	spark.config().setDocumentTitle("MyReport");
//	extent.attachReport(spark);
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	
//	driver.get("https://www.google.com");
//	
//	}
//	@AfterTest
//	public void teardown() {
//		extent.flush();
//		driver.quit();
//	}
//	
//	@Test
//	public void Testcase_001() {
//		ExtentTest test=extent.createTest("Verify the pagetitle").assignAuthor("Suresh")
//				.assignCategory("functional Test cases").assignDevice("Windows");
//		test.info("i am capturing the page title");
//		String pagetitle=driver.getTitle();
//		test.info("capture page title as :"+pagetitle);
//		if(pagetitle.equals("google")) {
//			test.pass("Page title is verified: title captured"+ pagetitle);
//			}
//		else {
//			test.fail("Page title is not matched with expected results :"+ pagetitle);
//		}
//	}
//	public static
//}
}