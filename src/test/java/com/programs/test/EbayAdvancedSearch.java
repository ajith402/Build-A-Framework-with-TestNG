package com.programs.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.programs.Base.TestBase;


public class EbayAdvancedSearch extends TestBase{

	String strURL;
	
		
	@Test(priority=1)
	public void EmptyAdvancedSearch() throws Exception {

		
		strURL="https://www.ebay.com/sch/ebayadvsearch";
		
		//Launch URL
		App().Flow().navigateToURL(strURL);
		//driver.get(strURL);

		//Maximize
		App().Flow().maximizeWindow();
		//driver.manage().window().maximize();
		
		App().Flow().implycitWait(10);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(App().Pages().AdvancedSearchPage().getAdvancedSearchButton()));

		// Verify Search button enabled.
		Assert.assertTrue(App().Pages().AdvancedSearchPage().checkAdvSeachButtonEnabled(), "Verifying the search button display");

		//Clicking on Search Button
		App().Pages().AdvancedSearchPage().clickOnSearchButton();

		
		Thread.sleep(3000);

		String actualURL = App().Flow().getCurrentPageURL();
		String expectedURL = "https://www.ebay.com/n/all-categories";
		
		// Validations
		Assert.assertEquals(expectedURL, actualURL, "Verifying the URL after clicking on Search");

		System.out.println("Test Method Executed");

	}

	
	@Test(priority=2)
	public void ebayLogoNavigationToHomePage() {
		
		App().Flow().navigateToURL(strURL);
	
		App().Flow().maximizeWindow();
		
		App().Flow().implycitWait(10);

		
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//Wait till ebay logo is loaded
		wait.until(ExpectedConditions.visibilityOf(App().Pages().AdvancedSearchPage().getEbayLogo()));

		//clicking on ebay logo
		
		Actions action=new Actions(driver);
		action.moveToElement(App().Pages().AdvancedSearchPage().getEbayLogo()).click().build().perform();
		
		//wait until serach button is loaded
		wait.until(ExpectedConditions.visibilityOf(App().Pages().AdvancedSearchPage().getEbayHomeSearchButton()));
		
		String strExpectedURL="https://www.ebay.com/";
		String strActualURL=App().Flow().getCurrentPageURL();
		
		
		Assert.assertEquals(strExpectedURL, strActualURL,"Ebay Logo Navigation to HomePage");
	}
	
	
	
	@Test(priority=3)
	public void checkAscendingOrderSort() {
		
		App().Flow().navigateToURL(strURL);
		
		App().Flow().maximizeWindow();
		
		App().Flow().implycitWait(10);
		
		List<WebElement> webSelectCategories=App().Pages().AdvancedSearchPage().getCategoryList();
		List<String> listCategories=new ArrayList<String>();
		
		for(WebElement category: webSelectCategories) {
			listCategories.add(category.getText());
		}
		
		List<String> secondArray=new ArrayList<String>(listCategories);
		
		Collections.sort(listCategories);
		
		//System.out.println("List2: "+secondArray);
		//System.out.println("List Sorted: "+listCategories);
		
		//Wrong Validations
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertFalse(listCategories.equals(secondArray), "Verify Categories are sorted");
		
		
		softAssert.assertAll();
	}
	
	
	
}
