package sample;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.StringJoiner;
//import java.util.StringTokenizer;
//
//import org.testng.ITestContext;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.Markup;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//
//import extentListener.ExtentManager;

public class Sample {

	public static void main(String[] args) {

		// int[] a ={2,1,3,3,4,5};
		// int[] b = {7,3,8};
		//
		// LinkedHashSet<Integer> set = new LinkedHashSet<>();
		// for(int i=0;i<a.length;i++){
		// set.add(a[i]);
		// }
		// for(Integer intr : set){
		// System.out.println(intr);
		// }
		// ++++++++++++++++++++++++++++++++++++++
		// String s= "this is String";
		//
		// String reverse ="";
		// String words[]=s.split(" ");
		// String reverseWord="";
		// for(String w:words){
		// StringBuilder sb=new StringBuilder(w);
		// sb.reverse();
		// reverseWord+=sb.toString()+" ";
		//
		// }
		// System.out.println(reverseWord);
		// ++++++++++++++++++++++++++++++++++++++++++
		// StringJoiner sj = new StringJoiner(":");
		// sj.add("George").add("Sally").add("Fred");
		// String desiredString = sj.toString();
		// System.out.println(desiredString);
		// ++++++++++++++++++++++++++++++++++++
//		String PrimeNumbers = "";
//		for (int i = 1; i <= 10; i++) {
//			int counter = 0;
//			for (int j = i; j >= 1; j--) {
//				if (i % j == 0) {
//					counter = counter + 1;
//				}
//			}
//			if (counter == 2) {
//				PrimeNumbers = PrimeNumbers + i + " ";
//			}
//		}
//		System.out.println(PrimeNumbers);
		//++++++++++++++++++++++++++
		//ExtentListenerCode
//		static Date d = new Date();
//		static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
//
//		private static ExtentReports extent = ExtentManager.createInstance(System.getProperty("user.dir")+"/reports/"+fileName);
//		
//		public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();
//
//		public void onTestStart(ITestResult result) {
//
//			ExtentTest test = extent.createTest(result.getTestClass().getName()+"     @TestCase : "+result.getMethod().getMethodName());
//			System.out.println(result.getTestClass().getName() + "::::::::" +result.getMethod().getMethodName());
//	        testReport.set(test);
//	        
//
//		}
//
//		public void onTestSuccess(ITestResult result) {
//			String methodName=result.getMethod().getMethodName();
//			String logText="<b>"+"TEST CASE:- "+ methodName.toUpperCase()+ " PASSED"+"</b>";		
//			Markup m=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
//			testReport.get().pass(m);
//		}
//
//		public void onTestFailure(ITestResult result) {
//			testReport.get().fail(result.getThrowable().getMessage().toString());
//			String excepionMessage=Arrays.toString(result.getThrowable().getStackTrace());
//			testReport.get().fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
//					+ "</font>" + "</b >" + "</summary>" +excepionMessage.replaceAll(",", "<br>")+"</details>"+" \n");
//			String failureLogg="TEST CASE FAILED";
//			Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
//			testReport.get().log(Status.FAIL, m);
//		}
//
//		public void onTestSkipped(ITestResult result) {
//			String methodName=result.getMethod().getMethodName();
//			String logText="<b>"+"Test Case:- "+ methodName+ " Skipped"+"</b>";		
//			Markup m=MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
//			testReport.get().skip(m);
//		}
//
//		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//			// TODO Auto-generated method stub
//		}
//
//		public void onStart(ITestContext context) {
//
//		}
//
//		public void onFinish(ITestContext context) {
//
//			if (extent != null) {
//
//				extent.flush();
//				
//			}
//
//		}
		//+++++++++++++++++++++++++++++
		//ExtentManagerCode
//		private static ExtentReports extent;
//		public static ExtentReports createInstance(String fileName) {
//	        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);
//	       
//	        
//	        sparkReporter.config().setTheme(Theme.STANDARD);
//	        sparkReporter.config().setDocumentTitle(fileName);
//	        sparkReporter.config().setEncoding("utf-8");
//	        sparkReporter.config().setReportName(fileName);
//	        
//	        extent = new ExtentReports();
//	        extent.attachReporter(sparkReporter);
//	        extent.setSystemInfo("Automation Tester", "Mohd Azad");
//	        extent.setSystemInfo("Organization", "Codetalkers");
//	        extent.setSystemInfo("Build no", "QA_2_0_7");
//	        extent.setSystemInfo("Scope", "SMS_EMAIL MIT Test");
//	        
//	        return extent;
//	    }
//		
////		  public static String screenshotPath;
////		public static String screenshotName;
//	//	
////		public static void captureScreenshot() {
//	//
////			File scrFile = ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.FILE);
//	//
////			Date d = new Date();
////			screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
//	//
////			try {
////				FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\reports\\" + screenshotName));
////			} catch (IOException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//	//
//	//	
////		}
		
		
	}

}
