package com.programs.utils;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ebay_AdvancedSearchPageUtil {
	
	WebDriver driver;
	
	@FindBy(how=How.CSS, using="button[class='btn btn-prim']")
	public WebElement webAdvanceSearchButton;
	
	@FindBy(id="gh-btn")
	public WebElement webEbaySearchButton;
	
	
	@FindBy(how=How.ID, using="gh-logo")
	public WebElement webEbayLogo;
	
	@FindBy(how=How.XPATH, using="//select[@id='e1-1']/option")
	public List<WebElement> webListSelectCategories;
	
	
	
	//init webdriver
	public Ebay_AdvancedSearchPageUtil(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
