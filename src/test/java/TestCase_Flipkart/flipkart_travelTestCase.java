package TestCase_Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart_travelTestCase {
	
@Test
public void m1() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@alt='Travel']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2vegSu _2mFmU7']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//label[contains(text(),'From')]/parent::div[1]/following-sibling::div/descendant::div[contains(text(),'BLR')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[contains(text(),'To')]/parent::div[1]/following-sibling::div/descendant::div[contains(text(),'DEL')]")).click();
}
}
