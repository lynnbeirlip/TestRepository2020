package examplesActionClasses;
import org.testng.ITestListener;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {
	public static WebDriver driver;
	static String URL = "http://www.myntra.com/";
	
	public static void main(String[] args) throws InterruptedException {
		//Initialize WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
		driver = new ChromeDriver();
		driver.get(URL);
		
		//Wait for page to load, go to the URL and maximize the window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.myntra.com/");
		driver.manage().window().maximize();
		
		//Mouse over on Men link
		Actions act = new Actions(driver);
		By testlink = By.linkText("MEN");
		WebElement test = driver.findElement(testlink);
		act.moveToElement(test).perform();
		
		Thread.sleep(15000);
		
		//Closing current driver window
		driver.close();
	}
}
		

