package ListenerDemo;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;             		

@Listeners(ListenerDemo.ListenerTest.class)			
public class TestCases {
	WebDriver driver;
	
//Test to pass to verify listeners.		
@Test		
public void Login()				
{
	//driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/V4/");					
	driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	driver.findElement(By.name("password")).sendKeys("amUpenu");							
	//driver.findElement(By.id("")).click();
	driver.findElement(By.name("btnLogin")).click();
}		

//Forcefully failed this test to verify listener.		
@Test		
public void TestToFail() throws InterruptedException				
{		
    System.out.println("This test method failed");		
    Thread.sleep(3000);
    Assert.assertTrue(false);	
    driver.quit();
}	
}