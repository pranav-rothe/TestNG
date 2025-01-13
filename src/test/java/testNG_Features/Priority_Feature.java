package testNG_Features;

import org.testng.annotations.Test;

public class Priority_Feature {

	@Test(priority = 1)
	public void pranav() {
		System.out.println("@Test ==> pranav method");
	}

	@Test(priority = 2)
	public void aman() {
		System.out.println("@Test ==> aman method");
	}

	@Test(priority = 1)
	public void nishant() {
		System.out.println("@Test ==> nishant method");
	}

	@Test(priority = -1)
	public void tejas() {
		System.out.println("@Test ==> tejas method");
	}

	@Test(priority = 3)
	public void vivek() {
		System.out.println("@Test ==> vivek method");
	}

	@Test
	public void jayesh() {
		System.out.println("@Test ==> jayesh method");
	}

}
