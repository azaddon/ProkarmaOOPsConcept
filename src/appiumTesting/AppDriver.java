package appiumTesting;

import org.openqa.selenium.WebDriver;

public class AppDriver {
	
	private static ThreadLocal<WebDriver> driver1 = new ThreadLocal<>();
	
	public static WebDriver getDriver(){
        return driver1.get();
    }

    static void setDriver(WebDriver Driver){
        driver1.set(Driver);
    }

}
