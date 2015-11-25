package com.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import com.driver.DriverFactory;
import com.driver.DriverFactory.BrowserType;

public class TestUtility {

	public static final String testDataPropFilePath = "com/properties/testdata.properties";
	public static final String userAgenListPath = "com/properties/useragents.properties";

	private static Properties testDataProps = new Properties();
	private static Properties uaProps = new Properties();

	public static void loadTestDataProperties() throws IOException {
		InputStream input = TestUtility.class.getClassLoader()
				.getResourceAsStream(testDataPropFilePath);
		testDataProps.load(input);
	}

	public static void loadUserAgents() throws IOException {
		InputStream input = TestUtility.class.getClassLoader()
				.getResourceAsStream(userAgenListPath);
		uaProps.load(input);
	}

	public static Properties getTestDataProperties() {

		return testDataProps;
	}
	
	/*
	 * Generates the collection object - User agents
	 * 
	 */
	public static Object[][] getUserAgentStrings(){
		try{			
			uaProps.clear();
			loadUserAgents();
		}
		catch(IOException ex){
			
		}
		
		@SuppressWarnings("unchecked")
		Enumeration<String> e = (Enumeration) uaProps.propertyNames();
		int sizeOfList = uaProps.size();
		
		Object[][] data = new Object[sizeOfList][2];
		for(int i=0; e.hasMoreElements(); i++ )
		{
			String key = (String) e.nextElement();
			data[i][0] = key;
			data[i][1] = uaProps.getProperty(key);
		}		
		
		return data;		
	}

}
