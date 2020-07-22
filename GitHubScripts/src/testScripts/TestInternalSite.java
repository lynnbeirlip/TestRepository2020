package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInternalSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String baseURL = ("https://ingagegroup.github.io/booking.html");
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);  
		
		
		//driver.findElement(By.id("one-way")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.className("more-link")).click();
		driver.findElement(By.name("class-of-travel")).click();
		
		Thread.sleep(3000);
		
		//Select "Business class" as the class of travel  
		driver.findElement(By.cssSelector(("body > div > div > div.col-12.col-md-4.offset-md-1 > div > form > fieldset.more-option > details > div:nth-child(2) > select > option:nth-child(2)"))).click();
	
		//Navigate to Calendar pae
		String baseURL2 = ("https://ingagegroup.github.io/calendar.html");
		driver.get(baseURL2);
		//driver.findElement(By.className("fc-day-top fc-fri fc-past")).click();
		driver.findElement(By.cssSelector("#calendar > div.fc-view-container > div > table > tbody > tr > td > div > div > div:nth-child(3) > div.fc-content-skeleton > table > thead > tr > td.fc-day-top.fc-fri.fc-past")).click();
		//driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[3]/div[2]/table/thead/tr/td[6]/span")).click();
		//driver.findElement(By.className("fc-day-top fc-fri fc-past")).click();
		

		//Select event color of blue
		//driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[5]/div[2]/table/thead/tr/td[4]")).click();
		//WebElement addEventWindow = driver.findElement(By.id("modal-view-event-add"));
		//driver.switchTo().frame(addEventWindow);
		//Thread.sleep(3000);
		//driver.findElement(By.className("ecolor")).click();
		//driver.findElement(By.cssSelector("#add-event > div.modal-body > div:nth-child(5) > select > option:nth-child(2)")).click();
		//Thread.sleep(3000);
		//driver.close();
		}

}

