package advancedReportingPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.Status;



public class ClassOne {
	String actualTitle;
	String actualTitle2;
	static WebDriver driver; 
	static ExtentReports report;
    static ExtentTest test;
    static ExtentHtmlReporter htmlreporter;
    
   
    
   	@Test
	public void googletest() throws InterruptedException {
		System.out.println("The google test method in ClassOne has started.");
		test.log(Status.INFO, "Started reporting on multiple test cases");
		driver.navigate().to("http://www.google.com");
		actualTitle = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle);
		Thread.sleep(3000);
		System.out.println("The google test method in ClassOne has completed.");
		test.log(Status.PASS, "Actual title is " + actualTitle);
	}
	
	@Test
	public void amazontest() throws InterruptedException {
		System.out.println("The amazon test method in ClassOne has started.");
		driver.navigate().to("http://www.amazon.com");
		actualTitle2 = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle2);
		Thread.sleep(3000);
		System.out.println("The amazon test method in ClassOne has completed.");
		test.log(Status.PASS, "Actual title is " + actualTitle);
	}

	@BeforeClass
	public static void Beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("The @BeforeClass method in ClassOne has run.");
		report = ExtentFactory.getInstance();
		test = report.createTest("VerifyWelcomeTest");
    	test.log(Status.INFO, "Declared new driver, initialized report, and set instance.");
	}

	@AfterClass
	public static void Afterclass() {
		System.out.println("The @AfterClass method in ClassOne has run.");
		 //report.flush();   
		driver.close();
	}
}

