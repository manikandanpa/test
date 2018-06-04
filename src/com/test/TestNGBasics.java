package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	public WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser() {
		
		System.out.println("Before Class");
		
	}

	@BeforeTest
	public void MaximizeBrowser() {
		
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void EnterURL() {
		
		System.out.println("Before Method");
		
	}
	
	@Test
	public void Login(){
	/*	System.setProperty("Webdriver.chrome.driver", "C:\\Program Files (x86)\\Hexaware\\STM Client\\Drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
		driver.get("https://test.salesforce.com");
		*/
		System.out.println("@TEST");
	}
}
