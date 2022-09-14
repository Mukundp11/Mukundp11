package sDET_TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
	
	@Test
	void StartCar() {System.out.println("Car started");
	Assert.fail();
	}
	
	@Test
	void driveCar() {System.out.println("car driving");}
	
	@Test (dependsOnMethods={"parkCar"})
	void stopCar() {System.out.println("car stopped");}
	
	@Test (dependsOnMethods={"driveCar"},alwaysRun=true)
	void parkCar() {System.out.println("Car parked");}
	

}
