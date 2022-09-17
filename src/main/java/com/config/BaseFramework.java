package com.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import static com.resonanace.keyword.*;

public class BaseFramework {
	
	@BeforeMethod
	public void setup() {
		openBrowser("chrome");
		launchUrl("https://www.flipkart.com");

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		

	}

}
