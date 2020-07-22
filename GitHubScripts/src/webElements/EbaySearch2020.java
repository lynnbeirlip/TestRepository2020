package webElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url = "http://www.ebay.com.\r\n";
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gh-ac")).sendKeys("'purple apple watch'");
		driver.findElement(By.id("gh-btn")).click();
		
		List<WebElement> rows = driver.findElements(By.className("s-item"));
		//Count the number of rows in the table
		int rows_count = rows.size();
		// print the total number of elements
		System.out.println("Total selected rows are " + rows_count);
		
		// Now using Iterator we will iterate all elements
		Iterator<WebElement> iter = rows.iterator();
		int counter = 0; 
		// this will check whether list has some element or not
		while (iter.hasNext()) {
		// Iterate one by one
		WebElement item = iter.next();
		counter = counter + 1;			 
		// get the text
		String label = item.getText();
		// print the text
		System.out.println("Row label is " + label);			
		}
		driver.close();
	}
}
