package com.programs.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class FlowLib {
	
	private WebDriver driver;
	
	public FlowLib(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void navigateToURL(String strURL) {
		this.driver.get(strURL);
	}
	
	
	public String getCurrentPageURL() {
		return this.driver.getCurrentUrl();
	}

	
	public String getCurrentTitle() {
		return this.driver.getTitle();
	}
	
	
	public void maximizeWindow() {
		this.driver.manage().window().maximize();
	}
	
	
	public void implycitWait(int numOfSeconds) {
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
