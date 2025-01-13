package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations1 {
	
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite ==> setup system configuration");		
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeClass ==> open a browser");
	}
	
	@BeforeMethod
	public void loginApplication() {
		System.out.println("@BeforeMethod ==> login an application");
	}
	
	@Test
	public void verifyLogin() {
		System.err.println("@Test ==> verify login successfull or not");
	}
	
	@Test
	public void averifyLogoOne() {
		System.err.println("@Test ==> verify logo one");
	}
	
	@Test
	public void verifyLogoTwo() {
		System.err.println("@Test ==> verify logo two");
	}
	
	@AfterMethod
	public void logoutApplication() {
		System.out.println("@AfterMethod ==> logout an application");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("@AfterClass ==> close a browser");
	}
	
	@AfterSuite
	public void closeSetup() {
		System.out.println("@AfterSuite ==> close setup system configuration");
	}

}
