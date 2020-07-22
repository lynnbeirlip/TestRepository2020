package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementTest1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");

		// Clicking on the Hide button
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");

		// Identifying the element using ID attribute and entering the value in the textbox
		js.executeScript("document.getElementById('displayed-text').value='text123'");

		//Click on the show button to see the value entered in the textbox
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(3000);
		driver.close();


	}
}