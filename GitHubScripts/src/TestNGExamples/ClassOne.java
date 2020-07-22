package TestNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ClassOne {
	static WebDriver driver;
	String actualTitle;
	String actualTitle2;

	@Test
	public void googletest() throws InterruptedException {
		System.out.println("The google test method in ClassOne has started.");
		driver.navigate().to("http://www.google.com");
		actualTitle = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle);
		Thread.sleep(3000);
		System.out.println("The google test method in ClassOne has completed.");
	}
	
	@Test
	public void amazontest() throws InterruptedException {
		System.out.println("The amazon test method in ClassOne has started.");
		driver.navigate().to("http://www.amazon.com");
		actualTitle2 = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle2);
		Thread.sleep(3000);
		System.out.println("The amazon test method in ClassOne has completed.");
	}

	@BeforeClass
	public static void Beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("The @BeforeClass method in ClassOne has run.");
	}

	@AfterClass
	public static void Afterclass() {
		System.out.println("The @AfterClass method in ClassOne has run.");
		driver.close();
	}
}
