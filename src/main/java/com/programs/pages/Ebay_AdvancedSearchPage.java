package com.programs.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.programs.utils.Ebay_AdvancedSearchPageUtil;

public class Ebay_AdvancedSearchPage {
	
	WebDriver driver;
	
	Ebay_AdvancedSearchPageUtil ebay_AdvancedSearchPage;
	
	//init 
	public Ebay_AdvancedSearchPage(WebDriver driver) {
		this.driver=driver;
		
		//Initializing the Util class
		ebay_AdvancedSearchPage= new Ebay_AdvancedSearchPageUtil(driver);
	}
	
	
	
	//Clicking on Search Button
	public void clickOnSearchButton() {
		ebay_AdvancedSearchPage.webAdvanceSearchButton.click();
	}
	
	
	//get the Search Button
	public WebElement getAdvancedSearchButton() {
		return ebay_AdvancedSearchPage.webAdvanceSearchButton;
	}
	

	//Check whether search button is enabled
	public boolean checkAdvSeachButtonEnabled() {
		return ebay_AdvancedSearchPage.webAdvanceSearchButton.isEnabled();
	}
	
	
	//Get Ebay Logo
	public WebElement getEbayLogo() {
		return ebay_AdvancedSearchPage.webEbayLogo;
	}
	
	
	//get Ebay Home Serach Button
	public WebElement getEbayHomeSearchButton() {
		return ebay_AdvancedSearchPage.webEbaySearchButton;
	}
	
	
	//Get Categories list
	public List<WebElement> getCategoryList(){
		return ebay_AdvancedSearchPage.webListSelectCategories;
	}
	
}
