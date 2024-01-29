package appiumlearning;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class example {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// public AndroidDriver driver;
		// public AppiumDriverLocalService service;

		System.out.println("hello");
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel");
		// options.setApp("//Users//rahulshetty//workingcode//Appium//src//test//java//resources//ApiDemos-debug.apk");
		options.setApp("D:\\Study\\Appium\\APKFiles\\resources\\ApiDemos-debug.apk\\ApiDemos-debug.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}

}
