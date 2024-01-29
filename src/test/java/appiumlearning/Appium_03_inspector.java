package appiumlearning;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

//====================
//Install the appium inspector
// start the server
//app": "D:\\\\Study\\\\Appium\\\\APKFiles\\\\resources\\\\ApiDemos-debug.apk",
//"deviceName": "Pixel",
//"platformName": "android",
//"automationName": "UiAutomator2"
//-----------------
//TEst case 
//Preference --> 
//================

public class Appium_03_inspector {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@Test
	public void TestConfigureAppium() throws MalformedURLException, InterruptedException {

		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\91973\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		// service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel");
		options.setApp("D:\\Study\\Appium\\APKFiles\\resources\\ApiDemos-debug.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(10);

		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		// driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3.
		// Preference dependencies']")).click();
		// driver.findElement(By.id("android:id/checkbox")).click();
		// driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		// String alertTitle =
		// driver.findElement(By.id("android:id/alertTitle")).getText();
		// Assert.assertEquals(alertTitle, "WiFi settings");
		// driver.findElement(By.id("android:id/edit")).sendKeys("Rahul Wifi");
		//
		// driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}

}
