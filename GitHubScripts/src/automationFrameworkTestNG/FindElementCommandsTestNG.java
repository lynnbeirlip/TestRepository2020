package automationFrameworkTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FindElementCommandsTestNG {
	
		String baseURL = "https://demoqa.com/automation-practice-form/";
		WebDriver driver;
		
		@Test
		public void f() throws InterruptedException {
		
		// Launch the ToolsQA WebSite
		driver.get(baseURL);
 
		// Type Name in the FirstName text box      
		driver.findElement(By.name("firstname")).sendKeys("Firstname"); 
		 
		//Type LastName in the LastName text box
		driver.findElement(By.id("lastname")).sendKeys("Lastname");
		//driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]")).sendKeys("Sharma");
		
		//Adding pause so that users can see the first name and last name values before the Submit button is clicked.
		Thread.sleep(3000);
 
		// Click on the Submit button
		driver.findElement(By.name("submit")).click();
		}
		
		@BeforeClass
		  public void beforeClass() {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
		  }

		  @AfterClass
		  public void afterClass() throws InterruptedException {

				Thread.sleep(5000);
				driver.close();
			}
	}