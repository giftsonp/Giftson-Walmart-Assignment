package com.pages;

import org.openqa.selenium.WebDriver;

import com.locators.WalmartHomePageLocators;

/*
 * 
 * This is the Walmart Home page 
 * This page contains all the actions performed in the home page
 * 
 */

public class WalmartHomePage extends WalmartHomePageLocators {

	public WalmartHomePage(WebDriver driver) {
		super(driver);

	}

	public WalmartSearchPage searchForKeyword(String keyword) {		
		driver.findElement(SEARCHBOX).sendKeys(keyword);
		driver.findElement(SUBMITBTN).click();
		return new WalmartSearchPage(driver);
	}
}
