package com.resonance.travel_Test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.config.BaseFramework;
import com.resonanace.keyword;
import com.resonanace.propertiesUtility;

import static com.resonanace.keyword.*;

import com.util.constants.locator;
import com.util.constants.locatorType;



public class Travel extends BaseFramework{
	Logger LOG = Logger.getLogger(Travel.class);
	
	@Test
	public void verifyErrorOnSelectingSameCitiesAsSourceAndDestination() {
		
		waitfor(2000);
		click(locator.homescreen_Closepopup);
		waitfor(2000);
		click(locatorType.xpath,"//img[@alt='Travel']");
		waitfor(4000);
		click(locatorType.xpath, "//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2vegSu _2mFmU7']");
		waitfor(4000);
		LOG.info("clicked on from city dropdown");
		click(locatorType.xpath,"//label[contains(text(),'From')]/parent::div[1]/following-sibling::div/descendant::div[contains(text(),'BLR')]");
		waitfor(3000);
		LOG.info("selected Banglore as a From city");
		click(locatorType.xpath,"//label[contains(text(),'To')]/parent::div[1]/following-sibling::div/descendant::div[contains(text(),'DEL')]");
		LOG.info("selected Delhi as a To city");
	}
	
	@Test
	public void verifysearchResultForShoes() {
	
		//Logger LOG = Logger.getLogger(Travel.class);
		
		LOG.info("shoes method");
		 
		click(locatorType.xpath, "//button[@class='_2KpZ6l _2doB4z']");
		LOG.error("close home screen popup");
		waitfor(5000);
	    enterText(locatorType.xpath, "//input[@type='text']", "female shoes");
	    LOG.error("Enter text female shoes successfully");
	    waitfor(4000);
	    click(locatorType.xpath, "//button[@class='L0Z3Pu']");
	    LOG.info("click on enter button and search product");
	    //waitfor(4000);
		//enterText(locatorType.xpath, "input[placeholder='Search for products, brands and more']", "Shoes");
       
	    waitfor(6000);
	}

}
