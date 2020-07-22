package webElements;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.*;
public class NavigateCommands {
	public static void main(String[] args) throws InterruptedException {
		
		//Set path to Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
				
		// Open ToolsQA web site
		String appUrl = "https://demoqa.com/automation-practice-form/";
		//driver.get(appUrl);
		driver.navigate().to(appUrl);
		Thread.sleep(3000);
		
		// Click on the Interactions link in the menu bar
		//driver.findElement(By.linkText("Interactions")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[2]/a")).click();
 
		//Pause so that the user can see what is happening
		Thread.sleep(3000);
		
		// Go back to Home Page
		driver.navigate().back();
 
		//Pause so that the user can see what is happening
		Thread.sleep(3000);
				
		// Go forward to Interactions page
		driver.navigate().forward();
 
		//Pause so that the user can see what is happening
		Thread.sleep(3000);
		
		// Go back to Home page
		driver.navigate().to(appUrl);
 
		//Pause so that the user can see what is happening
		Thread.sleep(3000);
		
		// Refresh browser
		driver.navigate().refresh();
 
		// Close browser
		driver.close();
	}
}
