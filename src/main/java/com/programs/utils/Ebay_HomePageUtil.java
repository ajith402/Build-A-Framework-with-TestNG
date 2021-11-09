package com.programs.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_HomePageUtil {

	WebDriver driver;
	
	@FindBy(id="gh-btn")
	public WebElement webEbaySearchButton;
	
	
	@FindBy(xpath="//div[@id='gh-ac-box2']/input[1]")
	public WebElement webSearchBox;
	
	//Init 
	public Ebay_HomePageUtil(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 

}
