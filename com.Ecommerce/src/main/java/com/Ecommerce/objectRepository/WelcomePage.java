package com.Ecommerce.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseClass {
	

	 public WelcomePage(WebDriver driver) {
	        super(driver);
	    }

	    @FindBy(linkText = "Register")
	    private WebElement registerLink;
	    
	    @FindBy(linkText = "Log in")
	    private WebElement loginLink;
	    
	    @FindBy(linkText = "Shopping cart")
	    private WebElement topcartlink;
	    
	    

	    public WebElement getRegisterLink() {
	        return registerLink;
	    }

	    public WebElement getLoginLink() {
	        return loginLink;
	    }
	    
	    public WebElement getShoppingLink() {
	        return topcartlink;
	    }
}
