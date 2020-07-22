package TestNGPracticeExercises;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class usingAsserts {
	String actualTitle;
	@Test
	public void testNGAsserts1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Test Condition 1: If Page title matches with expectedTitle then it finds email title and enters the value which we pass
		driver.get("https://www.gmail.com");
		//String expectedTitle = "Gmail";
		String expectedTitle = "Gmail";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("SoftwareTestingMaterial.com");
		Thread.sleep(5000);
		
		//Test Condition 2: If Page title does not match expectedTitle then it prints an error message and closes the driver
				driver.get("https://www.gmail.com");
				//String expectedTitle = "Gmails";
				String expectedTitle1 = "Gmails";
				String actualTitle1 = driver.getTitle();
				System.out.println("The actual title is " + actualTitle1);
				Assert.assertEquals(driver.getTitle(), expectedTitle1);
				System.out.println("Expected title" + expectedTitle1 + "does not match actual title" + actualTitle1);
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("SoftwareTestingMaterial.com");
				
	}
	
	//@Test
	//public void testNGAsserts3() {
	//WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://www.gmail.com");
		//String actualTitle = driver.getTitle(); 
		//System.out.println("Your page title Is : "+ actualTitle);
		//String expectedTitle = "Gmail";
		//Assert.assertEquals(expectedTitle,actualTitle,"Actual title matches expected");
	//}

	//@Test
	//public void testNGAsserts4() {
		//driver= new FirefoxDriver();
		//driver.navigate().to("https://www.gmail.com");
		//Assert.assertEquals("Gmail", driver.getTitle(), "Strings are not matching");
		//Write a code to login and write a method called isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
		//Assert.assertTrue(isUserLoggedInSuccessfully(), "User failed to login");
		//Assert.assertFalse(isUserLoggedOut())
		//}


	//@Test
	//public void testNGAsserts2() throws InterruptedException {
		//Test Condition 2: If page title didn't match with expectedTitle then script throws an exception
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.gmail.com");
		//String expectedTitle2 = "GoogleMail";
		//Thread.sleep(2000);
		//Assert.assertEquals(driver.getTitle(), expectedTitle2, "Actual title does not match expected title");
		//Assert.assertEquals(driver.getTitle(), expectedTitle2);
	//}

}
