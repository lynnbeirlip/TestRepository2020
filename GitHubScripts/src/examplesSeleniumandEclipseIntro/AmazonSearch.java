package examplesSeleniumandEclipseIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main (String[] args) {
		WebDriver driver;
		String baseUrl;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://www.amazon.com";
		
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("movies");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	}
}