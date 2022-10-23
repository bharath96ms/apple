package com.facebook.listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListners implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Sucessfully executed "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed "+ result.getName());
	}

}
