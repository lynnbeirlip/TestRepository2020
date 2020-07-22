package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementCommands {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://demoqa.com/automation-practice-form/";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		// Launch the ToolsQA WebSite
		driver.get(baseURL);

		// Type Name in the FirstName text box
		driver.findElement(By.name("firstname")).sendKeys("Firstname");

		// Type LastName in the LastName text box
		driver.findElement(By.id("lastname")).sendKeys("Lastname");
		// driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]")).sendKeys("Sharma");

		// Adding pause so that users can see the first name and last name values before
		// the Submit button is clicked.
		Thread.sleep(3000);

		// Click on the Submit button
		driver.findElement(By.name("submit")).click();

		Thread.sleep(10000);
		driver.close();
	}
}