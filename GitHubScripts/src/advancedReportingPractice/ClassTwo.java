package advancedReportingPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class ClassTwo {
	static WebDriver driver;
	String actualTitle;
	static ExtentReports report;
    static ExtentTest test;

	@Test
	public void Amazontest() {
		test.log(Status.INFO, "Started reporting on multiple test cases");
		System.out.println("The Amazontest method in ClassTwo has started.");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.navigate().to("http://amazon.com");
		actualTitle = driver.getTitle();
		
		test.log(Status.PASS, "Actual title is " + actualTitle);
        System.out.println("ActualTitle is " + actualTitle);
		System.out.println("The Amazontest method in ClassTwo has completed.");
	}

	@BeforeClass
	public static void Beforeclass() {	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		report = ExtentFactory.getInstance();
    	test = report.createTest("VerifyWelcomeTest");
    	test.log(Status.INFO, "Declared new driver, initialized report, and set instance.");
    	System.out.println("The @BeforeClass method in ClassTwo has run");
	}

	@AfterClass
	public static void Afterclass() {
		System.out.println("The @AfterClass method in ClassTwo has run.");
		 //report.flush();
    	 driver.close();
	}
}
