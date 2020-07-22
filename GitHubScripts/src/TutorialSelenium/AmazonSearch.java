package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String baseURL;
		baseURL = ("http://www.amazon.com");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washing machines for sale");
		Thread.sleep(3000);
		driver.findElement(By.xpath(("//*[@id=\"nav-search\"]/form/div[2]/div/input"))).click();
		
		Thread.sleep(3000);
		driver.close();
		} 

	}

