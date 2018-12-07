package com.trader.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.trader.locators.Locator;
import com.trader.stringdata.Strings;
import com.trader.utils.DriverHelper;

/**
 * @author viveks
 * 
 *         This class contains all methods related to Login page.
 */
public class LoginHelper extends DriverHelper {

	public LoginHelper(WebDriver driver) {
		super(driver, getSoftAssert());
	}

	/**
	 * Click on Login Link in Menu bar.
	 */
	public void clickOnLogInLink() {

		print("Click Login link");
		clickOn(Locator.Login.Login_Link.value);
	}

	/**
	 * Enter Email ID.
	 * 
	 * @param uname
	 */
	public void enterEmailID(String uname) {
		print("Enter Email ID");
		sendKeys(Locator.Login.Email_Field.value, uname);
	}

	/**
	 * Enter Password.
	 * 
	 * @param password
	 */
	public void enterPassword(String password) {
		print("Enter Password");
		sendKeys(Locator.Login.Password_Field.value, password);
	}

	/**
	 * Click on Sign In Button.
	 */
	public void clickOnSignInButton() {
		print("Click on Sign in button");
		clickOn(Locator.Login.SignIn_Button.value);
		waitForElementPresentInDom(2);
	}

	/**
	 * This method to get user name from propery file.
	 * 
	 * @return
	 */
	public String getUserName() {
		print("Get user name");
		String userName = propertyReader.readApplicationFile("UserName");
		return userName;
	}

	/**
	 * This method to get password from propery file.
	 * 
	 * @return
	 */
	public String getPassword() {
		print("Get password");
		String pwd = propertyReader.readApplicationFile("UserPassword");
		return pwd;
	}

	/**
	 * This method is for login with valid details.
	 */
	public void loginToApplicaton() {
		this.clickOnLogInLink();
		String userName = this.getUserName();
		String pwd = this.getPassword();
		this.enterEmailID(userName);
		this.enterPassword(pwd);
		this.clickOnSignInButton();
		this.assertValidationMessage();
	}

	/**
	 * This method is assert the validation message.
	 */
	public void assertValidationMessage() {
		print("User should fail to Login");
		locator = Locator.Login.Login_Failed_Message.value;
		Assert.assertTrue(isTextPresent(locator, Strings.Messages.Invalid_UserName_Password.value),
				"Element Locator :" + locator + " Not found");
	}

	/**
	 * Click on Forgot Your Password and Assert Forgot Password Page.
	 */
	public void clickOnForgotYourPasswordLinkAndAssertResultPage() {
		print("Click On Forgot Your Password Link");
		locator = Locator.Login.Forgot_Your_Password.value;
		clickOn(locator);
		Assert.assertTrue(isElementPresent(Locator.Login.Forgot_Password_Page.value));
	}

	/**
	 * Assert Login Page.
	 */
	public void assertLoginPage() {
		print("Assert Login Page.");
		locator = Locator.Login.Login_Page.value;
		Assert.assertTrue(isElementPresent(locator));	
	}
	
	/**
	 * Assert All Links, Button And Fields at Login Page.
	 */
	public void assertAllLinksButtonAndFields() {
		print("Assert All Links, Button And Fields at Login Page.");
		Assert.assertTrue(isElementPresent(Locator.Login.Google_Button.value));
		Assert.assertTrue(isElementPresent(Locator.Login.Facebook_Button.value));
		Assert.assertTrue(isElementPresent(Locator.Login.Email_Field.value));
		Assert.assertTrue(isElementPresent(Locator.Login.Password_Field.value));
		Assert.assertTrue(isElementPresent(Locator.Login.Forgot_Your_Password.value));
		Assert.assertTrue(isElementPresent(Locator.Login.SignIn_Button.value));
		Assert.assertTrue(isElementPresent(Locator.Login.JoinMYTrader_Link.value));
		Assert.assertTrue(isElementPresent(Locator.Login.Dealer_Login.value));
	}
	
	/**
	 * Assert facebook login pop up after clicking on facebook button at login page.
	 */
	public void assertFacebookLoginPopUp() {
		print("Assert facebook login pop up after clicking on facebook button at login page.");
		clickOn(Locator.Login.Facebook_Button.value);
		switchWin(1);
		waitForElementPresentInDom(2);
		locator = Locator.Login.Facebook_PopUp.value;
		Assert.assertTrue(isTextPresent(locator, "Log in to use your Facebook account with "));
	}
	
	/**
	 * Validation message for Facebook invalid credentials.
	 */
	public void assertErrorMessageForFcaebbokInvalidEmailId() {
		print("Validation message for facebook invalid credentials.");
		sendKeys(Locator.Login.Facebook_Email.value, "test360.908@gmail.com");
		waitForElementPresentInDom(1);
		sendKeys(Locator.Login.Facebook_Password.value, "360logica");
		waitForElementPresentInDom(1);
		clickOn(Locator.Login.Facebook_LoginButton.value);
		waitForElementPresentInDom(1);
		String error = Locator.Login.Facebook_Error_Message.value;
		Assert.assertTrue(isTextPresent(error, "Incorrect email address"));
	}
	
	/**
	 * Assert Login Successfully With Facebook at login page
	 */
	public void assertLoginSuccessfullyWithFacebook() {
		print("Assert Login Sucessfully With Facebook at login page");
		sendKeys(Locator.Login.Facebook_Email.value, "test360.987@yahoo.com");
		waitForElementPresentInDom(1);
		sendKeys(Locator.Login.Facebook_Password.value, "360logica");
		waitForElementPresentInDom(1);
		clickOn(Locator.Login.Facebook_LoginButton.value);
		waitForElementPresentInDom(2);
		clickOn(Locator.Login.Facebook_ContinueButton.value);
		switchWin(0);
		waitForElementPresentInDom(5);
	}
	
	/**
	 * Assert Google login pop up after clicking on Google+ button at login page.
	 */
	public void assertGoogleLoginPopUp() {
		print("Assert Google login pop up after clicking on Google+ button at login page.");
		clickOn(Locator.Login.Google_Button.value);
		switchWin(1);
		waitForElementPresentInDom(2);
		locator = Locator.Login.Google_PopUp.value;
		Assert.assertTrue(isTextPresent(locator, "Sign in with Google"));
	}
	
	/**
	 * Validation message for Google invalid credentials.
	 */
	public void assertErrorMessageForGoogleInvalidEmailId() {
		print("Validation message for Google invalid credentials.");
		sendKeys(Locator.Login.Google_Email.value, "test360.00908@gmail.com");
		waitForElementPresentInDom(1);
		
		clickOn(Locator.Login.Google_NextButton.value);
		waitForElementPresentInDom(1);
		String error = Locator.Login.Google_Validation.value;
		Assert.assertTrue(isTextPresent(error, "Couldn't find your Google Account"));
	}
	
	/**
	 * Assert Login Successfully With Google at login page
	 */
	public void assertLoginSuccessfullyWithGoogle() {
		print("Assert Login Sucessfully With Google at login page");
		sendKeys(Locator.Login.Google_Email.value, "test360.1999@gmail.com");
		waitForElementPresentInDom(1);
		clickOn(Locator.Login.Google_NextButton.value);
		waitForElementPresentInDom(1);
		sendKeys(Locator.Login.Google_Password.value, "360logica");
		waitForElementPresentInDom(1);
		clickOn(Locator.Login.Google_NextPwd.value);
		waitForElementPresentInDom(2);
		switchWin(0);
		waitForElementPresentInDom(5);
	}
}
