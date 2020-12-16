package test;

import org.testng.ITestContext;
import org.testng.ITestListener; 
import org.testng.ITestResult;

public class Listeners implements ITestListener {//interface with listeners

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("***New test***");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("*****Test failed***** " + " Method: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}	

}
