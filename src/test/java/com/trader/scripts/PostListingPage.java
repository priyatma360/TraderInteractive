package com.trader.scripts;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

public class PostListingPage extends DriverTestCase {

	/**
	 * Test_001:
	 * 'Following buttons and icon are displayed at pop up when click on 'Sell For
	 * Free' link in header at home page. 1. Sell Your Motorcycle 2. Edit Your
	 * Listing 3. Cross(X) icon
	 */
	
	@Test

	public void assertButtonsIcon() {
		OpenURL();
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertButtonsIconOnPopup();
	}



}