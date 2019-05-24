package com.test.singin;
import com.test.base.BaseTest;
import com.testvagrant.pages.SignInPage;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignInTest extends BaseTest{

	SoftAssert s_assert;
	
    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
    	TestCaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		System.out.println("Executing Scenario ........" + TestCaseName);
		SignInPage sign_In_Page = new SignInPage(driver);
        Assert.assertTrue(sign_In_Page.shouldThrowAnErrorIfSignInDetailsAreMissing().contains("There were errors in your submission"));
    	
    
    }

  

    


}
