package appiumlearning;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

//==================
//Installation
//1) Download Java , Set path in environment variable
//2) Download the Android Studio and set the path in environment variable .It will install android emulator
//          while installation grab the sdk path set it in home path 
//          ANDROID_HOME C:\Users\91973\AppData\Local\Android\Sdk
//4) Launch the android studio and let the build complete after that SDK will be visible in tools.
//5) Now in tools-->SDK Manager -->Android SDK --> Hide uncheck package --> SDK  tools --> Android SDK Tool (Obselete) install that
//6) Add the SDK tools in path variable
//    (C:\Users\91973\AppData\Local\Android\Sdk\tools,C:\Users\91973\AppData\Local\Android\Sdk\tools\bin, C:\Users\91973\AppData\Local\Android\Sdk\platform-tools)
//    will be visible
//7) Download the Nodejs and set in enviornment path variable, C:\Program Files\nodejs\node_modules\npm\bin , C:\Program Files\nodejs\
//8) Configure the virtual device by launching the android studio and configure device
//     Tools--> AVD manager create a new virtual device
//9) Install appium server usint admin command prompt "npm install appium"
//10) Start the Appium by running in command prompt (Run as administrator)
//11) Start the android sdk and run the emulator
// 12)Command " appium driver list" wll list all listed driverr
//    uiautomator should be installed by command "appium driver install uiautomator2 "
//13) Run the appium server by "appium" command
//13) Create a maven project with appium dependency (maven-archetype-quickstart template can be used)

//===========
//Imp if we get 
//An unknown server-side error occurred while processing the command. Could not proxy command to remote server. Original error: Error: socket hang up
//Run below command and restart appium

//adb uninstall io.appium.uiautomator2.server.test

//=================================
//Appium code --> Appium server --> appium client
//		1) Run the appium server manually before this test
//

public class Appium_01 {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@Test
	public void TestConfigureAppium() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel");

		options.setApp("D:\\Study\\Appium\\APKFiles\\resources\\ApiDemos-debug.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(10);

		driver.quit();
	}

}
