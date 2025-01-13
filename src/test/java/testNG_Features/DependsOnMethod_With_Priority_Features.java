package testNG_Features;

import org.testng.annotations.Test;

public class DependsOnMethod_With_Priority_Features {

	@Test(priority = -1)
	public void pranav() {
		System.out.println("@Test ==> pranav method");
	}

	@Test(priority = 1)
	public void aman() {
		System.out.println("@Test ==> aman method");
	}

	@Test(priority = 3)
	public void nishant() {
		System.out.println("@Test ==> nishant method");
	}

	@Test(dependsOnMethods = "pranav", priority = 4)
	public void tejas() {
		System.out.println("@Test ==> tejas method");
	}

	@Test(dependsOnMethods = "nishant", priority = 2)
	public void vivek() {
		System.out.println("@Test ==> vivek method");
	}
	
	@Test
	public void jayesh() {
		System.out.println("@Test ==> jayesh method");
	}

}
