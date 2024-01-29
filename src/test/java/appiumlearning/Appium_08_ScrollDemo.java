package appiumlearning;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

//public class Appium_08_ScrollDemo extends Appium_08_Utilclass {
//
//	@Test
//	public void ScrollDemoTest() throws MalformedURLException, InterruptedException {
//
//		driver.findElement(AppiumBy.accessibilityId("Views")).click();
//
//		// where to scroll is known prior
//		driver.findElement(
//				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
//
//		
//
//	}
//
//}

//==============================
public class Appium_08_ScrollDemo extends Appium_08_Utilclass {

	@Test
	public void ScrollDemoTest() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// No prior idea
		scrollToEndAction();

	}

}
