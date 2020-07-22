package com.pack.listeners;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {
	WebDriver driver;

	@BeforeSuite
	public void initialize() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void getFacebook() {
		// To open facebook
		driver.get("https://www.facebook.com");

		// To maximize browser
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("joeuser@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("joespass");

		// The correct id for the Log In button is "u_0_b", so this will fail.
		driver.findElement(By.id("u_o_b")).click();
	}

	@AfterSuite
	// Test cleanup
	public void TeardownTest() {
		driver.quit();
	}
}
