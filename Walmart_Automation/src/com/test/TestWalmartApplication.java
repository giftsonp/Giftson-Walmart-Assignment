package com.test;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import com.base.BaseTest;
import com.driver.DriverFactory;
import com.driver.DriverFactory.BrowserType;
import com.pages.WalmartHomePage;
import com.pages.WalmartItemPage;
import com.utils.TestUtility;

@RunWith (Parameterized. class)
public class TestWalmartApplication extends BaseTest {

	private String useragent;
	private String key;
	public static WebDriver driver;
	public static Properties testDataProps;
	public static Properties userAgentProps;
	private static String username;
	private static String password;
	
	// Set Browser browser type
	static DriverFactory.BrowserType browser = BrowserType.CHROME;
	private static String keyword = "tv";
	
	public TestWalmartApplication(String key, String useragent) throws InvalidPropertiesFormatException, IOException {
		super(key, useragent);
		this.useragent = useragent;
		this.key = key;		
	}	

	// get driver with above capabilities and set resources from properties files
	@Before
	public void setup() throws IOException {		
		TestUtility.loadTestDataProperties();
		testDataProps = TestUtility.getTestDataProperties();		
		username = testDataProps.getProperty("USERNAME");
		password = testDataProps.getProperty("PASSWORD");	
		driver = DriverFactory.getDriver(browser, useragent);
	}

	@After
	public void cleanup() {
		driver.quit();
	}
	
	@Test
	public void testWalmart() throws InterruptedException {
		driver.get(getWalmartUrl());
		WalmartHomePage homePage = new WalmartHomePage(driver);
		homePage.searchForKeyword(keyword)
				.clickOnFirstItemOnSearchPage()
				.addItemToCart()
				.login(username, password)
				.navigateToCartPage()
				.validateIfItemIsPresentInCart()
				.validateIfItemIsTheOnlyItemInCart()
				.clickCheckoutBtnFromCart()
				.validateIfShipToHomeOptionIsSelected()
				.navigateToPaymentPage()
				.validateIfCurrentPageIsPaymentDetailsPage();

		WalmartItemPage itemPage = new WalmartItemPage(driver);
		itemPage.navigateToCartPage()
				.removeItemFromCart()
				.validateIfCartIsEmpty()
				.logout();
	}

}
