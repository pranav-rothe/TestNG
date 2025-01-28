package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	/*
	 * Assertions TestNG are used to validate the expected and actual result of test cases.
	 * It is validation process in test automation.
	 * 
	 * Hard Assertion: When a hard assertion fails, the test execution stops immediately, 
	 * and the subsequent/below steps in the test method are skipped.
	 */

	//Ensures a condition is true.
	//@Test
	public void TC01() {
		System.out.println("TC01 --> Program started.");
		boolean value=true;
		Assert.assertTrue(value, "Assertion Error: Element is not visible!");
		System.out.println("TC01 --> Program completed.");
	}

	//Ensures a condition is false.
	//@Test
	public void TC02() {
		System.out.println("TC03 --> Program started.");
		boolean value=true;
		Assert.assertFalse(value, "Assertion Error: Error should not be displayed!");
		System.out.println("TC03 --> Program completed.");
	}

	//Validates that two values are equal.
	//@Test
	public void TC03() {
		System.out.println("TC02 --> Program started.");
		String value1="Java";
		String value2="Java";
		String value3="Python";
		Assert.assertEquals(value1, value3, "Assertion Error: Title does not match!");
		System.out.println("TC02 --> Program completed.");
	}

	//Ensures two values are not equal.
	@Test
	public void TC04() {
		System.out.println("TC04 --> Program started.");
		boolean value1=true;
		boolean value2=true;
		boolean value3=false;
		Assert.assertNotEquals(value1, value3, "Assertion Error: Values should not match! ");
		System.out.println("TC04 --> Program completed.");

	}

}
