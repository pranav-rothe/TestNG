package failedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void TestMethod3() {
		System.out.println("Executing a test method 3");
		Assert.assertTrue(false, "Failed in test method 3");
	}

	@Test
	public void TestMethod4() {
		System.out.println("Executing a test method 4");
		Assert.assertTrue(true, "Failed in test method 4");
	}

}
