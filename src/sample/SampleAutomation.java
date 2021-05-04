package sample;




import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SampleAutomation {
	
	public WebDriver driver;
	//public AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setUp() throws MalformedURLException{
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
		driver.get("https://www.w3schools.com/python/default.asp");
		driver.manage().window().maximize();
		//driver.switchTo().window(WindowType.WINDOW);
	}
	
	@Test
	public void verifyLaunchOfAdhaar() throws InterruptedException{
		System.out.println("Method Calling");
		List<WebElement>  next = driver.findElements(By.xpath("//div[@class='w3-clear nextprev']/child::a[contains(text(),'Next')]"));
		System.out.println(next.get(0).getText());
		Thread.sleep(2000);
//		WebElement allowWhileUsingApp = driver.findElement(By.id("permission_allow_foreground_only_button"));
//		allowWhileUsingApp.click();
	}
	
	@AfterTest
	public void tearDown(){
		System.out.println("TestCompleteted");
		//driver.quit();
	}
}

