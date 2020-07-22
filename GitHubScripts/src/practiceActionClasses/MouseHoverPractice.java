package practiceActionClasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPractice {
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
		
		//Mouse over on DISCOVER link
		Actions act = new Actions(driver);
		By testlink = By.linkText("DISCOVER");
		WebElement test = driver.findElement(testlink);
		act.moveToElement(test).build().perform();
				
		Thread.sleep(5000);
		
		//Mouse over on DISCOVER link
		Actions act2 = new Actions(driver);
		By testlink2 = By.linkText("Myntra Fashion Superstar");
		WebElement test2 = driver.findElement(testlink2);
		act2.moveToElement(test2).build().perform();
		test2.click();
						
		Thread.sleep(5000);
		
		//Closing current driver window
		driver.close();
	}
}
		

