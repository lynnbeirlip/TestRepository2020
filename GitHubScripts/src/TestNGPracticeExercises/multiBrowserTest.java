package TestNGPracticeExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class multiBrowserTest {
	WebDriver driver;
	String url;
	 
	  @Parameters("browser")
	 
	  // Passing Browser parameter from TestNG xml
	  @BeforeTest  
	  public void beforeTest(String browser) {
		  url = "https://ingagegroup.github.io/booking.html";
	  // If the browser is Firefox, then do this	 
	  if(browser.equalsIgnoreCase("firefox")) {
		   
		  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		  //System.setProperty("webdriver.firefox.marionette=", "C:\\Selenium\\geckodriver.exe");	  
		  driver = new FirefoxDriver();
		  System.out.print("This is the Firefox driver.");
		 
	  }else if (browser.equalsIgnoreCase("chrome")) { 
			 
		  // Setting up the path for my ChromeDriver	 
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	 
		  driver = new ChromeDriver();
		  System.out.print("This is the Chrome driver.");
	 		 
	  // If browser is Edge, then do this	  	 
	  }else if (browser.equalsIgnoreCase("edge")) { 
	 
		  // Setting up the path for my IEDriver	 
		  System.setProperty("webdriver.edge.driver", "C:\\Selenium\\EdgeDriver\\msedgedriver.exe");
			 
		  driver = new EdgeDriver();
		  System.out.println("This is the Edge driver.");		  
	  } 	 
	}
	  @Parameters("browser")
	  @Test
		public void scheduleTrip() throws InterruptedException {
			driver.navigate().to(url);
			WebElement departureCity = driver.findElement(By.id("flight-origin-flp"));
			Thread.sleep(3000);
			departureCity.clear();
			departureCity.sendKeys("Cincinnati, OH");

			WebElement destinationCity = driver.findElement(By.id("flight-destination-flp"));
			Thread.sleep(3000);
			destinationCity.clear();
			destinationCity.sendKeys("Fort Lauderdale, FL");
			Thread.sleep(3000);

			driver.findElement(By.id("flight-departing-flp")).sendKeys("01/01/2021");

			WebElement returnDate = driver.findElement(By.id("flight-returning-flp"));
			returnDate.sendKeys("01/31/2021");
			Thread.sleep(3000);

			// Select number of adults
			WebElement dropElement = driver.findElement(By.name("adults"));
			Select dropdown = new Select(dropElement);
			dropdown.selectByVisibleText("2");
			Thread.sleep(2000);

			// Select number of children
			WebElement dropElement2 = driver.findElement(By.name("children"));
			Select dropdown2 = new Select(dropElement2);
			dropdown2.selectByVisibleText("2");
			Thread.sleep(2000);

			// Specify children's ages
			WebElement dropElement3 = driver.findElement(By.id("flight-age-select-1-flp"));
			Select dropdown3 = new Select(dropElement3);
			dropdown3.selectByVisibleText("12");
			driver.findElement(By.id("flight-age-select-1-flp")).click();
			Thread.sleep(2000);

			WebElement dropElement4 = driver.findElement(By.name("childrenAge2"));
			Select dropdown4 = new Select(dropElement4);
			dropdown4.selectByVisibleText("9");
			driver.findElement(By.id("flight-age-select-2-flp")).click();
			Thread.sleep(2000);

			// Click on Search button
			driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]")).click();
		}
	  @AfterClass public void afterTest() throws InterruptedException { 
			  Thread.sleep(10000);
			  driver.quit();		 
			}
}
