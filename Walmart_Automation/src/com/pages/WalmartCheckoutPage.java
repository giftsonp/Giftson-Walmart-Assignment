package com.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.base.BaseTest;
import com.locators.WalmartCheckoutPageLocators;

/*
 * 
 * This is the Walmart Checkout Page
 * This page contains all the actions performed in the Walmart Checkout Page
 * 
 */

public class WalmartCheckoutPage extends WalmartCheckoutPageLocators {

	public WalmartCheckoutPage(WebDriver driver) {
		super(driver);

	}

	public WalmartCheckoutPage validateIfShipToHomeOptionIsSelected()
			throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(SHIPTOHOMEBTN).isSelected(),
				"Ship to home option is not selected");
		return new WalmartCheckoutPage(driver);
	}

	public WalmartCheckoutPage navigateToPaymentPage()
			throws InterruptedException {
		driver.findElement(CONTINUEBTN_SHIPPINGMETHOD).click();
		Thread.sleep(4000);
		driver.findElement(CONTINUEBTN_SHIPPINGADDRESS).click();
		Thread.sleep(4000);
		return new WalmartCheckoutPage(driver);
	}

	public WalmartCheckoutPage validateIfCurrentPageIsPaymentDetailsPage()
			throws InterruptedException {
		Assert.assertTrue(
				driver.getCurrentUrl().equals(
						BaseTest.getWalmartPaymentDetailsPageUrl()),
				"Current page is not the Payment details page");
		return new WalmartCheckoutPage(driver);
	}
}