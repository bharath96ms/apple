package com.facebook.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.facebook.listners.TestNgListners;
import com.facebook.pages.LoginPage;

@Listeners(TestNgListners.class)
public class TCLoginPage001 extends BaseUrl {
	
	@Test
	public void LoginPageValidation() {
		LoginPage lp = new LoginPage(driver);
		lp.userDetails(username, password);
	}
	
}
