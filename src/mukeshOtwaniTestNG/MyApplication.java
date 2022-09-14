package mukeshOtwaniTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
public class MyApplication {
	
	@Test(priority=1)
	public void startApp() {
		System.out.println("Starting app");
	}
	
	@Test(dependsOnMethods = "startApp")
	public void loginApp() {
		System.out.println("Login to app");
	}
	
	@Test(dependsOnMethods ="LoginApp" )
	public void logoutApp() {
		System.out.println("Logout app");
	}
	

}
