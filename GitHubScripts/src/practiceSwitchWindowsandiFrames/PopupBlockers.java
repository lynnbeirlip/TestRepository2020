package practiceSwitchWindowsandiFrames;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBlockers {
	WebDriver driver;
	String baseUrl;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
		driver = new ChromeDriver();
		String baseUrl = ("http://downloads.smartbear.com/samples/testcomplete10/dialogs/");
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		//Handle alert pop-up
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[1]")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
		
		//Accept confirm pop-up by clicking "OK"
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[3]")).click();
		Alert confirm = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(confirm.getText());
		confirm.accept();
	
		//Dismiss confirm pop-up by clicking "Cancel"
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[3]")).click();
		Alert cancel = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(cancel.getText());
		cancel.dismiss();
		
		//Handle prompt pop-up by entering a name, checking the â€œPrevent this page from creating additional dialogsâ€? box, and clicking on the "OK" button.
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[2]")).click();
		Alert promptconfirm = driver.switchTo().alert();
		promptconfirm.sendKeys("Sara");
		promptconfirm.sendKeys("     student");
		
		//driver.switchTo().alert().sendKeys("Sara Student");
		Thread.sleep(3000);
		System.out.println(promptconfirm.getText());
		promptconfirm.accept();
			
	
		//Handle prompt pop-up by clicking the Cancel button 
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[2]")).click();
		Alert promptcancel = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("You hit cancel");
		Thread.sleep(3000);
		System.out.println(promptcancel.getText());
		promptcancel.dismiss();
	
		Thread.sleep(5000);
		//WebElement submitButton = driver.findElement(By.id("submit"));
		//submitButton.click();
     		
		//System.out.println("Once the form is filled out and the Submit button is hit, the form will clear.");	
		
		driver.quit();
	}
}
