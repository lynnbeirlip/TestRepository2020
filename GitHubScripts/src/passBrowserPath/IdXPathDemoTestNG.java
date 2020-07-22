package passBrowserPath;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class IdXPathDemoTestNG {
	@Parameters({ "browser_path" })
	@Test
	public void populateForm() throws InterruptedException {
	  String baseURL = "https://ingagegroup.github.io/practice-automation-form.html";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", browser_path);
		driver = new ChromeDriver();

		driver.get(baseURL);

		driver.findElement(By.xpath("/html/body/div/form/fieldset/div[8]/input")).sendKeys("John");
		driver.findElement(By.id("lastname")).sendKeys("Miller");
		Thread.sleep(3000);
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonwithclass")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  
  @AfterClass
  public void afterClass() {

  }

}
