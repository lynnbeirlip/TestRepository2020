package TestNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ClassTwo {
	static WebDriver driver;
	String actualTitle;

	@Test
	public void Amazontest() {
		System.out.println("The Amazontest method in ClassTwo has started.");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.navigate().to("http://amazon.com");
		actualTitle = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle);
		System.out.println("The Amazontest method in ClassTwo has completed.");
	}

	@BeforeClass
	public static void Beforeclass() {	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		System.out.println("The @BeforeClass method in ClassTwo has run");
	}

	@AfterClass
	public static void Afterclass() {
		System.out.println("The @AfterClass method in ClassTwo has run.");
		driver.close();
	}
}
