package appiumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Appium_16_MobileBrowserTest extends Appium_16_BrowserBaseTest {

	@Test
	public void browserTest() throws InterruptedException

	{
		System.out.println("I am here to wait");
		Thread.sleep(10000);
		System.out.println("I am here to wait1 ");

		driver.get("http://google.com");
		System.out.println("I am here to wait2");

		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("devops");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", ""); // Scroll

	}
}
