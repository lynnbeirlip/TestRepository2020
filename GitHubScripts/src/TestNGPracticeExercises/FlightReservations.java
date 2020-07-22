package TestNGPracticeExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlightReservations {
	WebDriver driver;
	String url = "https://ingagegroup.github.io/booking.html";

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

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

	@AfterClass
	public void wrapUp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}