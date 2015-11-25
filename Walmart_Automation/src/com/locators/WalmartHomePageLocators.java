package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/*
 * 
 * This is the Walmart Home page Locators
 * This page contains all the locators of the home page
 * 
 */


public class WalmartHomePageLocators {
	
	public WebDriver driver;
	
	protected WalmartHomePageLocators(WebDriver driver) {
		this.driver = driver;
	}

	public final By SEARCHBOX = By.id("search");
	public final By SUBMITBTN = By.cssSelector(".searchbar-submit");
}
