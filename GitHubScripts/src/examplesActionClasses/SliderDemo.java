package examplesActionClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	public static WebDriver driver;
	static String URL = "http://jqueryui.com/slider/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get(URL);
	    driver.manage().window().maximize();	 
	 
	    // Script for dragging a bar across a horizontal slider
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span")); 
		Actions actions = new Actions(driver); 
		Thread.sleep(5000);
		actions.moveToElement(slider).dragAndDropBy(slider, 150, 0).build().perform(); 
		System.out.println("Slide Action performed.");
		Thread.sleep(3000);
		driver.close();
				   
	    }
}

