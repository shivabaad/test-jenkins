package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void testLoginSuccess() {
		App appTestSuccess = new App();
		Assert.assertEquals(true, appTestSuccess.isUserLoggedIn("abc", "xyz"));
//		Assert.assertEquals(0, appTestSuccess.isUserLoggedIn("abc", "xyz"));
	}
	
	@Test
	public void testLoginFailure() {
		App appTestFailure = new App();
		Assert.assertEquals(false, appTestFailure.isUserLoggedIn("abcc", "xyzz"));
	}	

}
