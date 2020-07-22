package practiceSeleniumandEclipseIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSSelectors2 {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://demoqa.com/automation-practice-form/";
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
 
		// Launch the ToolsQA WebSite
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		//Scroll down to see the Partial Link Text link
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
 
		// Click on "Partial Link Text" link  
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link Text passed");
		
		//Convert element to a string
		String sClass = driver.findElement(By.tagName("button")).toString();
		System.out.println("The button is " + sClass);
		
		//Scroll down to see the Partial Link Text link
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,500)");
				
		//Click on "Link Text" link
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println("Link Text passed");
				
		Thread.sleep(5000);
		driver.close();
	}
}
