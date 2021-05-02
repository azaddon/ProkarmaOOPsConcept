package appiumTesting;

import java.net.MalformedURLException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String platform = result.getMethod().getXmlTest().getLocalParameters().get("platform");
		
		if(platform.contains("Android")){
			try {
				AppFactory.launchBrowser();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		tearDown();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		tearDown();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		tearDown();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	private void tearDown() {
		AppDriver.getDriver().close();
		
	}

}
