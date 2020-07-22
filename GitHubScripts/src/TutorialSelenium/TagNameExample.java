package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class TagNameExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String baseURL = "http://www.google.com";
	    WebDriver driver;                          
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(baseURL);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    List<WebElement>links = driver.findElements(By.tagName("a"));
	    System.out.println("This webpage includes the following links" + links);
	    driver.close();}

	}
