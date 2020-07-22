package NavigateCommandsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigateCommands {
	WebDriver driver;
	String appUrl = "https://ingagegroup.github.io/";

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void navigatePages() throws InterruptedException {
		driver.navigate().to(appUrl);
		Thread.sleep(3000);

		// Click on the link to the Practice Automation Form in the menu bar
		driver.findElement(By.linkText("Practice Automation Form")).click();

		// Pause so that the user can see what is happening
		Thread.sleep(3000);

		// Go back to Home Page
		driver.navigate().back();

		// Pause so that the user can see what is happening
		Thread.sleep(3000);

		// Go forward to the Practice Automation Form page
		driver.navigate().forward();

		// Pause so that the user can see what is happening
		Thread.sleep(3000);

		// Go back to Home page
		driver.navigate().to(appUrl);
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		// Pause so that the user can see what is happening
		Thread.sleep(3000);

		// Refresh browser
		driver.navigate().refresh();

		// Close browser
		driver.close();
	}
}
