package webElements;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithListElementspractice {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");		
		driver = new ChromeDriver(); 
		// Maximize window
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("http://www.techbeamers.com");
		// Sleep for 5 seconds
		Thread.sleep(5000);
		// Here, the code below will select all rows matching the given XPath.
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"content\"]/article/div/div[2]/div[1]/div[2]/div/ul"));
		Iterator<WebElement> iter = rows.iterator();
		
		//practice
		  //To calculate no of rows In table.
		List<WebElement> LearnPythontable = driver.findElements(By.xpath("//*[@id=\"content\"]/article/div/div[2]/div[1]/div[2]"));
		  int rows_count = LearnPythontable.size();
		  System.out.println("There are " + rows_count + " rows in the table");
 
 		int counter = 0; 
		// this will check whether list has some element or not
		while (iter.hasNext()) {
		 
		// Iterate one by one
		WebElement item = iter.next();
		counter = counter + 1;
		 
		// get the text
		String label = item.getText();
		Integer numrows = label.length();
		System.out.println("There are " + counter + " rows in the Learn Python table");
		 
		// print the text
		System.out.println("Row label is " + label);
		List<WebElement> cellvalue = driver.findElements(By.xpath("//*[@id=\"post-2986\"]/div/div/div[3]/div[1]/div[2]/div/ul"));
		int rowcount = cellvalue.size();
		System.out.println("Total number of rows is " + rowcount);
		
		
		//Calculate number of rows 
		}
		
		
		//Here, the code below will select all rows in the Learn Selenium list using the XPath.
		//List<WebElement> rows2 = driver.findElements(By.xpath("//*[@id=\"post-2986\"]/div/div/div[4]/div[1]/div[2]/div/ul"));
		List<WebElement> rows2 = driver.findElements(By.xpath("//*[@id=\"content\"]/article/div/div[3]/div[1]/div[2]/div/ul"));
		Iterator<WebElement> iter2 = rows2.iterator();
		
		int counter2 = 0; 
		//this will check whether list has some element or not
		while (iter2.hasNext()) {
		
		//Iterate one by one
		WebElement item = iter2.next();
		counter2 = counter2 + 1;
		
		//get the text
		String label = item.getText();
		
		//print the text
		System.out.println("Row label is " + label);
		List<WebElement> cellvalue = driver.findElements(By.xpath("//*[@id=\"post-2986\"]/div/div/div[4]/div[1]/div[2]/div/ul//child::li"));
		int rowcount = cellvalue.size();
		System.out.println("Total number of rows is " + counter2);
		}
		driver.close();
		}
		}
		
		