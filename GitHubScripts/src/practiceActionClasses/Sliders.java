package practiceActionClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Sliders {
	
	private static ChromeDriver driver;
	
	@BeforeClass
	public static void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void AfterClass() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void slide() throws Exception
	{
		//Navigate to Slider screen and then click on link to vertical slider
		driver.get("http://jqueryui.com/slider/");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/ul/li[11]/a")).click();
		Thread.sleep(10000);
		//Switch to iframe containing slider
		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iFrame);
		//WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span")); 
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		Actions actions = new Actions(driver); 
		actions.clickAndHold(slider);
		actions.moveByOffset(0, 30);
	    actions.release().build().perform();
		
		Thread.sleep(5000);
	}
}
