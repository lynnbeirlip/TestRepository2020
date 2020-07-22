package automationFrameworkTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCommandsTestNG {
	String baseURL = "https://demoqa.com/automation-practice-form/";
	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  driver.get(baseURL);
	  
	// Step 3: Select 'Continents' Drop down ( Use Id to identify the element )
			// Find Select element of "Single selection" using ID locator.
			Select oSelect = new Select(driver.findElement(By.id("continents")));

			// Step 4:) Select option 'Europe' (Use selectByIndex)
			oSelect.selectByVisibleText("Europe");

			// Using sleep command so that changes can be noticed
			Thread.sleep(2000);

			// Step 5: Select option 'Africa' now (Use selectByVisibleText)
			oSelect.selectByIndex(2);
			Thread.sleep(2000);

			// Step 6: Print all the options for the selected drop down and select one option of your choice
			// Get the size of the Select element
			List<WebElement> oSize = oSelect.getOptions();
			int iListSize = oSize.size();

			// Setting up the loop to print all the options
			for(int i =0; i < iListSize ; i++){
				// Storing the value of the option	
				String sValue = oSelect.getOptions().get(i).getText();
				// Printing the stored value
				System.out.println(sValue);
				// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
				if(sValue.equals("Africa")){
					oSelect.selectByIndex(i);
					Thread.sleep(3000);
					break;
					}
				}	    
  }
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
