package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners2 implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed and details are : "+result.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case is Start : "+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped : "+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case is Success : "+result.getName());
	}

}
