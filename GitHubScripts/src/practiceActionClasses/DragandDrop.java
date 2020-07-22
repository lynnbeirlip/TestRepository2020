package practiceActionClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	 
	    Actions act = new Actions(driver);
	 
	    // Script for dragging an element and dropping it in another place
	    WebElement iFrame = driver.findElement(By.tagName("iframe"));
	    
	    driver.switchTo().frame(iFrame);
	 
	    WebElement From = driver.findElement(By.id("draggable"));
	 
	    WebElement To = driver.findElement(By.id("droppable"));
	    //act.dragAndDrop(From, To);
	 
	    //act.clickAndHold(From).build().perform();
	    act.clickAndHold(From).perform();
	    act.moveToElement(To).perform();
	    act.release(To).perform();
	    Thread.sleep(5000);
	    driver.quit();
	    
	 
	    }
}
