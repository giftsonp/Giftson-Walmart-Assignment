package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.locators.WalmartSearchPageLocators;

/*
 * 
 * This is the Walmart Search page 
 * This page contains all the actions of the search page
 * 
 */

public class WalmartSearchPage extends WalmartSearchPageLocators {

	public WalmartSearchPage(WebDriver driver) {
		super(driver);
	}

	public WalmartItemPage clickOnFirstItemOnSearchPage() throws InterruptedException {
		List<WebElement> elementList = new ArrayList<WebElement>();
		// adding search results to a list
		Thread.sleep(2000);
		elementList = driver.findElements(RESULTSET);

		// click on the first item in the list of search results
		elementList.get(0).click();
		return new WalmartItemPage(driver);
	}
}
