package appiumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Util {
	static AndroidDriver<AndroidElement> driver;
	static TouchAction action = new TouchAction((AndroidDriver<AndroidElement>)driver);
	 static MultiTouchAction multiTouch = new MultiTouchAction((AndroidDriver<AndroidElement>)driver);

	public static void scrollDown(){
		Dimension dimension =AppDriver.getDriver().manage().window().getSize();
		
		int startScroll =(int)( dimension.getHeight() * 0.8);
		int endScroll = (int) (dimension.getHeight() * 0.3);
		
//		new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(0,startScroll))
//						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(0,endScroll)).release()
//						.perform();
		action.press(PointOption.point(0,startScroll)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0,endScroll))
		.release();
		multiTouch.add(action).perform();
		
		
	}
	
	public static void scrollNClick(By listItems ,String Text){
		boolean flag = false;
		while(true){
			for(WebElement el : AppDriver.getDriver().findElements(listItems)){
				if(el.getAttribute("Text").equals(Text)){
					el.click();
					flag =true;
					break;
				}
			}
			if(flag)
				break;
			else
				scrollDown();
		}
	}
	
	public static void scrollNClick(WebElement el){
		int retry =0;
		while(retry<=5){
			try{
				el.click();
				break;
			}catch( NoSuchElementException e){
				scrollDown();
				retry++;
			}
		}
	}
	
	public static void scrollIntoView(String Text){
		((AndroidDriver<MobileElement>) AppDriver.getDriver()).findElementByAndroidUIAutomator(
				"new UIScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + Text +"\").instance(0))")
				.click();
	}
	
	public static void tapOnElement(WebElement el){
		new TouchAction((PerformsTouchActions)AppDriver.getDriver()).longPress(new PointOption().withCoordinates(el.getLocation())).perform();
	}
}
