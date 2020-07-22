package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class TagNameListPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String baseURL = "http://www.google.com";
	    WebDriver driver;                          
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(baseURL);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);

	    List <WebElement> list = driver.findElements(By.tagName("z"));
	    int i = 1;
	    System.out.println(list.get(i).getText());
	   // System.out.println("Number of links: "+list.size());
	    //for(int i = 0; i < list.size(); i++){
	    //System.out.println(list.get(i).getText());
	    
	    //}
	    driver.close();
	}
}
