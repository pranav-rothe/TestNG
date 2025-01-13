package testNG_Features;

import org.testng.annotations.Test;

public class InvocationCount_Features {
	
	@Test(invocationCount = 4)
	public void pranav() {
		System.out.println("@Test ==> pranav method");
	}

	@Test(invocationCount = 2)
	public void aman() {
		System.out.println("@Test ==> aman method");
	}

	@Test(invocationCount = 0) //zero invocation also not executed
	public void nishant() {
		System.out.println("@Test ==> nishant method");
	}

	@Test(invocationCount = -2) //negative test case is not executed 
	public void tejas() {
		System.out.println("@Test ==> tejas method");
	}

	@Test
	public void vivek() {
		System.out.println("@Test ==> vivek method");
	}

	@Test
	public void jayesh() {
		System.out.println("@Test ==> jayesh method");
	}
	
}
