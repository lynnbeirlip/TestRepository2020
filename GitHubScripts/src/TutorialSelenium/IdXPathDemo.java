package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdXPathDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseURL = "https://ingagegroup.github.io/practice-automation-form.html";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(baseURL);

		driver.findElement(By.xpath("/html/body/div/form/fieldset/div[8]/input")).sendKeys("John");
		driver.findElement(By.id("lastname")).sendKeys("Miller");
		Thread.sleep(3000);
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonwithclass")).click();
		
		Thread.sleep(2000);
		driver.close();
	
		}

}


