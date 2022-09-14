package mukeshOtwaniTestNG;

import org.testng.annotations.Test;

public class FirstTestNGScript {
	
	@Test (priority=1,description="This test case will verify login functionality")
	public void loginApplication() {
		System.out.println("login to application");
	}
	@Test (priority=2,description="This test case will add certain items in basket")
	public void SelectItems() { System.out.println("Item selected");
		
	}
	@Test (priority=3,description="This test case will perform checkout operation")
	public void Checkout() {
		System.out.println("checkout completed");
	}

}
