package com.crm.vtiger.objectRepository;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
    
	public int count=0;
	public int retrycount=3;
	public boolean retry(ITestResult result) {
		while(count<retrycount) {
			count ++;
			return true;
		}
		
		return false;
	}

}
