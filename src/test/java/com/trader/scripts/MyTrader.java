package com.trader.scripts;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

public class MyTrader extends DriverTestCase {

	/**
	 * MyTrader page is displayed when click on MyTrader Account link from Menu.
	 */
	@Test
	public void assertMyTraderLogInpage() {
	OpenURL();
	traderMenus.clickOnMoreHamburgerButton();
	traderMenus.clickOnMyTraderSignIn();
	String uname = loginHelper.getUserName();
	String password = loginHelper.getPassword();
	loginHelper.enterEmailID(uname);
	loginHelper.enterPassword(password);
	loginHelper.clickOnSignInButton();
	myTraderHelper.assertMyTraderPage();
}

	
}
