package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBxRadioBtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseURL = "https://ingagegroup.github.io/practice-automation-form.html";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		List<WebElement> rdbtn_sex = driver.findElements(By.name("sex"));
		int Sex = rdbtn_sex.size();
		for (int y = 0; y < Sex; y++) {
			String SEXs = rdbtn_sex.get(y).getAttribute("value");
			if (SEXs.equalsIgnoreCase("female")) {
				System.out.println("The gender is " + SEXs);
				rdbtn_sex.get(y).click();
				break;
			}
		}
		WebElement yearsExp = driver.findElement(By.xpath("/html/body/div/form/fieldset/div[20]/div[3]/label"));
		yearsExp.click();
		System.out.println("This person has " + yearsExp.getText() + " years of experience.");
		List<WebElement> profession = driver.findElements(By.name("profession"));
		int a = profession.size();
		for (int b = 0; b < a; b++) {
			String prof = profession.get(b).getAttribute("value");
			if (prof.equalsIgnoreCase("Automation Tester")) {
				System.out.println("The profession is " + prof);
				profession.get(b).click();
				break;
			}
		}
		WebElement autoTool = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		autoTool.click();
		System.out.println("The preferred Automation tool is Selenium IDE");
		Thread.sleep(5000);
		driver.quit();
	}
}
