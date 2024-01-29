package appiumlearning;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

//Start the Appium by running in command prompt (Run as administrator)
// To work the appium inspector
// Preference-->  Preference dependencies  --> Wifi -- > Wifi Settings --> Ashok Wifi

public class Appium_05_WifiSetting extends Appium_04_Utilclass {

	// public AndroidDriver driver;
	// public AppiumDriverLocalService service;

	@Test
	public void TestConfigureAppium() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Ashok Wifi");

		driver.findElements(By.className("android.widget.Button")).get(1).click();

	}

}
