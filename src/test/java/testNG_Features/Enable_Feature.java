package testNG_Features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enable_Feature {

	@BeforeMethod
	public void openBrowser() {
		System.out.println("@BeforeMethod ==> openBrowser");
	}

	@Test
	public void pranav() {
		System.err.println("@Test ==> pranav method");
	}

	@Test
	public void aman() {
		System.err.println("@Test ==> aman method");
	}

	@Test(enabled = false) //this method is not execute because we disabled this method 
	public void nishant() {
		System.err.println("@Test ==> nishant method");
	}

	@Test(enabled = false) //this method is not execute because we disabled this method 
	public void tejas() {
		System.err.println("@Test ==> tejas method");
	}

	@Test
	public void vivek() {
		System.err.println("@Test ==> vivek method");
	}

	@Test
	public void jayesh() {
		System.err.println("@Test ==> jayesh method");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("@AfterMethod ==> quit browser");
	}

}
