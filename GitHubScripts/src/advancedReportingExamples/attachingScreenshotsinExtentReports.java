package advancedReportingExamples;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.http.HttpGenerator.Result;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class attachingScreenshotsinExtentReports{
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	static WebDriver driver;

	
	@BeforeTest
	public void setup(){
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	
	System.setProperty("org.uncommons.reportng.escape-output", "false");
	driver = new ChromeDriver();
	}
	 
	@BeforeTest
	 public void startReport(){
	 
	 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	 report = new ExtentReports(); 
	 System.getProperty("user.dir" +"/test-output/STMExtentReport.html");
	 report.setSystemInfo("Host Name",  "Ingage Partners");
	 report.setSystemInfo("Environment",  "Software Testing Training");
     report.setSystemInfo("User Name", "Lynn Beirl");
     
     //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
     //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
     //report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	 
	 
	 htmlReporter.config().setDocumentTitle("Title of the Report Comes here");
	 htmlReporter.config().setReportName("Name of the Report Comes here");
	 htmlReporter.config().setTheme(Theme.STANDARD);
	 }
	
	@BeforeMethod
	public void beforeEachMethod(){
	driver.get("http://www.google.com");
	}
	 
	//Test case 1
	@Test
	public void cars() throws Exception {
	System.out.println("I am a Test method and I am searching for cars");
	test = report.createTest("carSearch");
	driver.findElement(By.name("q")).sendKeys("Cars");
	//driver.findElement(By.name("btnK")).click();
	driver.findElement(By.name("btnL")).click();
	 
	//Wait for the results to appear
	Thread.sleep(2000);
	if(driver.findElement(By.partialLinkText("car")).isDisplayed()){
		Assert.assertTrue(true);
		test.log(Status.PASS, "Test Case Passed is passTest");
	}
	
	else {
	Assert.assertTrue(false);
	test.log(Status.FAIL, "Test Case Failed is failTest"); }
	}

	@AfterMethod
	public void getResult(ITestResult result) throws Exception{
		 if(result.getStatus() == ITestResult.FAILURE){
			//MarkupHelper is used to display the output in different colors
			 test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			 test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			
			//Add it in the extent report 
			 String screenshotPath = takeScreenshot(driver, result.getName());
			 test.fail("Test Case Failed Snapshot is below " + test.addScreenCaptureFromPath(screenshotPath)); 
			 
			
		}else if(result.getStatus() == ITestResult.SKIP){
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
		}	
	}	
	@AfterTest
	public void endOfTest(){
	System.out.println("I am the end of test");
	report.flush();
	driver.quit();
	}	 
	public static String takeScreenshot(WebDriver driver, String screenShotName) throws Exception {
	String timeStamp;
	TakesScreenshot ts = (TakesScreenshot) driver;
	timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
	String destination = System.getProperty("user.dir") + "\\Screenshots\\" + screenShotName;
	File screenShot = new File(destination + timeStamp+".png");
	
	
	//File srcFile = ts.getScreenshotAs(OutputType.FILE);
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//The below method will save the screen shot in the user directory on the c: drive with name "screenshot.png"
	File finalDestination = new File(destination);
	FileUtils.copyFile(srcFile, finalDestination);
	 
	String filePath = finalDestination.toString();
	
	//String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";
	System.out.println("The path to the screenshot is " + finalDestination);
	Reporter.log(filePath);
	System.out.println("The destination being returned is " + destination);
	return destination;
	

}
}

