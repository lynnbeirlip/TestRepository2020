/**
 * 
 */
package pageObjectsExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author lynn.bierl
 *
 */
public class LogIn_Page {
	
	private static WebElement element = null;
	 
    public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.name("uid"));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.name("password"));
 
         return element;
 
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.name("btnLogin"));
 
         return element;
 
         }

}
