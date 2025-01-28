package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProvider {

	@Test(dataProvider = "LoginData")
	public void TC01(String user, String pass) {
		System.out.println("Username: " + user + ", Password: " + pass);
	}

	@DataProvider(name = "LoginData")
	public Object[][] TestData() {

		return new Object[][] { 
			{ "Admin", "admin123" }, 
			{ "Pranav", "pranav@123" }, 
			{ "Aman", "aman@123" } 
		};
	}

}
/*
 * The @DataProvider annotation in TestNG is a powerful feature used to pass multiple 
 * sets of data to a single test method.
 * 
 * Key Features of @DataProvider:
 * 1. Reusable Data
 * 2. Parameterized Testing
 */
