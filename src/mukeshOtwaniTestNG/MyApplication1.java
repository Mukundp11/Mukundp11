package mukeshOtwaniTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyApplication1 {
	@Test(priority=1)
	public void startApp() {
		//Assert.assertEquals(12,13);
		System.out.println("Starting app");
	}
	
	@Test(dependsOnMethods = "startApp")
	public void loginApp() {
		System.out.println("Login to app");
	}
	
	@Test(dependsOnMethods ="loginApp" )
	public void logoutApp() {
		System.out.println("Logout app");
	}

}
