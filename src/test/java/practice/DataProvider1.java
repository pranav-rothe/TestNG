package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@Test(dataProvider = "LoginData")
	public void TC01(String user, String pass) {
		System.out.println(user+", "+pass);
	}
	
	@DataProvider(name="LoginData")
	public Object[][] testData(){
		return new Object[][] {
			{"Pranav", "pranav123"},
			{"Aman", "aman123"},
			{"Admin", "admin"}
		};
	}

}
