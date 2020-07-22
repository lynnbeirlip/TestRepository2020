package advancedReportingPractice;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class captureScreenshot {
	WebDriver driver;
	
  @Test
  public static void captureScreenMethod() throws Exception{
      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String fileWithPath = "C:\\Users\\Lynn Beirl\\SoftwareTestingMaterial.png";
            
      try{
    	  driver.get("http://www.softwaretestingmaterial.com");
    	  driver.manage().window().maximize();
    	  Thread.sleep(5000);
    	  
    	//Statement with incorrect locator
    	  driver.findElement(By.linkText("trining")).click(); 	  	  
    	 
    	  
      	}catch(Exception e){
      		TakesScreenshot scrShot =((TakesScreenshot)driver);

             //Call getScreenshotAs method to create image file
             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                     
             //Move image file to new destination
             File DestFile=new File(fileWithPath);
             
             //Copy file at destination
             FileUtils.copyFile(SrcFile, DestFile);
             
            
      	}
  }
  
  @BeforeClass
  public void beforeClass() {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  //driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
  
 
