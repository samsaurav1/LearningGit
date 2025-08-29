package com.Ecommerce.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BaseClass{
	
	 public ProductPage(WebDriver driver) {
	        super(driver);
	    }
	    
	    @FindBy(xpath = "//h2[@class='product-title']/a[text()='14.1-inch Laptop']")
	    private WebElement productLink;
	    
	    @FindBy(id = "add-to-cart-button-31")
	    private WebElement addToCartButton;
	    
	    @FindBy(xpath = "//span[@class='cart-qty']")
	    private WebElement cartQuantity;
	    
	    public void addToCart() {
	        productLink.click();
	        addToCartButton.click();
	    }
	    
	    public String getCartQuantity() {
	        return cartQuantity.getText();
	    }
	}


