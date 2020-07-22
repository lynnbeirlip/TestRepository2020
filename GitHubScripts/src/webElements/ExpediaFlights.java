package webElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpediaFlights {	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url = "http://www.expedia.com";
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Sleep for 3 seconds; otherwise this scripts starts typing before it locates the departure city
		Thread.sleep(3000);
		driver.navigate().to(url);
		WebElement departureCity = driver.findElement(By.id("package-origin-hp-package"));
		Thread.sleep(3000);
		departureCity.clear();
		departureCity.sendKeys("Cincinnati, OH");
		
		WebElement destinationCity = driver.findElement(By.id("package-destination-hp-package"));
		Thread.sleep(3000);
		destinationCity.clear();
		destinationCity.sendKeys("Fort Lauderdale, FL");
	 
		WebElement departureDate = driver.findElement(By.id("package-departing-hp-package"));
		departureDate.sendKeys("04/01/2020");
		
		WebElement returnDate = driver.findElement(By.id("package-returning-hp-package"));
		returnDate.sendKeys("04/09/2020");
		
		
		

		Thread.sleep(3000);
			
		//Select number of adults
		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-package\"]/div/ul/li/button")).click();
		WebElement numAdults = driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-package\"]/div/ul/li/div/div/div[1]/div[2]/div[4]/button/span[1]/svg"));
		
		if (numAdults.isDisplayed())
			numAdults.click();

/*		
		//Select number of children
		WebElement dropElement2 = driver.findElement(By.id("flight-children-flp"));
		Select dropdown2= new Select(dropElement2);
		dropdown2.selectByVisibleText("2");
		driver.findElement(By.id("flight-children-flp")).click();
		
		//Specify children's ages
		WebElement dropElement3 = driver.findElement(By.id("flight-age-select-1-flp"));
		Select dropdown3 = new Select(dropElement3);
		dropdown3.selectByVisibleText("12");
		driver.findElement(By.id("flight-age-select-1-flp")).click();
		
		WebElement dropElement4 = driver.findElement(By.id("flight-age-select-2-flp"));
		Select dropdown4 = new Select(dropElement4);
		dropdown4.selectByVisibleText("9");
		driver.findElement(By.id("flight-age-select-2-flp")).click();
		
		//Click on Search button
		driver.findElement(By.xpath(".//*[@id='gcw-flights-form-flp']/div[8]/label/button")).click();
		driver.quit();
*/    }
}


