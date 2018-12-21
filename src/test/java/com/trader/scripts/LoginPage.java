package com.trader.scripts;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

/**
 * @author viveks
 *
 */
public class LoginPage extends DriverTestCase {
	
	/**
	 * ATD-253: Login page should be displaying when click on 'MyTrader Log In' link under Menu section.
	 */
	@Test
	public void assertLoginPage() {
		OpenURL();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
	}
	
	/**
	 * ATD-255: "Following buttons, links and fields should be displayed at Login page. 1. Sign in with Facebook 2. Sign in with Google 3. Email 4. Password 5. Forgot your password? 6. Get Started 7. Sign up for MyTrader 8.  Login as a Dealer"
	 */
	@Test
	public void assertAllLinksButtonsAndFieldsAtLoginPage() {
		OpenURL();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertAllLinksButtonAndFields();
	}
	
	/**
	 * ATD-256: Facebook Login popup is displaying when click on 'Sign in with Facebook' button at Login page.
	 */
	@Test
	public void assertFacebookLoginPopUpAtLoginPage() {
		OpenURL();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertFacebookLoginPopUp();
	}
	
	/**
	 * ATD-257: User should be logged in the application successfully with Facebook.
	 */
	@Test
	public void assertLoginSucessfullyWithFacebookAtLoginPage() {
		OpenURL();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertFacebookLoginPopUp();
		loginHelper.assertLoginSuccessfullyWithFacebook();
	}
	
	/**
	 * ATD-258: 'Incorrect email address or phone number' message should be displayed when trying to login with invalid facebook login credentials.
	 */
	@Test
	public void assertErrorMessageForFacebookInvalidLoginAtFacebookPopUp() {
		OpenURL();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertFacebookLoginPopUp();
		loginHelper.assertErrorMessageForFcaebbokInvalidEmailId();
	}
	
	/**
	 * ATD-259: Google Login popup should be displaying when click on 'Sign in with Google' button at Login page.
	 */
	@Test
	public void assertGoogleLoginPopUpAtLoginPage() {
		OpenURL();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertGoogleLoginPopUp();
	}
	
	/**
	 * ATD-260: User should be logged in the application successfully with Google Login Credentials.
	 */
	@Test
	public void assertLoginSucessfullyWithGoogleAtLoginPage() {
		OpenURL();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertGoogleLoginPopUp();
		loginHelper.assertLoginSuccessfullyWithGoogle();
	}
	
	/**
	 * ATD-261: Validation message should be displayed when trying to login with Google invalid credentials.
	 */
	@Test
	public void assertErrorMessageForGoogleInvalidLoginAtGooglePopUp() {
		OpenURL();
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertGoogleLoginPopUp();
		loginHelper.assertErrorMessageForGoogleInvalidEmailId();
	}
	
	
}
