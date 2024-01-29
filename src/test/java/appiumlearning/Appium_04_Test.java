package appiumlearning;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Appium_04_Test extends Appium_04_Utilclass {

	@Test
	public void WifiSettingsName() throws MalformedURLException {

		driver.findElement(AppiumBy.accessibilityId("Preference")).click();

	}

}
