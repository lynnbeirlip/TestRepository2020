package webElements;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class GetAttributeDemo {

	WebDriver driver;
	String baseUrl1;
	
		@BeforeClass
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			baseUrl1 = ("http://letskodeit.teachable.com/pages/practice");
			
		}
		
		
		@Test
		public void test() {
			driver.get(baseUrl1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			WebElement element = driver.findElement(By.id("name"));
			String attributeValue = element.getAttribute("class");
			
			
			System.out.println("Value of attribute is: " + attributeValue);
		}
		
		@AfterClass
		public void tearDown() throws Exception {
			Thread.sleep(3000);
			driver.quit();
		}
     
		
	}
