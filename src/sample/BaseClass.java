package sample;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AppiumDriver<AndroidElement> driver = null;
	
	public void LaunchAppiumSetUp() throws MalformedURLException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,Utils.DEVICE_NAME );
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, Utils.DEVICE_PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.PLATFORM, Utils.DEVICE_PLATFORM);
		capabilities.setCapability("autoGrantPermissions",true);
	}
}
