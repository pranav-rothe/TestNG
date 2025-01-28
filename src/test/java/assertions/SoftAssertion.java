package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void test1() {
		System.out.println("Test1 Program started.");

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(false, "Assert Error Test1");

		System.out.println("Test1 Program completed.");
		softAssert.assertAll(); //Collect all the result and report at failure time.
	}

	@Test
	public void test2() {
		System.out.println("Test2 Program started.");

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(true, true, "Test2");

		System.out.println("Test2 Program completed.");
		softAssert.assertAll();
	}

}
