package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightsReservations {	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url = "https://ingagegroup.github.io/booking.html";
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Sleep for 3 seconds; otherwise this script starts typing before it locates the departure city
		Thread.sleep(3000);
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
		
		//Select number of adults
		WebElement dropElement = driver.findElement(By.name("adults"));
		Select dropdown = new Select(dropElement);
		dropdown.selectByVisibleText("2");
		Thread.sleep(2000);
		
		//Select number of children
		WebElement dropElement2 = driver.findElement(By.name("children"));
		Select dropdown2= new Select(dropElement2);
		dropdown2.selectByVisibleText("2");
		Thread.sleep(2000);
			
		//Specify children's ages
			
		/*The age of the first child is selected using the JavascriptExecutor, which allows you to locate and perform 
		actions on hidden elements. However, it is not working to select the children's ages when the number of children
		has not been selected.*/ 
		 JavascriptExecutor js = (JavascriptExecutor)driver;  
         // Identifying the element using ID attribute and select the age from the dropdown list 
		 js.executeScript("document.getElementById('flight-age-select-1-flp').value='12'");  
		 Thread.sleep(2000);
   
		WebElement dropElement4 = driver.findElement(By.name("childrenAge2"));
		Select dropdown4 = new Select(dropElement4);
		dropdown4.selectByVisibleText("9");
		driver.findElement(By.id("flight-age-select-2-flp")).click();
		Thread.sleep(2000);
		
		//Click on Search button
		driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]")).click();
		Thread.sleep(5000);
		driver.quit();
    }
}


