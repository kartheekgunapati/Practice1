package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed and details are : "+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped and details are : "+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Success and details are : "+result.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Start and details are : "+result.getName());
	}
	

}
