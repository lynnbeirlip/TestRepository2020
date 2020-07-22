package practiceSwitchWindowsandiFrames;
 
import java.util.Set; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class PracticeSwitchWindows {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; 	
	 
			// Create a new instance of the Chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
 			driver = new ChromeDriver();
 
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
 	        driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
 
	        // Store and print the name of the first window on the console
 	        String handle= driver.getWindowHandle();
 	        System.out.println(handle);
 	        Thread.sleep(3000);
 	       // Click on the button "New Message Window"
 	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/button[2]")).click();
 	        Thread.sleep(3000);
 	        //Store and print the name of all the open windows
 	        Set<String> handles = driver.getWindowHandles();
 	        System.out.println(handles);
 	        
 	        //Pass a window handle to the other window
 	        for (String handle1 : driver.getWindowHandles()) {
 	        	System.out.println(handle1);;
 	        	driver.switchTo().window(handle1);
 	        }
 
            // Closing pop up window
 	        driver.close();
 	        
 	        // Close original window
 	        driver.quit(); 	            
	} 
}