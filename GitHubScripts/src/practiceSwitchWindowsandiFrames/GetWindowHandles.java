package practiceSwitchWindowsandiFrames;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetWindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String baseUrl;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		baseUrl = ("http://www.phptravels.com/demo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		driver.get(baseUrl);
	
		//Get the Parent Handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent handle is: " + parentHandle);
				
		//Find Homepage Front End button
		WebElement frontendButton = driver.findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a"));
		js.executeScript("window.scrollBy(0,-1000)");
		String elementText = frontendButton.getText();
		System.out.println("Text on the Homepage Front-End button is: " + elementText);
		Thread.sleep(5000);
		frontendButton.click();
		Thread.sleep(5000);
		System.out.println("The script has clicked on the Front End button.");
		
		//Get all Handles
		Set<String> handles = driver.getWindowHandles();	    
        System.out.println("Here are all the handles:" + handles);
		
		//Switch between Handles
			for (String handle : driver.getWindowHandles()) {					
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				System.out.print("We have switched to this handle: " + handle);							   
	        	}
  
		driver.switchTo().window(parentHandle); 
		Thread.sleep(1000);
		driver.quit();
	}		
}
