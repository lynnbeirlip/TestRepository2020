package automationFrameworkTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TravelocityFlightsTestNG {
	WebDriver driver;
	String url = "http://www.travelocity.com/Flights";
	
	@Test
	public void dropDownTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		// Sleep for 3 seconds; otherwise this scripts starts typing before it locates
		// the departure city
		Thread.sleep(3000);
		driver.navigate().to(url);
		driver.findElement(By.id("flight-origin-flp")).sendKeys("Cincinnati, OH");
		driver.findElement(By.xpath(".//*[@id='flight-destination-flp']")).clear();
		WebElement destinationCity = driver.findElement(By.xpath(".//*[@id='flight-destination-flp']"));
		destinationCity.clear();
		destinationCity.sendKeys("Fort Lauderdale, FL");

		driver.findElement(By.id("flight-returning-flp")).sendKeys("12/09/2019");
		driver.findElement(By.id("flight-departing-flp")).sendKeys("12/01/2019");
		Thread.sleep(3000);

		// Select number of adults
		WebElement dropElement = driver.findElement(By.id("flight-adults-flp"));
		Select dropdown = new Select(dropElement);
		dropdown.selectByVisibleText("2");

		// Select number of children
		WebElement dropElement2 = driver.findElement(By.id("flight-children-flp"));
		Select dropdown2 = new Select(dropElement2);
		dropdown2.selectByVisibleText("2");
		driver.findElement(By.id("flight-children-flp")).click();

		// Specify children's ages
		WebElement dropElement3 = driver.findElement(By.id("flight-age-select-1-flp"));
		Select dropdown3 = new Select(dropElement3);
		dropdown3.selectByVisibleText("12");
		driver.findElement(By.id("flight-age-select-1-flp")).click();

		WebElement dropElement4 = driver.findElement(By.id("flight-age-select-2-flp"));
		Select dropdown4 = new Select(dropElement4);
		dropdown4.selectByVisibleText("9");
		driver.findElement(By.id("flight-age-select-2-flp")).click();

		// Click on Search button
		driver.findElement(By.xpath(".//*[@id='gcw-flights-form-flp']/div[8]/label/button")).click();
		driver.quit();
	}

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void wrapUp() {
		driver.quit();
	}
}
