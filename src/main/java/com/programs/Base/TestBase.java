package com.programs.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.programs.lib.AppLib;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	protected WebDriver driver;

	private AppLib appLib;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		appLib = new AppLib(driver);
		// System.out.println("Before Test Method Executed");
	}

	@AfterMethod (alwaysRun = true)
	public void tearDown() {

		driver.close();

		// System.out.println("After Test Method Executed");
	}

	// Get AppLib
	public AppLib App() {
		return appLib;
	}

}
