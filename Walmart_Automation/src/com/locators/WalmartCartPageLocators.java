package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/*
 * 
 * This is the Walmart cart page Locators
 * This page contains all the locators of the cart page
 * 
 */


public class WalmartCartPageLocators {
	
	public WebDriver driver;
	
	protected WalmartCartPageLocators(WebDriver driver) {
		this.driver = driver;
	}

	public final By ITEMLINKID = By.id("CartItemInfo");
	public final By ITEMCOUNT = By.cssSelector(".cart-list-title>span");
	public final By CHECKOUTBTN = By.id("CartChkOutBtn");
	public final By REMOVEBTN = By.cssSelector(".btn-delete");
	public final By HAMBURGERBTN = By.cssSelector(".header-nav-toggle");
	public final By SIGNOUTLINK = By.cssSelector(".nav-main-signout>a");
}
