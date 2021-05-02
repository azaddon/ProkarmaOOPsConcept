package appiumTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;


public class AppFactory {
	
	public static AppiumDriver<MobileElement> appdriver;
	public static MobileDriver<RemoteWebElement> mobiledriver;
	public static AndroidDriver<MobileElement> androiddriver;
	public static WebDriver webdriver;
	public static RemoteWebDriver driver;
	TouchAction t;
	File file = new File("");
	static DesiredCapabilities cap;
	
	public static  void launchBrowser() throws MalformedURLException{
		cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A70");
		cap.setCapability(MobileCapabilityType.UDID, "192.168.43.68:5555");
		cap.setCapability("autoGrantPermission", true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.picsart.studio");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.socialin.android.photo.picsinphoto.MainPagerActivity");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10);
			appdriver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		AppDriver.setDriver(appdriver);
	}
	
	@Test
	public void TestApp(){
		//t = new TouchAction(driver);
		AndroidElement first =(AndroidElement) appdriver.findElement(By.className(""));
		 MobileElement el1 =appdriver.findElement(By.id(""));
		 appdriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //implicit wait
				 
		Point p = first.getLocation();
		//TAPPING ELEMENT
		t.tap(point(p.x,p.y)).perform();
		new TouchAction((PerformsTouchActions) tapOptions().withElement(element(first))).perform();
		
		
		
		Dimension dimension = first.getSize();
		 int Anchor = dimension.getHeight()/2;
		 
		 double ScreenWidthStart = dimension.getWidth() * 0.8;
		 int scrollStart = (int)ScreenWidthStart;
		 
		 double ScreenWidthEnd = dimension.getWidth()* 0.2;
		 int scroolEnd =(int)ScreenWidthEnd;
		 
		 
		//swiping page
		
		new TouchAction((PerformsTouchActions)appdriver).press(PointOption.point(0,scrollStart))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(0,scroolEnd))
			.release().perform();
			}

	

}
