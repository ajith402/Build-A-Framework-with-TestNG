package com.programs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.programs.utils.Ebay_HomePageUtil;

public class Ebay_HomePage {

	WebDriver driver;
	
	public Ebay_HomePageUtil ebay_HomePageUtil;
	

	//Init 
	public Ebay_HomePage(WebDriver driver) {
		
		this.driver=driver;
		ebay_HomePageUtil=new Ebay_HomePageUtil(driver);
		
	}
	
	
	//Get EBay Search Button
	public WebElement getEbaySearchButton() {
		return ebay_HomePageUtil.webEbaySearchButton;
	}
	
	
	//Verify Search Button enabled
	public boolean verifySearchButtonEnabled() {
		return ebay_HomePageUtil.webSearchBox.isEnabled();
	}
	
	
	//Click on Search Button
	public void clickOnEbaySearchButton() {
		ebay_HomePageUtil.webEbaySearchButton.click();
	}
	
	
	//Ebay Search Text
	public void searchOnEbay(String strSearch) {
		
		ebay_HomePageUtil.webSearchBox.sendKeys(strSearch);
	}
	

}
