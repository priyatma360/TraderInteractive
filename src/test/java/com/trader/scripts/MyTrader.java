package com.trader.scripts;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

public class MyTrader extends DriverTestCase {

	/**
	 * Test_01: MyTrader page is displayed when click on MyTrader Account link from Menu.
	 */
	@Test
	public void assertMyTraderLogInpage() {
	OpenURL();
	loginHelper.loginToApplicaton();
	traderMenus.clickOnMoreHamburgerButton();
	traderMenus.clickOnMyTraderAccount();
	myTraderHelper.assertMyTraderPage();
}

	/*
	 * Test_02: Following links are displayed under 'My Trader' tab.
	 * 1. My Listings 2. Saved Listing 3. Saved Searches  4. Sell A Motorcycle 5. Account Settings
	 */
	@Test
	public void assertMyTradertablinks() {
		OpenURL();
		loginHelper.loginToApplicaton();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderAccount();
		myTraderHelper.assertMyListings();
		myTraderHelper.assertSavedListing();
		myTraderHelper.assertSavedSearches();
		myTraderHelper.assertSellAMotorcycle();
		myTraderHelper.assertAccountSettings();

	}

	/**
	 * Test_03: Following sections are displayed at 'My Trader' page.
     * 1. My Listings 2. Saved Listings 3. Saved Searches
	 */
	
	@Test
	public void assertSectionsAtMyTraderPage() {
		OpenURL();
		loginHelper.loginToApplicaton();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderAccount();
		myTraderHelper.assertMyListingssection();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
	}
	
	/*
	 * Following links, buttons and icons are displayed under My Listings section at Welcome to MyTrader page.
	 * 1. My Listings heading with Listing count 2. All posted Ad links for that account 3. Edit button 4. Edit icon 5. Edit Listing
	 */
	
	
}
