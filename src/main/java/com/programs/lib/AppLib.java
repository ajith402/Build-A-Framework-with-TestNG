package com.programs.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {

	private WebDriver driver;
	private PageLib pageLib;
	private FlowLib flowLib;
	
	public AppLib(WebDriver driver) {

		this.driver = driver;
		pageLib = new PageLib(this.driver);
		flowLib=new FlowLib(this.driver);

	}

	// Get Page Lib
	public PageLib Pages() {
		return pageLib;
	}

	public FlowLib Flow() {
		
		return flowLib;
	}
	
	
	
}
