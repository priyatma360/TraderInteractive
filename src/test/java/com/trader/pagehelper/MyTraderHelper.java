package com.trader.pagehelper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.trader.locators.Locator;
import com.trader.utils.DriverHelper;

/**
 * @author viveks
 * 
 * This class contains all methods related to My Trader Page.
 */
public class MyTraderHelper extends DriverHelper {

	public MyTraderHelper(WebDriver driver) {
		super(driver, getSoftAssert());
	}

	/**
	 * Assert My Trader page message.
	 */
	public void assertMyTraderPage() {
		print("Welcome to My Trader text on My Trader page");
		waitForElementPresentInDom(2);
		locator = Locator.MyTrader.MyTrader_Message.value;
		Assert.assertTrue(isTextPresent(locator, "Welcome to MyTrader"), "Element Locator :" + locator + " Not found");
	}

	/**
	 * Assert Saved Listing and Saved Searches section.
	 */
	public void assertSavedListingAndSavedSearchesSection() {
		print("Assert Saved Listing Section");
		locator = Locator.MyTrader.Saved_Listings_Section.value;
		Assert.assertTrue(isElementPresent(locator));
		print("Assert Saved Searches Section");
		String SavedSearches_locator = Locator.MyTrader.Saved_Searches_Section.value;
		Assert.assertTrue(isElementPresent(SavedSearches_locator));
	}

	/**
	 * Click on Edit button under Saved Listing Section.
	 */
	public void clickOnEditButtonOnSavedListings() {
		print("Click on Edit under Saved Listing Section");
		locator = Locator.MyTrader.Saved_Listing_Edit.value;
		clickOn(locator);
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Your_Saved_Listing.value));
	}

	/**
	 * Click on Edit button under Saved Searches Section.
	 */
	public void clickOnEditButtonOnSavedSearches() {
		print("Click on Edit under Saved Searches Section");
		locator = Locator.MyTrader.Saved_Search_Edit.value;
		clickOn(locator);
		sleep(2000);
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Your_Saved_Searches.value));
	}

	/**
	 * Click on My Trader Home Icon.
	 */
	public void clickOnMyTraderHomeIcon() {
		print("Click on My Trader Home Icon");
		locator = Locator.MyTrader.MyTrader_Home.value;
		clickOn(locator);
	}

	/**
	 * Click on Sell A Motorcycle Link.
	 */
	public void clickOnSellAMotorcycleLink() {
		print("Click on Sell A Motorcycle Link");
		locator = Locator.MyTrader.Sell_A_Motorcycle.value;
		waitForElementPresentInDom(2);
		clickOn(locator);
	}

	/**
	 * Click on Account Setting Link
	 */
	public void clickOnAccountSettingLink() {
		print("Click on Account Setting Link");
		locator = Locator.MyTrader.Account_Setting.value;
		clickOn(locator);
	}

	/**
	 * Update First name and last name
	 */
	public void updateFirstNameAndlastName() {
		print("Update First name and last name");
		DateFormat txt = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String fNamePostFix = "Vivek" + txt.format(date);
		String lNamePostFix = "Sharma" + txt.format(date);
		sendKeys(Locator.MyTrader.First_Name.value, fNamePostFix);
		sendKeys(Locator.MyTrader.Last_Name.value, lNamePostFix);
	}

	/**
	 * Click on Save Changes Button.
	 */
	public void clickOnSaveChangesButton() {
		print("Click on Save Changes Button");
		locator = Locator.MyTrader.Save_Changes_Button.value;
		clickOn(locator);
	}

	/**
	 * Assert Update changes Confirmation message.
	 */
	public void assertUpdateChangesMessage() {
		print("Assert Updates Changes Confirmation Message");
		locator = Locator.MyTrader.Updated_Changes_Messages.value;
		Assert.assertTrue(isElementPresent(locator));
	}
	
	 /**
	   * Assert My Listings link under MyTrader.
	   */
	public void assertMyListings() {
	      print("My Listings");
	      locator = Locator.MyTrader.My_Listings.value;
	      Assert.assertTrue(isElementPresent(locator));
	}
	
	/**
	 * Assert Saved Listing link under MyTrader.
	 */
	public void assertSavedListing() {
	print("Saved Listing");
	locator = Locator.MyTrader.Saved_Listing.value;
    Assert.assertTrue(isElementPresent(locator));
	}
	
	/**
	 * Assert Saved Searches link under MyTrader.
	 */
	public void assertSavedSearches() {
	print("Saved Searches");
	locator = Locator.MyTrader.Saved_Searches.value;
    Assert.assertTrue(isElementPresent(locator));
	}
	
	/**
	 * Assert Sell A Motorcycle link under MyTrader.
	 */
	public void assertSellAMotorcycle() {
	print("Sell A Motorcycle");
	locator = Locator.MyTrader.Sell_A_Motorcycle.value;
    Assert.assertTrue(isElementPresent(locator));
	}
	
	
	/**
	 * Assert Account Settings link under MyTrader.
	 */
	public void assertAccountSettings() {
	print("Account Settings");
	locator = Locator.MyTrader.Account_Setting.value;
    Assert.assertTrue(isElementPresent(locator));
	}
	
	/**
	 * Assert My Listings section under MyTrader.
	 */
	public void assertMyListingssection() {
	print("Assert My Listings section");
	locator = Locator.MyTrader.My_Listings_Section.value;
    Assert.assertTrue(isElementPresent(locator));
	}
	
	/**
	 * Assert My Listings heading with Listing count.
	 */
	public void assertMyListingsheadingwithListingcount() {
	print("Assert My Listings heading with Listing count");
	locator = Locator.MyTrader.My_Listings_Heading_Count.value;
    Assert.assertTrue(isElementPresent(locator));
	}
	
	/**
	 * Assert posted Ad links for that account.
	 */
	public void assertpostedAdlinksforthataccount() {
	print("Assert posted Ad links for that account");
	locator = Locator.MyTrader.Posted_Ad_links.value;
    Assert.assertTrue(isElementPresent(locator));
	}
	
	/**
	 * Assert Edit Button with My Listing Heading .
	 */
	public void assertEditButtonwithMyListingHeading() {
	print("Assert Edit Button with My Listing Heading");
	locator = Locator.MyTrader.Posted_Ad_links.value;
    Assert.assertTrue(isElementPresent(locator));
    
	}
	
	/**
	 * Assert Edit Icon.
	 */
	public void assertEditIcon() {
	print("Assert Edit Icon");
	locator = Locator.MyTrader.Edit_Button.value;
    Assert.assertTrue(isElementPresent(locator));
	}
	
	/**
	 * Assert Edit Listing Button.
	 */
	public void assertEditListingButton() {
	print("Assert Edit Listing Button");
	locator = Locator.MyTrader.Edit_Listing_Button.value;
    Assert.assertTrue(isElementPresent(locator));
	}
	
	/**
	 * Assert All posted Ad links for that Account under My Listings.
	 */
	public void assertAllpostedAdlinks() {
		
		List<WebElement> links = getWebDriver().findElements(By.xpath("(//*[@class='list-unstyled'])[3]/li"));
		 //System.out.println(links.size());
		 for (int i = 0; i<=links.size(); i=i+1)
		 {
			 try {
		 System.out.println(links.get(i).getText());
		 
			 } catch(IndexOutOfBoundsException e) {
				 //System.out.println(e);
	            }
			 }
		 
		 }
		
		
	}

	

