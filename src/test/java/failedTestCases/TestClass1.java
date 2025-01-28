package failedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {

	@Test
	public void TestMethod1() {
		System.out.println("Executing a test method 1");
		Assert.assertTrue(false, "Failed in test method 1");
	}

	@Test
	public void TestMethod2() {
		System.out.println("Executing a test method 2");
		Assert.assertTrue(true, "Failed in test method 2");
	}

}
