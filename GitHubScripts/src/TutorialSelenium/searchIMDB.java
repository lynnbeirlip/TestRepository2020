package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchIMDB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseURL = ("http://www.imdb.com/");
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);   
		driver.findElement(By.id("suggestion-search")).sendKeys("Star Wars");
		driver.findElement(By.id("suggestion-search-button")).click();
		
		Thread.sleep(10000);

		driver.close();

	}

}
