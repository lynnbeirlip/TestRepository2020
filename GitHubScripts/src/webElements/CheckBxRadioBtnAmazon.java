package webElements;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBxRadioBtnAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseURL = "http://www.toolsqa.com/Automation-practice-form/";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Launch the ToolsQA WebSite
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		// This step will result in an alert on screen
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		 
		 Alert simpleAlert = driver.switchTo().alert();
		 String alertText = simpleAlert.getText();
		 System.out.println("Alert text is " + alertText);
		 simpleAlert.accept();
		 
		//Challenge #1
		 WebElement rdBtn_Sex = driver.findElement(By.id("sex-1"));
		 rdBtn_Sex.click();
		Thread.sleep(5000);
		
		//Challenge #2
		// Store all the elements of same category in the list of WebLements
		WebElement yearsofExp = driver.findElement(By.id("exp-2"));
		yearsofExp.click();
		Thread.sleep(5000);
				
		// Challenge #3
		// Find the Check Box or radio button element by Name
		 List<WebElement> chkBx_Profession = driver.findElements(By.name("profession-1"));
		 
		 // This will tell you the number of Check Boxes are present
		 int iSize = chkBx_Profession.size();
		 
		 // Start the loop from first Check Box to last Check Boxe
		 for(int i=0; i < iSize ; i++ ){
		 // Store the Check Box name to the string variable, using 'Value' attribute
		 String sValue = chkBx_Profession.get(i).getAttribute("value");
		 
		 // Select the Check Box it the value of the Check Box is same what you are looking for
		 if (sValue.equalsIgnoreCase("Automation Tester")){
		 chkBx_Profession.get(i).click();
		 // This will take the execution out of for loop
		 break;
		 }
		 }
		
		// Challenge #4
		//WebElement automationTool = driver.findElement(By.id("tool-1"));
		WebElement automationTool = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		automationTool.click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
