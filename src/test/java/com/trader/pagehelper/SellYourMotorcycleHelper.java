package com.trader.pagehelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.trader.locators.Locator;
import com.trader.utils.DriverHelper;

public class SellYourMotorcycleHelper extends DriverHelper {
	protected WebDriver driver;

	public SellYourMotorcycleHelper(WebDriver driver) {
		super(driver, getSoftAssert());
	}

	/**
	 * Click On Sell For Free Menu And Assert Result Page
	 */
	public void clickOnSellForFreeMenuAndAssertResultPage() {
		print("Click On Sell For Free Menu And Assert Result Page");
		waitForElementPresentInDom(2);
		locator = Locator.Menus.Sell_For_Free.value;
		clickOn(locator);
		print("Click on Sell Motorcycle button");
		waitForElementPresentInDom(5);
		clickOn(Locator.Sell.Sell_Your_Motorcycle.value);
		Assert.assertTrue(isElementPresent(Locator.Sell.Sell_Your_Motocycle_Page.value));
	}

	/**
	 * Click on Select Free button
	 */
	public void clickOnSelectFreeButton() {
		print("Click on Select Free button");
		locator = Locator.Sell.Select_Free_Button.value;
		clickOn(locator);
	}

	/**
	 * Click on Select Enhanced button.
	 */
	public void clickOnSelectEnhancedButton() {
		print("Click on Select Enhanced button");
		locator = Locator.Sell.Select_Enhanced_Button.value;
		clickOn(locator);
	}

	/**
	 * Click on Select Best button.
	 */
	public void clickOnSelectBestButton() {
		print("Click on Select Best button");
		locator = Locator.Sell.Select_Best_Button.value;
		clickOn(locator);
	}

	/**
	 * Assert Enter Vehicle Info Tab.
	 */
	public void assertSellpage() {
		print("Assert Enter Vehicle Info Tab");
		locator = Locator.Sell.Enter_Vehicle_Info.value;
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * Select Listing Year from Year drop down.
	 */
	public void selectListingYear() {
		print("Select Listing Year from Year drop down");
		String listingYear = propertyReader.readApplicationFile("Year");
		locator = Locator.Sell.Select_Year.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingYear);
	}

