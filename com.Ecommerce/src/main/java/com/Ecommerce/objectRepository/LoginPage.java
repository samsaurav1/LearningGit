package com.Ecommerce.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {
	

	    
	    public LoginPage(WebDriver driver) {
	        super(driver);
	    }
	    
	    @FindBy(id = "Email")
	    private WebElement emailTextField;
	    
	    @FindBy(id = "Password")
	    private WebElement passwordTextField;
	    
	    @FindBy(xpath = "//input[@value='Log in']")
	    private WebElement loginButton;
	    
	    @FindBy(xpath = "//span[@class='field-validation-error']")
	    private WebElement loginErrorMessage; 
	    
	    // Login method
	    public void login(String email, String password) {
	        emailTextField.clear();
	        emailTextField.sendKeys(email);
	        passwordTextField.clear();
	        passwordTextField.sendKeys(password);
	        loginButton.click();
	    }
	    
	    
	    public String getLoginErrorMessage() {
	        return loginErrorMessage.getText();
	    }
}
