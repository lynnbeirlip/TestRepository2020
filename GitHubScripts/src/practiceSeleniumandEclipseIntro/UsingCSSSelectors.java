package practiceSeleniumandEclipseIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSSelectors {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://demoqa.com/automation-practice-form/";
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
 
		// Launch the ToolsQA WebSite
		driver.get(baseURL);
		driver.manage().window().maximize();
 
		// Type first name in the FirstName text box  
		WebElement firstname = driver.findElement(By.cssSelector("#content > div.demo-frame > div > form > fieldset > div:nth-child(9) > input[type=text]"));
		firstname.sendKeys("Chris");
		
		//Type last name in the LastName test box
		WebElement lastname = driver.findElement(By.cssSelector("#lastname"));
		lastname.sendKeys("Cooper");
		
		Thread.sleep(3000);
		
		//Scroll down to see the submit button
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1200)");
		
		
		
		//Click on the submit button
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
