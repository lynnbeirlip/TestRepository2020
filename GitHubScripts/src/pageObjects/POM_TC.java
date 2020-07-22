package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import pageObjects.LogIn_Page;

public class POM_TC {
	
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentHtmlReporter htmlReporter;

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = "C://Selenium//chromedriver.exe";
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/STMExtentReport.html");
		
		System.out.println(htmlReporter);
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		report.setSystemInfo("Host Name", "SoftwareTestingMaterial");
		report.setSystemInfo("Environment", "Automation Testing");
		report.setSystemInfo("User Name", "Lynn");

		htmlReporter.config().setDocumentTitle("Running Multiple Classes");
		htmlReporter.config().setReportName("Lynn's report");
		htmlReporter.config().setTheme(Theme.STANDARD);
	
		test = report.createTest("VerifyLoginTest");
       	
       	System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		test.log(Status.INFO, "ChromeDriver browswer has started.");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Guru99 Demo Website
		driver.get("http://demo.guru99.com/V4");
		test.log(Status.INFO, "Website access successful.");
 
        //Use page Object library		
		LogIn_Page.txtbx_UserName(driver).sendKeys("mngr252907");
		LogIn_Page.txtbx_Password(driver).sendKeys("burUpup");
		LogIn_Page.btn_LogIn(driver).click();
		
		// Print a Log In message to the screen
        System.out.println("Logged in successfully, now it is time to log off.");
        test.log(Status.INFO, "Login successful.");
        System.out.println("Logout successful");
        test.log(Status.INFO, "Logout successful");
 		
        // Close the driver
        test.log(Status.PASS, "Test script has passed");
        Thread.sleep(3000);
        driver.quit();
        report.flush();        
    }
}
