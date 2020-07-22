package automationFrameworkTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBxRadioBtnTestNG {
	String baseURL = "http://demoqa.com/automation-practice-form/";
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get(baseURL);
		List<WebElement> rdbtn_sex = driver.findElements(By.name("sex"));
		int Sex = rdbtn_sex.size();
		System.out.println(Sex);
		/*
		 * boolean bvalue = false; bvalue = rdbtn_sex.get(0).isSelected();
		 * System.out.println(bvalue); if (bvalue == true) { rdbtn_sex.get(1).click();;
		 * } else { rdbtn_sex.get(0).click();; }
		 */ for (int y = 0; y < Sex; y++) {
			String SEXs = rdbtn_sex.get(y).getAttribute("value");
			if (SEXs.equalsIgnoreCase("female")) {
				System.out.println(SEXs);
				rdbtn_sex.get(y).click();
				break;
			}
		}
		List<WebElement> experience = driver.findElements(By.name("exp"));
		int i = experience.size();
		System.out.println(i);
		for (int x = 0; x < i; x++) {
			String year = experience.get(x).getAttribute("value");
			if (year.equalsIgnoreCase("3")) {
				System.out.println(year);
				experience.get(x).click();
				break;
			}
		}
		List<WebElement> profession = driver.findElements(By.name("profession"));
		int a = profession.size();
		System.out.println(i);
		for (int b = 0; b < a; b++) {
			String prof = profession.get(b).getAttribute("value");
			System.out.println(b);
			profession.get(b).click();
			if (prof.equalsIgnoreCase("Automation Tester")) {
				System.out.println(b);
				profession.get(b).click();
				break;
			}
		}
		// JavascriptExecuter jse=(JavascriptExecuter)driver;
		// jse.executescript("window.scrollby(0,800)");

		WebElement autoTool = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		autoTool.click();
		List<WebElement> continentLST = driver.findElements(By.xpath("//*[@id=\"continentsmultiple\"]"));
		int Zombi = continentLST.size();

		System.out.println(Zombi);
		List<WebElement> sexlist = driver.findElements(By.xpath("//*[@type=" + "\"radio\"][@name=\"exp\"]"));
		sexlist.get(0).click();
		int h = sexlist.size();
		System.out.println("Last method ran and sex =" + h);

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
