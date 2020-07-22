package practiceUsefulMethodsandProperties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresentPractice {
	WebDriver driver;
	String Audi = null;
	String baseURL;
	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
		driver = new ChromeDriver();
		baseURL = ("http://letskodeit.teachable.com/pages/practice");
		driver.get(baseURL);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void ElementPresencePractice() {
		driver.get(baseURL);
		driver.manage().window().maximize();
		if(driver.findElements(By.xpath(".//*[@id='checkbox-example']/fieldset")).size() != 0){
			String elementList = driver.findElement(By.xpath(".//*[@id='checkbox-example']/fieldset")).getText();
			String Audi = "Audi";
		    String Benz = "Benz";
		    System.out.println("The list of cars is the " + elementList);
		    if (elementList.contains(Audi))
		    	System.out.println("Element list includes " + Audi);
		    else
		    	System.out.println(Audi + " is not included in element list");
		
		 	if (elementList.contains(Benz))
		    	System.out.println("Element list includes " + Benz);
		    else
		    	System.out.println(Benz + " is not included in element list");}	
	    }
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
}
