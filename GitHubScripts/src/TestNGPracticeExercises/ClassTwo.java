package TestNGPracticeExercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassTwo {
	static WebDriver driver;
    String actualTitle;
    
	@Test
  	public void AmazonTitle() {
		driver.navigate().to("http://amazon.com");
	  	actualTitle = driver.getTitle();
	     System.out.println("ActualTitle is " + actualTitle );
	     driver.close();
	}

	@BeforeClass
	public static void Beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterClass
	public static void Afterclass() {
		driver.quit();
	}
}
