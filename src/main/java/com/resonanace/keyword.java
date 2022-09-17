package com.resonanace;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyword {
	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	public static final Logger LOG = Logger.getLogger(keyword.class);

	/**
	 * This method will launch specified browser in maximized mode
	 * 
	 * @Disha browserName must be one of the following
	 *        <ul>
	 *        <li>Chrome</li>
	 *        <li>Firefox</li>
	 *        <li>Edge</li>
	 *        </ul>
	 */
	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			//System.err.println("Invalid Browser Name" + browserName);
			LOG.error("Invalid Browser Name" + browserName);
		}
		//System.out.println(browserName + " is launched Succesfully");
		LOG.info(browserName + " is launched Succesfully");
		 wait = new WebDriverWait(driver, Duration.ofSeconds(3000));

	}

	/**
	 * This method will launch the specified url in currently open browser window
	 * 
	 * @Disha url
	 */

	public static void launchUrl(String url) {
		driver.get(url);

	}
	
	/**
	 * This method will click on element described by {@code locatorType} and {@code locatorValue}
	 * @Disha locatorType must be one of the following
	 * <ul>
	 * <li>xpath</li>
	 * <li>css selector</li>
	 * <li>class</li>
	 * <li>id</li>
	 * </ul>
	 * @Disha locatorValue
	 */

	@Deprecated
	public static void click(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}
	public static void click(String locator) {
		String [] parts = locator.split("##");
		getWebElement(parts[0], parts[1]).click();
		
		
		
	}
	
	//method overloading concept
	public static  void click(By by) {
		driver.findElement(by).click();
	}
	
	public static void enterText(String locatorType, String locatorValue, String texttoEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(texttoEnter);

	}
	
	public static WebElement getWebElement(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(locatorValue));

		} else if (locatorType.equalsIgnoreCase("css selector")) {
			return driver.findElement(By.cssSelector(locatorValue));
		}else {
			System.err.println("Invalid locator Type"+locatorType);
			return null;
		}
		
	}

	/**
	 * This method will perform wait
	 * 
	 * @Disha duration
	 */

	public static void waitfor(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

	}

}
