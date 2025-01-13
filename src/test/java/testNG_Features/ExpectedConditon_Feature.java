package testNG_Features;

import org.testng.annotations.Test;

public class ExpectedConditon_Feature {
	
	@Test
	public void openBrowser() {
		System.out.println("Open Browser");
	}
	
	@Test(expectedExceptions = ArithmeticException.class) //handling a exception on the particular test case
	public void openApplication() {
		System.out.println("Open Application");
		int div=20/0;
		System.out.println(div);
	}
	
	@Test
	public void login() {
		System.out.println("Login Application");
	}
	
	@Test
	public void logout() {
		System.out.println("Logout Application");
	}
	
	@Test
	public void tearDown() {
		System.out.println("Close Browser");
	}
	
	
}
