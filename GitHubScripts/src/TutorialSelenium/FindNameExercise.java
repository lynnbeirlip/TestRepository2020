package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNameExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String baseURL = ("http://newtours.demoaut.com/");
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);   
		driver.findElement(By.name("userName")).sendKeys("ccook");
		driver.findElement(By.name("password")).sendKeys("cathypw");
		driver.findElement(By.name("login")).click(); 
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000);
		driver.close();
		}

}
