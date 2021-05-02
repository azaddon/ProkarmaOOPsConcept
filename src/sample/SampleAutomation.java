package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class SampleAutomation {
	
	public WebDriver driver;
	//public AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException{
//		System.out.println("Set Up is Calling");
//		
//			System.out.println("Entered try block");
//			File classpathRoot = new File(System.getProperty("user.dir"));
//			System.out.println(classpathRoot);
//			File appDir = new File(classpathRoot, "/src/test/resources/apps/");
//			System.out.println(appDir);
//			File app = new File(appDir, "madhaar.apk");
//			System.out.println(app);
//			System.out.println("looking for desired capapbility");
//		DesiredCapabilities caps = new DesiredCapabilities();
//		System.out.println("desired capapbility found");
//		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
//		caps.setCapability(MobileCapabilityType.UDID, "RZ8N21VAHFB");
//		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A70");
//		//caps.setCapability("app", app.getAbsolutePath());
//		caps.setCapability(MobileCapabilityType.APP, "/Users/mohdazadkhan/Documents/workspace/AppiumDemoProject/src/test/resources/apps/base.apk");
//		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.gov.uidai.mAadhaarPlus");
//		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "in.gov.uidai.mAadhaarPlus.MainActivity");
//			new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//			Thread.sleep(10000);
//		System.out.println("Set Up is Executed");
		driver = new SafariDriver();
		driver.get("www.google.com");
		//driver.switchTo().window(WindowType.WINDOW);
	}
	
	@Test
	public void verifyLaunchOfAdhaar() throws InterruptedException{
		System.out.println("Method Calling");
		WebElement allow = driver.findElement(By.id("permission_allow_button"));
		allow.click();
		Thread.sleep(2000);
		WebElement allowWhileUsingApp = driver.findElement(By.id("permission_allow_foreground_only_button"));
		allowWhileUsingApp.click();
	}
	
	@AfterTest
	public void tearDown(){
		System.out.println("TestCompleteted");
		//driver.quit();
	}
}

