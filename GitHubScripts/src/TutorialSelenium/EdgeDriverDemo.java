package TutorialSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class EdgeDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\EdgeDriver\\msedgedriver.exe");
		String baseUrl = "http://www.google.com";
		WebDriver driver = new EdgeDriver();
		driver.get(baseUrl);
		Thread.sleep(3000);
		driver.close();
		
	}

}
