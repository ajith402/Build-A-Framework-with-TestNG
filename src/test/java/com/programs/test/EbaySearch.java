package com.programs.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.programs.Base.TestBase;


public class EbaySearch extends  TestBase{

	String strURL;
	
	@Test(groups={"EmptySearch","EbayActions"})
	public void EmptySearch() throws Exception {
		
		strURL="https://ebay.com";

		App().Flow().navigateToURL(strURL);
		
		App().Flow().maximizeWindow();
		
		App().Flow().implycitWait(10);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(App().Pages().HomePage().getEbaySearchButton()));

		// Verify Search button enabled.
		Assert.assertTrue(App().Pages().HomePage().verifySearchButtonEnabled(), "Verifying the search button display");

		//Click on Ebay Search Button
		App().Pages().HomePage().clickOnEbaySearchButton();

		Thread.sleep(3000);

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ebay.com/n/all-categories";
		//String wrongExpectedResult = "https://www.ebay.com";

		// Validations
		Assert.assertEquals(expectedURL, actualURL, "Verifying the URL after clicking on Search");

		System.out.println("Test Method Executed");

	}

	
	@Test(groups={"EbayActions"})
	public void ProductSearch_SoftAssert() throws Exception {
		
		App().Flow().navigateToURL(strURL);
		
		App().Flow().maximizeWindow();
		
		App().Flow().implycitWait(10);

		SoftAssert softAssert = new SoftAssert();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(App().Pages().HomePage().getEbaySearchButton()));

		// Verify Search button enabled
		softAssert.assertTrue(App().Pages().HomePage().verifySearchButtonEnabled(), "Verifying the search button display");

		String strSeach="Iphone";
		
		//Search for a product
		App().Pages().HomePage().searchOnEbay(strSeach);
		
		
		//Click on Search Button
		App().Pages().HomePage().clickOnEbaySearchButton();

		Thread.sleep(4000);

		String actualURL = App().Flow().getCurrentPageURL();
		String wrongExpectedURL = "https://www.ebay.com";
		
		// Validations
		softAssert.assertNotEquals(wrongExpectedURL, actualURL, "Verifying the URL after clicking on Product Search");

		//Collecting all asserts
		softAssert.assertAll();
		System.out.println("Test Method Executed");

	}
	

}
