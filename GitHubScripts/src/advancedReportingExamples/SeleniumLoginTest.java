package advancedReportingExamples;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class SeleniumLoginTest {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	@Test
	public void test_validLoginTest() throws InterruptedException {
		//This is a sample comment
		test = report.createTest("passTest");
		
		WebElement loginButton = driver.findElement(By.linkText("Sign in"));
		loginButton.click();
		test.log(Status.INFO, "Clicked on Sign Up link.");
		
		WebElement emailField = driver.findElement(By.id("email"));
				
		//NOTE: May need to change value to be entered in emailField if account has already been created with this login.
		emailField.sendKeys("mytest13@gmail.com");
		test.log(Status.INFO, "Entered email address.");
	  
		WebElement passwordField = driver.findElement(By.id("passwd")); 
		passwordField.sendKeys("abcabc");
		test.log(Status.INFO, "Entered password.");
		
		Thread.sleep(3000);
		WebElement goButton = driver.findElement(By.id("SubmitLogin"));
		goButton.click();
		test.log(Status.INFO, "Clicked Login button.");
		
		Thread.sleep(3000);
		
		WebElement welcomeText = null;
		
		try {
			welcomeText = driver.findElement(By.className("info-account"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		//Add Assert 
		AssertJUnit.assertTrue(welcomeText != null);
		test.log(Status.PASS, "Verified Welcome Text");
		
		}

	
	
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://automationpractice.com/index.php";
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
		report = new ExtentReports ();
		report.attachReporter(htmlReporter);
		report.setSystemInfo("Host Name", "SoftwareTestingMaterial");
		report.setSystemInfo("Environment", "Automation Testing");
		report.setSystemInfo("User Name", "Rajkumar SM");
		 
		htmlReporter.config().setDocumentTitle("Automated Login Report");
		htmlReporter.config().setReportName("Capture log of status updates during login to automation practice site");
		 
		 
	  
		//Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@AfterMethod
	public void getResult(ITestResult result) throws InterruptedException{
		if(result.getStatus() == ITestResult.FAILURE){
			test.log(Status.FAIL, "Test Case Failed is "+result.getName());
			//MarkupHelper is used to display the output in different colors
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			}else if(result.getStatus() == ITestResult.SKIP){
			test.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
			}
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign out")).click();
	}
	
	@AfterTest
	 public void endReport(){
	 report.flush();
	 driver.close();
	    }


}
