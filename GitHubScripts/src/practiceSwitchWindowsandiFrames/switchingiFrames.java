package practiceSwitchWindowsandiFrames;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingiFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;	
			
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://demoqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
	
		//Switch by frame index
		driver.switchTo().frame(0);
		System.out.println("The webpage has switched to iframe0 by index");	
		
		//Switch by frame name
		driver.get("https://demoqa.com/iframe-practice-page/");
		js.executeScript("window.scrollBy(0,1000)");
		driver.switchTo().frame("iframe1");
		System.out.println("The webpage has switched to iframe1 by name");
		driver.manage().window().maximize();
		
		//Switch by frame id
		driver.switchTo().parentFrame();
		driver.switchTo().frame("IF2");
		System.out.println("The webpage has switched to iframe2 by id");
		
		//Switch by xPath
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='IF2']")));
		System.out.println("The webpage has switched to iframe1 by xPath");
		
		//Switch by frame name
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.name("iframe2")));
		System.out.println("The webpage has switched to iframe2 by name");
		driver.close();	
	} 
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		
		}
}


