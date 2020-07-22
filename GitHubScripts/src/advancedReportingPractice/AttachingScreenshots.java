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
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class AttachingScreenshots {
	static WebDriver driver;
	@BeforeSuite
	public void setup(){
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");

	System.setProperty("org.uncommons.reportng.escape-output", "false");
	driver = new ChromeDriver();
	}
	 
	@BeforeMethod
	public void beforeEachMethod(){
	driver.get("http://www.google.com");
	}
	//Test case 1
	public void cars() throws Exception {
	System.out.println("I am a Test method and I am searching for cars");
	driver.findElement(By.name("q")).sendKeys("Cars");
	driver.findElement(By.name("btnK")).click();
	 
	//Wait for the results to appear
	Thread.sleep(2000);
	takeScreenshot();
	if(driver.findElement(By.partialLinkText("car")).isDisplayed()){
	Assert.assertTrue(true); 
	}
	else{
	Assert.assertTrue(false);
	}
	}
	 
	@AfterClass
	public void endOfClass(){
	System.out.println("I am the end of the class");
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
	System.out.println("The path to the screenshot is " + path);
	Reporter.log(path);
	}
}

