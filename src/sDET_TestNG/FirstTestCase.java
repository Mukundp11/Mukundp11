/**
 * 1.setup--open browser and application
 * 2.login
 * 3.close
 */

package sDET_TestNG;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test (priority=1)
	void setup()
	{
		System.out.println("Opening browser");
	}
	@Test (priority=2)
	void login()
	{
		System.out.println("This is login Test");
	}
	@Test (priority=3)
	void teardown()
	{
		System.out.println("closing browser");
	}

}
