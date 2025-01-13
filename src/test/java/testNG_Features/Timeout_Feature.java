package testNG_Features;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Timeout_Feature {

	
	//@Test(timeOut = 3) //after three seconds infinite loop is stop
	public void methodOne() {
		for(;;) {
			System.out.println("TestNG");
		}
	}
	
	@Test(timeOut = 2) //throws the exception because timeout is 2 seconds but inside method thread sleep is 4 seconds
	public void methodTwo() throws InterruptedException {
		System.out.println("Method Two");
		Thread.sleep(4000);
	}
	
	@Test(timeOut = 2, expectedExceptions = ThreadTimeoutException.class) //handling the exception
	public void methodThree() throws InterruptedException {
		System.out.println("Method Three");
		Thread.sleep(4000);
	}
}
