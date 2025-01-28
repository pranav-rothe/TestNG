package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

	/*
	 * The ITestListener interface in Selenium is used to listen and respond to various 
	 * events during the test execution lifecycle.
	 */
	
	
	/*
	 * This method is invoked before a test method starts execution. 
	 * It allows you to perform setup actions before the actual test begins.
	 */
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started: "+result.getName());
	}
	
	/*
	 * This method is called when a test method passes successfully.
	 * You can use this to log or perform actions after a successful test run.
	 */
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success: "+result.getName());
	}

	/*
	 * This method is triggered when a test method fails. 
	 * You can perform logging, capture screenshots, or take other actions when a test fails.
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure: "+result.getName());
	}

	/*
	 * This method is invoked when a test method is skipped. 
	 * You can log reasons for skipping or take necessary actions when tests are skipped.
	 */
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: "+result.getName());
	}

	
	/*
	 * This method is called once after all the tests in the suite have been executed. 
	 * You can perform cleanup actions at the end of all tests.
	 */
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All test finished");
	}

}