	/**
	 * Select Motorcycle Class in Class drop down
	 */
	public void selectMotorCycleClass() {
		print("Select Motocycle Class in Class drop down");
		String motorcycleClass = propertyReader.readApplicationFile("MotocycleClass");
		locator = Locator.Sell.Select_Class.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, motorcycleClass);
	}

	/**
	 * Select listing Make from Make drop down.
	 */
	public void selectListingMake() {
		print("Select listing Make from Make drop down");
		String listingMake = propertyReader.readApplicationFile("Make");
		locator = Locator.Sell.Select_Make.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingMake);
	}

	/**
	 * Select listing Model from Model drop down.
	 */
	public void selectListingModel() {
		print("Select listing Model from Model drop down");
		sleep(4000);
		String listingMake = propertyReader.readApplicationFile("Model");
		locator = Locator.Sell.Select_Model.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingMake);
	}

	/**
	 * Select listing Trim from Trim drop down.
	 */
	public void selectListingTrim() {
		print("Select listing Trim from Trim drop down");
		sleep(4000);
		String listingMake = propertyReader.readApplicationFile("Trim");
		locator = Locator.Sell.Select_Trim.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingMake);
	}

	/**
	 * Enter listing Price in Price field.
	 */
	public void enterListingPrice() {
		print("Enter listing Price in Price field");
		sleep(4000);
		String listingPrice = propertyReader.readApplicationFile("Price");
		locator = Locator.Sell.Enter_Price.value;
		// clickOn(locator);
		// this.waitForStepsvalidator();
		sendKeys(locator, listingPrice);
	}

	/**
	 * Select listing Price Tagline from Price Tagline drop down.
	 */
	public void selectListingPriceTagline() {
		print("Select listing Price Tagline from Price Tagline drop down");
		String listingTagline = propertyReader.readApplicationFile("Tagline");
		locator = Locator.Sell.Price_Tagline.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingTagline);
	}

	/**
	 * Enter listing message in Message field.
	 */
	public void enterListingMessage() {
		print("Enter listing message in Message field");
		// switchToFrame(Locator.Sell.Message_iFrame.value);
		String listingMessage = propertyReader.readApplicationFile("Message");
		locator = Locator.Sell.Enter_Message.value;
		clickOn(locator);
		sendKeys(locator, listingMessage);
	}

	/**
	 * Select listing Category from Category drop down.
	 */
	public void selectListingCategory() {
		print("Select listing Category from Category drop down");
		String listingcat = propertyReader.readApplicationFile("Category");
		locator = Locator.Sell.Select_Category.value;
		// clickOn(locator);
		selectDropDownByVisibleText(locator, listingcat);
	}

	// public void waitForStepsvalidator() {
	// print("Step Validator still shown");
	// locator = Locator.Sell.Step_Validator.value;
	// WaitForElementNotVisible(locator, 40);
	// }

	/**
	 * Click On Enter Your Contact Info Tab.
	 */

	public void clickOnEnterYourContactInfoTab() {
		print("Click On Enter Your Contact Info Tab");
		locator = Locator.Sell.Enter_Your_Contact_Info.value;
		clickOn(locator);
	}

	/**
	 * Enter First Name and Last Name.
	 */
	public void enterFirestNameAndLastName() {
		print("Enter First Name and Last Name");
		locator = Locator.Sell.Enter_FirstName.value;
		sendKeys(locator, "Vivek");
		String Lname_locator = Locator.Sell.Enter_LastName.value;
		sendKeys(Lname_locator, "Sharma");
	}

	/**
	 * Enter contact address in Address field.
	 */
	public void enterContactAddress() {
		print("Enter Contact Address");
		String address = propertyReader.readApplicationFile("Address");
		locator = Locator.Sell.Enter_Address.value;
		sendKeys(locator, address);
	}

	/**
	 * Enter City in City field.
	 */
	public void enterContactCity() {
		print("Enter Contact City");
		String city = propertyReader.readApplicationFile("City");
		locator = Locator.Sell.Enter_City.value;
		sendKeys(locator, city);
	}

	/**
	 * Enter Phone Number in phone number field.
	 */
	public void enterContactPhoneNumber() {
		print("Enter Contact Phone Number");
		String phoneNumber = propertyReader.readApplicationFile("PhoneNumber");
		locator = Locator.Sell.Enter_Phone_Number.value;
		sendKeys(locator, phoneNumber);
	}

	/**
	 * Enter Zip code in Zip code field.
	 */
	public void enterContactZipCode() {
		print("Enter Contact Zip Code");
		String zipCode = propertyReader.readApplicationFile("ListingZipCode");
		locator = Locator.Sell.Enter_ZipCode.value;
		sendKeys(locator, zipCode);
	}

	/**
	 * Select State in State drop down.
	 */
	public void selectContactState() {
		print("Select Contact State");
		String state = propertyReader.readApplicationFile("State");
		locator = Locator.Sell.Select_State.value;
		selectDropDownByVisibleText(locator, state);
	}

	/**
	 * Click on checkout button.
	 */
	public void clickOnCheckoutButton() {
		print("Click on Checkout button");
		locator = Locator.Sell.Checkout_Button.value;
		clickOn(locator);
	}

	/**
	 * Enter coupon code and click on Apply coupon code.
	 */
	public void enterCouponCodeAndClickOnApplyButton() {
		print("Enter Coupon code");
		locator = Locator.Sell.CouponCode_Field.value;
		String couponCode = propertyReader.readApplicationFile("CouponCode");
		sendKeys(locator, couponCode);
		print("Click on Apply coupon code button");
		String ApplyCouponCode_locator = Locator.Sell.Apply_Coupon_Code.value;
		clickOn(ApplyCouponCode_locator);
	}

	/**
	 * Assert Sell A Motorcycle Page.
	 */
	public void assertSellAMotorcyclePage() {
		print("Assert Sell A Motorcycle Page");
		locator = Locator.Sell.Sell_Your_Motocycle_Page.value;
		WaitForElementPresent(locator, 30);
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * Assert posted Ad Confirmation Page.
	 */
	public void assertListingConfirmationPage() {
		print("Assert Listing Confirmation Page");
		sleep(4000);
		locator = Locator.Sell.Listing_Confirmation.value;
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * This method is for fill ad details and post the Free Package Ad.
	 */
	public void fillListingDetailsForFreePackage() {
		this.clickOnSelectFreeButton();
		this.assertSellpage();
		this.selectMotorCycleClass();
		this.selectListingYear();
		this.selectListingMake();
		this.selectListingModel();
		this.selectListingTrim();
		this.enterListingPrice();
		this.selectListingPriceTagline();
		this.selectListingCategory();
		this.enterListingMessage();
		this.clickOnEnterYourContactInfoTab();
		this.enterFirestNameAndLastName();
		this.enterContactAddress();
		this.enterContactCity();
		this.selectContactState();
		this.enterContactZipCode();
		this.enterContactPhoneNumber();
		this.clickOnCheckoutButton();
	}

	/**
	 * This method is for fill ad details and post the Enhanced Package Ad.
	 */
	public void fillListingDetailsForEnhancedPackage() {
		this.clickOnSelectEnhancedButton();
		this.assertSellpage();
		this.selectMotorCycleClass();
		this.selectListingYear();
		this.selectListingMake();
		this.selectListingModel();
		this.selectListingTrim();
		this.enterListingPrice();
		this.selectListingPriceTagline();
		this.selectListingCategory();
		this.enterListingMessage();
		this.clickOnEnterYourContactInfoTab();
		this.enterFirestNameAndLastName();
		this.enterContactAddress();
		this.enterContactCity();
		this.selectContactState();
		this.enterContactZipCode();
		this.enterContactPhoneNumber();
		this.enterCouponCodeAndClickOnApplyButton();
		this.clickOnCheckoutButton();
	}

	/**
	 * This method is for fill ad details and post the Best Package Ad.
	 */
	public void fillListingDetailsForBestPackage() {
		this.clickOnSelectBestButton();
		this.assertSellpage();
		this.selectMotorCycleClass();
		this.selectListingYear();
		this.selectListingMake();
		this.selectListingModel();
		this.selectListingTrim();
		this.enterListingPrice();
		this.selectListingPriceTagline();
		this.selectListingCategory();
		this.enterListingMessage();
		this.clickOnEnterYourContactInfoTab();
		this.enterFirestNameAndLastName();
		this.enterContactAddress();
		this.enterContactCity();
		this.selectContactState();
		this.enterContactZipCode();
		this.enterContactPhoneNumber();
		this.enterCouponCodeAndClickOnApplyButton();
		this.clickOnCheckoutButton();
	}

	/**
	 * Assert Sell Your Motorcycle, Edit Your Listing and Cross(X) icon and buttons
	 * are displayed at pop up when click on Sell For Free' link in header at home
	 * page
	 */

	public void clickOnSellForFreeMenuAndAssertButtonsIconOnPopup() {
		print("Click on Sell For Free drop down menu");
		clickOn(Locator.Menus.Sell_For_Free.value);
		waitForElementPresentInDom(1);
		print("Assert Sell Motorcycle Button on Sell for Free drop down");
		String sellMotorcycle = Locator.Menus.Sell_Your_Motorcycle_Button.value;
		Assert.assertTrue(isElementPresent(sellMotorcycle));
		print("Assert Edit Button on Sell for Free drop down");
		String editMotorcycle = Locator.Menus.Edit_Motocycle.value;
		Assert.assertTrue(isElementPresent(editMotorcycle));
		print("Assert Cross Icon on Sell for Free drop down");
		String crossIcon = Locator.Menus.Cross_Icon.value;
		Assert.assertTrue(isElementPresent(crossIcon));
	}

	/**
	 * Assert FREE, ENHANCED, BEST, Select Free , Select Enhanced , Select Best
	 * package options and buttons are displayed under View Our Package Options at
	 * 'Sell your Trader fast, free & secure' page.
	 */
	public void assertFreeEnchancedBestSectionAndButtons() {
		print("Assert Free under View Our Package Options at Sell Motorcycle Page");
		String editSectionText = Locator.Sell.Free_Section.value;
		Assert.assertTrue(isElementPresent(editSectionText));
		print("Assert Enchanced under View Our Package Options at Sell Motorcycle Page");
		String enchancedSection = Locator.Sell.Enchanced_Section.value;
		Assert.assertTrue(isElementPresent(enchancedSection));
		print("Assert Best under View Our Package Options at Sell Motorcycle Page");
		String bestSection = Locator.Sell.Best_Section.value;
		Assert.assertTrue(isElementPresent(bestSection));
		print("Assert Free under View Our Package Options at Sell Motorcycle Page");
		String selecFreeButton = Locator.Sell.Select_Free_Button.value;
		Assert.assertTrue(isElementPresent(selecFreeButton));
		print("Assert Enchanced under View Our Package Options at Sell Motorcycle Page");
		String selecEnchanedButton = Locator.Sell.Select_Enhanced_Button.value;
		Assert.assertTrue(isElementPresent(selecEnchanedButton));
		print("Assert Best under View Our Package Options at Sell Motorcycle Page");
		String selecBestButton = Locator.Sell.Select_Best_Button.value;
		Assert.assertTrue(isElementPresent(selecBestButton));
	}

	/**
	 * Assert Testimonial section with Testimonials is displayed below 'View Our
	 * Package Options' section at at 'Sell your Trader fast, free & secure' page
	 **/
	public void assertTestimonialsectionwithTestimonials() {
		print("Assert Testimonial section at Sell Motorcycle Page");
		String testimonialSection = Locator.Sell.Testimonials_Section.value;
		Assert.assertTrue(isElementPresent(testimonialSection));
		print("Asset Three Testimonials under Assert Testimonial section at Sell Motorcycle Page");
		String testimonialDescripation = Locator.Sell.Testimonials_Descripation.value;
		Assert.assertTrue(isElementPresent(testimonialDescripation));
	}

	/** 
	 * ================================================================================
	 * Assert "Sold our motorcycle super quick and we're very happy!" page with all
	 * testimonials are displayed when user click on Read More Customer reviews
	 * button under testimonial section.
	 * ================================================================================
	 **/
	public void clickonReadMoreCustomerReviewsUnderTestimonialsSection() {
    print("Click on Read More Customer Reviews Button");
    clickOn(Locator.Sell.ReadMoreCustomerReviews_Button.value);
    waitForElementPresentInDom(1);
    print ("Assert Sold our motorcycle super quick and we're very happy! at Testimonial Page");
    String testimonialPage = Locator.Sell.Testimonial_Page.value;
    Assert.assertTrue(isElementPresent(testimonialPage));
    
	}
	/** 
     * ================================================================================
     * Assert "Add Photos & Video" section at Create Listing Page
     * ================================================================================
     **/        
    public void assertAddPhotosVideo()
    {
            print("Assert Add Photos & Video section");
            String AddPhotosAndVideo = Locator.Sell.Add_Photos_Video.value;
            Assert.assertTrue(isElementPresent(AddPhotosAndVideo));
    }
    
	/** 
    * ================================================================================
    * Assert "Add Photos & Video" section at Create Listing Page
    * ================================================================================
    **/        
   public void assetYourListingSummarySection()
   {
           print("Your Listing Summary section");
           String ListingSummmary = Locator.Sell.Your_Listing_Summary.value;
           Assert.assertTrue(isElementPresent(ListingSummmary));
   }
   /** 
    * ================================================================================
    * Assert "Add Photos & Video" section at Create Listing Page
    * ================================================================================
    **/        
   public void assetCheckoutButton()
   {
           print("Your Listing Summary section");
           String CheckoutButton = Locator.Sell.Checkout_Button.value;
           Assert.assertTrue(isElementPresent(CheckoutButton));
   }
	
}
