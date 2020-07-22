package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerIMDB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseURL = ("http://www.imdb.com/");
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL); 
		
		//Click on "Sign In" button
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(5000);
		
		//Click on "Create a New Account" button
		driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[2]/a")).click();

		//Enter new customer information
		driver.findElement(By.name("customerName")).sendKeys("Joe User");
		driver.findElement(By.name("email")).sendKeys("joe.user@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("joespw123");
		driver.findElement(By.id("ap_password_check")).sendKeys("joespw123");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(10000);

		driver.close();

	}

}
