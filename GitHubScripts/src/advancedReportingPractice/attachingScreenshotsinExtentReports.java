package advancedReportingPractice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class attachingScreenshotsinExtentReports{
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	static ExtentTest test;
	static WebDriver driver;

	
	@BeforeTest
	public void setup(){
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	report = new ExtentReports();
	System.setProperty("org.uncommons.reportng.escape-output", "false");
	driver = new ChromeDriver();
	}
	 
	@BeforeTest
	 public void startReport(){
	 
	 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
	 report = new ExtentReports ();
	 report.attachReporter(htmlReporter);
	 report.setSystemInfo("Host Name", "SoftwareTestingMaterial");
	 report.setSystemInfo("Environment", "Automation Testing");
	 report.setSystemInfo("User Name", "Rajkumar SM");
	 
	 htmlReporter.config().setDocumentTitle("Attaching Screenshots to an Extent Report");
	 htmlReporter.config().setReportName("Failed Google Search");
	 htmlReporter.config().setTheme(Theme.STANDARD);
	 }
	
	@BeforeMethod
	public void beforeEachMethod(){
	driver.get("http://www.google.com");
	}
	 

	@Test
	public void cars() throws Exception {
	System.out.println("I am a Test method and I am searching for cars");
	test = report.createTest("carSearch");
	driver.findElement(By.name("q")).sendKeys("Cars");
	driver.findElement(By.name("btnK")).click();
	//Wait for the results to appear
	Thread.sleep(2000);
	if(driver.findElement(By.partialLinkText("car")).isDisplayed()){
	Assert.assertTrue(true); 
	test.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));
	}
	else {
	Assert.assertTrue(false);
	test.log(Status.FAIL, "Test Case Failed is failTest"); }
	}

	@AfterMethod
	public void getResult(ITestResult result) throws Exception{
		if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Case Passed is " + result.getName());
			takeScreenshot();
								
	    } else if(result.getStatus() == ITestResult.FAILURE){
			test.log(Status.FAIL, "Test Case Failed is " + result.getName());
			test.log(Status.FAIL, "Test Case Failed is " + result.getThrowable());
			takeScreenshot();
			
		}else if(result.getStatus() == ITestResult.SKIP){
			test.log(Status.SKIP, "Test Case Skipped is " + result.getName());
		}	
	}	
	@AfterTest
	public void endOfTest(){
	System.out.println("I am the end of test");
	report.flush();
	driver.quit();
	}	 
		
	public static void takeScreenshot() throws Exception {
	String timeStamp;
	File screenShotName;
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	//The below method will save the screen shot in the user directory on the c: drive with name "screenshot.png"
	timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
	screenShotName = new File("C:\\Users\\Lynn Beirl\\eclipse-workspace\\Screenshots\\"+timeStamp+".png");
	FileUtils.copyFile(scrFile, screenShotName);
	String filePath = screenShotName.toString();
	String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";
	Reporter.log(path);
	System.out.println("The path is " + path);
	System.out.println("The filePath is " + filePath);
	
	//Add it in the extent report 
	test.log(Status.FAIL, "Script has failed").addScreenCaptureFromPath(filePath);
	}
}

