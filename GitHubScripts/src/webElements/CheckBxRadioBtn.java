package webElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBxRadioBtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String baseURL = "https://demoqa.com/automation-practice-form/";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		// Launch the ToolsQA WebSite
		driver.get(baseURL);

		// Scroll down to see the Partial Link Text link
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");

		// Challenge #1
		List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));

		// Create a boolean variable which will hold the value (True/False)
		boolean bValue = false;

		// This statement will return True, in case of first Radio button is selected
		bValue = rdBtn_Sex.get(0).isSelected();

		// This will check that if the bValue is True means if the first radio button is
		// selected
		if (bValue == true) {
			// This will select Second radio button, if the first radio button is selected
			// by default
			rdBtn_Sex.get(1).click();
		} else {
			// If the first radio button is not selected by default, the first will be
			// selected
			rdBtn_Sex.get(0).click();
		}

		// Thread.sleep(5000);
		// Scroll down to see the Partial Link Text link
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,500)");

		// Challenge #2
		// Store all the elements of same category in the list of WebLements
		WebElement yearsofExp = driver.findElement(By.id("exp-2"));
		yearsofExp.click();
		Thread.sleep(3000);

		// Challenge #3

		// Scroll down to see the Partial Link Text link
		// JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		// jse3.executeScript("window.scrollBy(0,500)");
		// Thread.sleep(3000);

		// Find the Check Box or radio button element by Name
		List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));

		// This will tell you the number of Check Boxes are present
		int iSize = chkBx_Profession.size();

		// Start the loop from first Check Box to last Check Boxe
		for (int i = 0; i < iSize; i++) {
			// Store the Check Box name to the string variable, using 'Value' attribute
			String sValue = chkBx_Profession.get(i).getAttribute("value");

			// Select the Check Box it the value of the Check Box is same what you are
			// looking for
			if (sValue.equalsIgnoreCase("Automation Tester")) {
				chkBx_Profession.get(i).click();
				Thread.sleep(3000);
				// This will take the execution out of for loop
				break;
			}
		}
			// Challenge #4
			// WebElement automationTool = driver.findElement(By.id("tool-1"));
			WebElement automationTool = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
			automationTool.click();

			Thread.sleep(5000);
			driver.close();
		}
	}

