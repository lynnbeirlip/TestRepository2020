package automationFrameworkTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NavigateCommandsTestNG {
	static WebDriver driver;
	String baseURL = "http://demo.guru99.com/test/newtours/";
	//String driverPath = "C:\\chromedriver_win32\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  @Test
	  public void verifyHomepageTitle() {
		 // driver = new ChromeDriver();
	      driver.get(baseURL);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	  }
	  @BeforeClass
	  public static void beforeClass() {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
	}

}
