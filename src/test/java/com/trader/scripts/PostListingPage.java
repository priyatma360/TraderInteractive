package com.trader.scripts;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

public class PostListingPage extends DriverTestCase {

	/**Test_001:
	 * 'Following buttons and icon are displayed at pop up when click on 'Sell For
	 * Free' link in header at home page. 1. Sell Your Motorcycle 2. Edit Your
	 * Listing 3. Cross(X) icon
	 */
	@Test

	public void assertButtonsIcon() {
		OpenURL();
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertButtonsIconOnPopup();
	}

	/**
	 * 'Sell your Trader fast, free & secure' page is displayed when click on Sell
	 * Your Motorcycle button at pop up.
	 */
	@Test

	public void clickonSellYourMotorcycleAndAssertSellYourMotorcycle() {
		OpenURL();
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
	}

	/**
	 * Following package options and buttons are displayed under View Our Package
	 * Options at 'Sell your Trader fast, free & secure' page. 1. FREE 2. ENHANCED
	 * 3. BEST 4. Select Free 5. Select Enhanced 6. Select Best
	 */

	@Test

	public void assertButtonOnSellYourMotorcycle() {
		OpenURL();
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.assertFreeEnchancedBestSectionAndButtons();

	}

	/**
	 * Testimonial section with Testimonials is displayed below 'View Our Package
	 * Options' section at at 'Sell your Trader fast, free & secure' page.
	 */

	@Test
	public void assertTestimonialsectionwithTestimonials() {
		OpenURL();
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.assertTestimonialsectionwithTestimonials();
	}

	/**
	 * "Sold our motorcycle super quick and we're very happy!" page with all
	 * testimonials are displayed when user click on Read More Customer reviews
	 * button under testimonial section.
	 */

	@Test

	public void clickonReadMoreCustomerReviewsUnderTestimonialsSection() {
		OpenURL();
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.clickonReadMoreCustomerReviewsUnderTestimonialsSection();

	}

}