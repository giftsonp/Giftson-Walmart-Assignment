package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/*
 * 
 * This is the Walmart checkout page Locators
 * This page contains all the locators of the checkout page
 * 
 */


public class WalmartCheckoutPageLocators {
	
	public WebDriver driver;
	
	protected WalmartCheckoutPageLocators(WebDriver driver) {
		this.driver = driver;
	}

	public final By SHIPTOHOMEBTN = By.id("fulfillment-type-radio-0-0");	
	public final By CONTINUEBTN_SHIPPINGMETHOD = By.id("COAC1ShpOptContBtn");
	public final By CONTINUEBTN_SHIPPINGADDRESS = By.id("COAC2ShpAddrContBtn");
}
