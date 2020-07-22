package advancedReportingPractice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentFactory {
	public static ExtentReports getInstance() {
		
		ExtentReports report;
		ExtentHtmlReporter htmlreporter;
		report = new ExtentReports();
		htmlreporter = new ExtentHtmlReporter("C:\\Users\\Lynn Beirl\\eclipse-workspace\\GitHubScripts\\test-output\\multiple-test-case-report.html");
		report.attachReporter(htmlreporter);
		return report;
		
	}

}
