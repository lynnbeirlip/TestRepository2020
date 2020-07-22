package examplesActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropExample {
	WebDriver driver;			

    @Test		
    public void DragnDrop() throws InterruptedException					
    {		
         System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
         
         driver= new ChromeDriver();					
         driver.get("http://demo.guru99.com/test/drag_drop.html");		
         JavascriptExecutor js = (JavascriptExecutor) driver;
         driver.manage().window().maximize();
         Thread.sleep(3000);
         js.executeScript("window.scrollBy(0,500)"); 
      
		//Element which needs to drag.  
            WebElement From = driver.findElement(By.id("credit2"));
        	//WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
         
         //Element on which need to drop.		
         //WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));	
         WebElement To = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	    //Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();		
	
         Thread.sleep(10000);
         driver.close();
    }		
    
}
