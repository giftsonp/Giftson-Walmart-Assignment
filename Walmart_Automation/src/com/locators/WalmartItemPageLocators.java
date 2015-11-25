package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/*
 * 
 * This is the Walmart Item page Locators
 * This page contains all the locators of the item page
 * 
 */


public class WalmartItemPageLocators {
	
	public WebDriver driver;
	
	protected WalmartItemPageLocators(WebDriver driver) {
		this.driver = driver;
	}

	public final By ADDTOCARTBTN = By.cssSelector("button.add-to-cart");
	public final By USERNAMEFIELD = By.id("login-username");
	public final By PASSWORDFIELD = By.id("login-password");
	public final By SIGNINBTN = By.cssSelector(".login-sign-in-btn");
	
	
}
