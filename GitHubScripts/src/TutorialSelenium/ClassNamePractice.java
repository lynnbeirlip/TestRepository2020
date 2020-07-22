package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNamePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String baseURL = "http://only-testing-blog.blogspot.in/2013/11/new-test.html#sthash.1k1fj6QD.dpuf";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		Thread.sleep(3000);
		String datentime = driver.findElement(By.className("date-header")).getText();
        System.out.println("The date is " + datentime);
        Thread.sleep(3000);
        driver.close();
	}

}
