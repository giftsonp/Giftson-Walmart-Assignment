package com.base;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.InvalidPropertiesFormatException;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.utils.TestUtility;

@RunWith (Parameterized. class)
public class BaseTest {

	static String url = null;
	private String useragentCurrent;
	private String key;
	
	@Parameters(name = "{0}")
	public static Collection<Object[]> userAgents(){		
		Object[][] data = TestUtility.getUserAgentStrings();
		return Arrays.asList(data);
	}
	
	public BaseTest(){
		// empty default constructor	
	}
	
	public BaseTest(String key, String useragent) throws InvalidPropertiesFormatException, IOException{
		this.useragentCurrent = useragent;
		this.key = key;		
	}

	public static String getWalmartUrl() {
		url = "http://mobile.walmart.com/";
		return url;
	}

	public static String getWalmartSignInPageUrl() {
		url = "https://www.walmart.com/account/login/";
		return url;
	}

	public static String getWalmartCartPageUrl() {
		url = "https://www.walmart.com/cart/";
		return url;
	}

	public static String getWalmartPaymentDetailsPageUrl() {
		url = "https://www.walmart.com/checkout/#checkout/payment";
		return url;
	}

}
