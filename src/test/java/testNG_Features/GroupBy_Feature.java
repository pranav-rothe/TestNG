package testNG_Features;

import org.testng.annotations.Test;

public class GroupBy_Feature {

	@Test(groups = {"smoke", "regression"})
	public void pranav() {
		System.out.println("@pranav");
	}
	
	@Test(groups = {"regression"})
	public void aman() {
		System.out.println("@aman");
	}
	
	@Test(groups = {"functional","smoke"})
	public void nishant() {
		System.out.println("@nishant");
	}
	
	@Test(groups = {"sanity"})
	public void jayesh() {
		System.out.println("@jayesh");
	}
	
}
