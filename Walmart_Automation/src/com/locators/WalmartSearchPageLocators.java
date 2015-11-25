package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/*
 * 
 * This is the Walmart Search page Locators
 * This page contains all the locators of the search page
 * 
 */


public class WalmartSearchPageLocators {
	
	public WebDriver driver;
	
	protected WalmartSearchPageLocators(WebDriver driver) {
		this.driver = driver;
	}

	public final By RESULTSET = By.cssSelector(".item-result-card");
}
