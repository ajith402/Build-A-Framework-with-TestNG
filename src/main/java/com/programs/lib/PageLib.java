package com.programs.lib;

import org.openqa.selenium.WebDriver;

import com.programs.pages.Ebay_AdvancedSearchPage;
import com.programs.pages.Ebay_HomePage;

public class PageLib {

	private WebDriver driver;

	private Ebay_HomePage ebay_HomePage;
	private Ebay_AdvancedSearchPage ebay_AdvancedSearchPage;

	public PageLib(WebDriver driver) {

		this.driver = driver;

		ebay_HomePage = new Ebay_HomePage(this.driver);
		ebay_AdvancedSearchPage = new Ebay_AdvancedSearchPage(this.driver);
	}

	// Getter methods
	public Ebay_HomePage HomePage() {
		return ebay_HomePage;
	}

	public Ebay_AdvancedSearchPage AdvancedSearchPage() {
		return ebay_AdvancedSearchPage;
	}

}
