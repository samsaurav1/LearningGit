package com.Ecommerce.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecommerce.genricUtility.BaseTest;
import com.Ecommerce.objectRepository.LoginPage;
import com.Ecommerce.objectRepository.WelcomePage;

public class LoginTest extends BaseTest {  
	
	 @Test
	    public void login() {
	        // Navigate to the Welcome Page
	        WelcomePage wp = new WelcomePage(driver);
	        
	        // Click the Login link on the Welcome Page
	        wp.getLoginLink().click();
	        
	        Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
	        
	        // Create LoginPage object
	        LoginPage lp = new LoginPage(driver);
	        
	        // Perform login
	        lp.login("sauravthakur@gmail.com", "saurav@123");
	        
	       
	    }

}
