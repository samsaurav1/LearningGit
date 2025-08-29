package com.Ecommerce.addToCart;

import org.testng.annotations.Test;

import com.Ecommerce.genricUtility.BaseTest;
import com.Ecommerce.objectRepository.LoginPage;
import com.Ecommerce.objectRepository.ProductPage;
import com.Ecommerce.objectRepository.WelcomePage;

public class AddToCartTest extends BaseTest {

	 @Test
	    public void addToCart() {
	        // Go to Welcome Page
	        WelcomePage wp = new WelcomePage(driver);
	        
	        // Login (Demo Web Shop usually requires login before adding to cart)
	        wp.getLoginLink().click();
	        LoginPage lp = new LoginPage(driver);
	        lp.login("nikhil.chopra@inbox.com\r\n" + "", "wGb=AqG6OQZ1");
	        
	        // Add product to cart
	        ProductPage acp = new ProductPage(driver);
	        acp.addToCart();
	        
	     
	    }
	}