package practice;

import org.testng.annotations.Test;

public class PriorityFeature {
	
	@Test(priority = 2)
	public void pranav() {
		System.out.println("Execute pranav");
	}
	
	@Test
	public void aman() {
		System.out.println("Execute aman");
	}
	
	@Test(priority = -1)
	public void nishant() {
		System.out.println("Execute nishant");
	}
	
	@Test(priority = 1)
	public void tejas() {
		System.out.println("Execute tejas");
	}
	
	@Test
	public void jayesh() {
		System.out.println("Execute jayesh");
	}

}
