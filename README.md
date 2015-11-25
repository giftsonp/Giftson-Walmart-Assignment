### Overview ###
This project automates the end to end e-commerce transaction flow of the walmart mobile application using Selenium webdriver and Java. 

### Problem Statement ###
Automate the walmart mobile application to cover an end to end transaction flow. 
Product URL : http://mobile.walmart.com/
	
### Flow covered ###
1. Perform a search on home page from a pool of keywords.
2. Identify an item from the result set that you can add to cart.
3. Add the item to cart and then login using existing account which is set up with at least one shipping address.
4. Validate that item added is present in the cart and is the only item in the cart.
5. Select Ship to Home as shipping method.
6. Validate that you are on Payment details page.
7. Go back to Cart Page, Remove the item from cart and validate cart is empty.
8. Sign out.

### Setup ###
1. Clone this repository
2. Paste chromedriver to root folder (Walmart_Automation/paste here) if you want the test to run in chrome.
3. Run TestWalmartApplication.java located in the com.test package using junit. 
4. By default, the test will run in one android and one IOS device on chrome browser. 
5. You can add more user agents to useragents.properties file located in the com.propterties package. 
6. Change the browser to Firefox or safari from the TestWalmartApplication.java. 


### Design ###
#### Package Structure ####
#### com.base ####
* Contains the BaseTest class where the user agent list is populated as a parameter.
* Also contains the URL construction methods.

####  com.driver ####
* Contains the DriverFactory class where the driver is created based on the choice of browser and user agents. 

#### com.locators ####
* Contains all the locator classes for the page objects. All page objects extend their appropriate locators. 

#### com.pages ####
* Contains all the page objects. All the page objects contain the actions and validations performed on the same page. 

#### com.properties ####
* Contains the property files that serves the various resources such as user agent list, username, password etc. 

#### com.test ####
* Contains the actual test class. Tests can be run using Junit. 

#### com.utils ####
* Contains the utility methods such as accessing the properties files and constructing the user agent list etc. 

### Implementation ###
The implementation strategy followed at the test level is the chaining methodology where in all the methods within the test method are chained one after the after in order to achieve better readability and clarity. 

### Structure ###
The test class contains the actual test itself with all the junit annotations. The test class extends the base class. The base class contains all the url construction methods that returns the various urls required during the test execution. It also contains the method that populates the user agent url’s by communicating with the getUserAgentStrings() of the TestUtility class. The Page Objects contain various methods such as clicks and validations. As an enhancement, the validations can be moved to a separate validator class. The TestUtility class contains methods that reads the useragent and test data properties files along with the relative paths to the properties files. The two property files namely testdata.properties and useragents.properties contains the resources such as username, password, the list of useragents etc. 


### Best Practices ###
* Easily readable and maintainable code due to the chaining mechanism followed. 
* No hard coding at the test level - Every input is being served from the properties files.
* Can be easily scaled to run on ‘n’ number of devices by simply adding the user agent to useragents.properties file therby achieving robustness and scalability.
* Methods are written such that they can be reused and extended for similar use cases.  

### Improvements ###
* Move validations to a validator class instead of having them in the Page objects.
* More search keywords need to be added to a properties file, and fed to the test for a wider keyword coverage.
