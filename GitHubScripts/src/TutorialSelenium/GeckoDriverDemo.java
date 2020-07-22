package TutorialSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GeckoDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver\\geckodriver.exe");
		String baseUrl = "http://www.google.com";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		Thread.sleep(3000);
		driver.close();
		
	}

}
