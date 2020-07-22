package practiceSwitchWindowsandiFrames;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class referencingElements {
	WebDriver driver;
	String baseUrl;
	//private String tableTab4;

	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
		driver = new ChromeDriver();
		baseUrl = ("https://demoqa.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void getPersonalInfo() throws InterruptedException {
		driver.get(baseUrl);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.switchTo().frame("IF2");

		WebElement SelectableLink = (driver.findElement(By.linkText("Selectable")));
		String linkText = SelectableLink.getText();
		System.out.println("The text on the Selectable link in iFrame 2 is " + linkText);
		SelectableLink.click();
		driver.switchTo().parentFrame();
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}
}

