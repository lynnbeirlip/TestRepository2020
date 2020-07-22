package TestNGSeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SeleniumWebdriverTest {
	WebDriver driver;	
	
  @Test
  public void MyFirstTestNGTestCase() throws InterruptedException {
	  
	  String title = driver.getTitle();
		System.out.print("Current page title is : " + title);

		WebElement user = driver.findElement(By.name("userName"));
		user.sendKeys("test");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("test");
		WebElement signin = driver.findElement(By.name("login"));
		signin.click();

		Thread.sleep(1000);

		System.out.print("\n'SUCCESSFUL EXECUTION!!!");
  }
  @BeforeMethod
  public void beforeMethod() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.print("\nBrowser close");
		driver.quit();
  }

}
