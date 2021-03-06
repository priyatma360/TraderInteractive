package com.trader.locators;

/**
 * @author viveks This locator file used for All application locator.
 */
public class Locator {

	/**
	 * Locators related to login Page.
	 *
	 */
	public enum Login {
		Email_Field("//section[@id='page-content-wrapper']//form/input[@name='username']"), 
		JoinMYTrader_Link("//a[contains(@href,'/myt/join')]"), 
		Login_Link("//*[text()='Log In']"), 
		Login_Failed_Message("//section[@id='page-content-wrapper']//form/p[contains(text(),'Invalid username or password')]"), 
		Password_Field("//section[@id='page-content-wrapper']//form/input[@name='password']"),
		Login_Page("//section[@id='page-content-wrapper']//*[contains(text(),' Create, edit and share listings')]"),
		Forgot_Your_Password("//*[@id='forgotPasswordLink']"), 
		SignIn_Button("//section[@id='page-content-wrapper']//form//button[@value='Sign In']"), 
		Forgot_Password_Page("//*[@id='page-content-wrapper']//*[contains(text(),'FORGOT PASSWORD')]"), 
		Enter_Email("//*[@id='email_addr']"), 
		Retrieve_Password("//*[@id='forgotpassword']//button"), 
		Sent_Password_Confirmation_Msg("//*[@id='result']"),
		Facebook_Button("//*[@aria-label='Facebook']/div"),
		Google_Button("//*[@aria-label='Google+']/div"),
		Dealer_Login("//*[@class='myt-login-form mytForm']//a[contains(@data-track,'Dealer Login')]"),
		Facebook_PopUp("//*[@id='content']"),
		Facebook_Email("//*[@id='email']"),
		Facebook_Password("//*[@id='pass']"),
		Facebook_LoginButton("//*[@id='loginbutton']/input"),
		Facebook_Error_Message("//*[@id='error_box']/div[1]"),
		Facebook_ContinueButton("//*[@name='__CONFIRM__' and contains(text(),'Continue')]"),
		Google_PopUp("//*[@id='initialView']//*[@class='Fmgc2c']"),
		Google_Email("//*[@id='identifierId']"),
		Google_Password("//*[@name='password']"),
		Google_NextButton("//*[@id='identifierNext']"),
		Google_NextPwd("//*[@id='passwordNext']"),
		Google_Validation("//*[@class='dEOOab RxsGPe' and contains(text(),'find your Google Account')]");
		
		public String value;

		private Login(String value) {
			this.value = value;
		}
	}

	/**
	 * Locators related to Hamburger menu and .
	 *
	 */
	public enum Menus {
		More_HamburgerButton("//div[@id='hamburgerButton']"), 
		MyTrader_SignIn("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Sign In']"),
		SignOut_MyTrader("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Sign Out']"),
		BUY("//*[@id='page-content-wrapper']//nav//a[contains(@href,'-for-sale')]"),
		Sell_For_Free("//*[@id='page-content-wrapper']//nav//a[contains(text(),'Sell')]"),
		Research("//nav//a[@href='/research']"),
		Race_Team("//nav//a[@href='/raceteam']"),
		News("//*[starts-with(@class,'lfloat nav-menu')]//li/a[@title='motorcycle News']"),
		Dealers("//*[@id='page-content-wrapper']//li/a[contains(text(),'Dealers')]"),
		Research_Page("//*[@id='section-content']//*[contains(text(),'Research Motorcycles ')]"),
		Race_Team_Page("//*[@id='section-content']//*[contains(text(),'CycleTrader.com ')]"),
		News_Page("//*[@id='section-content']//h1[contains(text(),'Cycle News')]"),
		Saved_Icon("//*[@class='mobHdr gradient-primary']//a/div"),
		Loan_Finance("//div[@id='zone-content']//*[@id='page-title']"),
		Learn_More("//*[@id='node-page-1']//a[contains(text(),'Learn More')]"),
		SellForFree_MenuDropDown("//*[@id='additional-info-sell']"),
		DealerMenu_DropDown("//*[@id='additional-info-dealers']"),
		Close_Icon("//*[text()='Close']"),
		Hamburger_Listing("//*[@id='sidebar-wrapper']"),
		Home_Link("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Home']"),
		Find_Motorcycle_Link("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Advanced Search']"),
		Advanced_Search_Link("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Advanced Search']"),
		Find_Parts_Link("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Find Parts, Gear and More']"),
		Dealer_Search_Link("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Find A Dealer']"),
		Sell_Motorcycle_Link("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Sell My Motorcycle']"),
		Dealer_Center_Link("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Dealer Sign In']"),
		Motorcycle_Research_Link("//*[@id='sidebar-wrapper']//*[contains(text(),'Motorcycle Research')]"),
		Race_Team_Link("//*[@id='sidebar-wrapper']//a[@data-track='Sidebar Nav - Race Team']"),
		News_Link("//*[@id='sidebar-wrapper']//a/li[contains(text(),'News')]"),
		Feedback_Link("//*[@id='wrapper']//a[@data-track='Sidebar Nav - Web Site Feedback']"),
		Need_help_Link("//*[@id='wrapper']//a[@data-track='Sidebar Nav - Need Help']"),
		MyTrader_MyTraderAccount("//*[@id='sidebar-wrapper']/ul/li[11]/a");

		public String value;

		private Menus(String value) {
			this.value = value;
		}
	}

	/**
	 * Locators related to My Trader page.
	 *
	 */
	public enum MyTrader {
		MyTrader_Message("//*[@id='nav-secondary']/following-sibling::div//*[contains(text(),'Welcome')]"),
		Saved_Searches("//*[@class='myt-nav-container']//li/a[@title='Saved Searches']"),
		Saved_Listing("//*[@class='myt-nav-container']//li/a[@title='Saved Listings']"),
		Sell_A_Motorcycle("//a[contains(text(),'Sell a Motorcycle')]"),
		Account_Setting("//*[@class='myt-nav-container']//li/a[contains(text(),'Account Settings')]"),
		MyTrader_Home("//div[@class='refine-column-hdr']//a[@href='/myt']"),
		Saved_Listing_Edit("//*[@id='page-content-wrapper']//div//h3/a[2][contains(@href,'/myt/saved-listings')]"),
		Saved_Search_Edit("//*[@id='page-content-wrapper']//div//h3/a[2][contains(@href,'/myt/searches')]"),
		Saved_Listings_Section("//*[@id='page-content-wrapper']//div[3]//a[contains(text(),'Saved Listings')]"),
		Saved_Searches_Section("//*[@id='page-content-wrapper']//div[3]//a[contains(text(),'Saved Searches')]"),
		Your_Saved_Listing("//*[@id='page-content-wrapper']//div//*[contains(text(),'Saved Listings')]"),
		Your_Saved_Searches("//*[@id='page-content-wrapper']//div//*[contains(text(),'Saved Searches')]"),
		First_Name("//*[@id='firstName']"),
		Last_Name("//*[@id='lastName']"),
		Save_Changes_Button("//*[@id='submitAccountInfo']"),
		Updated_Changes_Messages("//*[@id='mytAccountForm']//p[contains(text(),'Updated')]"),
		MyTrader_Info_Page("//*[@id='page-content-wrapper']//*[contains(text(),'MyTrader Information')]"),
		My_Listings("//*[@class='myt-nav-container']//li/a[@title='My Listings']"),
		My_Listings_Section("//*[@id='page-content-wrapper']//div[3]//a[contains(text(),'My Listings')]"),
		Ad_Links_MyListing("//*[@id='page-content-wrapper']/div[2]/div[3]/div/div[1]/ul/li"),
		My_Listings_Heading_Count("(//*[@class='myt-column'])[1]/h3/a[1]"),
		Posted_Ad_links("(//*[@class='list-unstyled'])[3]/li"),
		My_Listing_Edit_Button("(//*[@class='myt-column'])[1]/h3/a[2]"),
		Edit_Listing_Button("//*[contains(text(),'Edit Listings')]"),
		Edit_Button("(//*[@class='list-unstyled'])[3]/li[1]/a/i");
		
		
		public String value;

		private MyTrader(String value) {
			this.value = value;
	
	}
      
	}		
	/**
	 * Locators related to Home page.
	 *
	 */
	public enum Home {
		Find_Motorcycle_Dealers("//*[@id='index-search-form']//*[@id='submit_button_dealer']"),
		Button_More("//div[@id='hamburgerButton]/span[@text='More']"), 
		Search_Tab("(//*[@id='oas_x55']/following-sibling::div//span)[1]"),
		Sell_Motorcycle("//div[@class='index-search-width']//h5"),
		Recent_Searches("//div[@class='recents-pop small white text-left lfoat margin-top10']//a"),
		Recent_Search_Link("//div[@class='recents-pop small white text-left lfoat margin-top10']/div[2]//li[1]/a"),
		Find_Button("//*[@id='submit_button']"), 
		Keyword_Field("//input[@id='modelText']"), 
		Zip_Code("//input[@id='zip_code']"), 
		Radius_DropDown("//div[@class='main-radius']/select"), 
		Advanced_Search_Link("//*[@id='advancedSearchLink']"), 
		Keyword_Auto_Suggestion("//ul[@id='sugs']"),
		Keyword_Suggestion("//ul[@id='sugs']/li[1]/span"), 
		Popular_Makes("//div[@id='browse-section']//a[contains(text(),'Makes')]"), 
		Popular_Types("//div[@id='browse-section']//a[contains(text(),'Types')]"), 
		Popular_States("//div[@id='browse-section']//a[contains(text(),'States')]"), 
		Makes_BMW("//*[@id='2315626']/a"), 
		Makes_CAN_AM("//*[@id='2315918']/a"), 
		Makes_Ducati("//*[@id='2316082']/a"), 
		Makes_Harley("//*[@id='2316294']/a"), 
		Makes_Honda("//*[@id='2316874']/a"), 
		Makes_KTM("//*[@id='2319322']/a"), 
		Makes_Kawasaki("//*[@id='2318344']/a"), 
		Makes_Suzuki("//*[@id='2320128']/a"), 
		Makes_Triumph("//*[@id='2321036']/a"), 
		Makes_Victory("//*[@id='6772333']/a"), 
		Makes_Yamaha("//*[@id='2321194']/a"), 
		Makes_SearchAll("//ul[@id='makeIcons']//a[contains(@title,'Search all motorcycle makes')]"), 
		Application_Logo("(//*[@id='page-content-wrapper']//img)[2]"), 
		Top_Makes("//div[@id='wrapper']//*[contains(text(),'Top Motorcycle Makes')]"), 
		Top_Makes_Harley("//div[@id='wrapper']//a[contains(text(),'Harley-Davidson')]"), 
		Top_Makes_Honda("//div[@id='wrapper']//a[contains(@href,'Honda')]"), 
		Top_Makes_Yamaha("//div[@id='wrapper']//a[contains(@href,'Yamaha')]"), 
		Top_Makes_Kawasaki("//div[@id='wrapper']//a[contains(@href,'/Kawasaki-Motorcycles')]"), 
		Top_Makes_Suzuki("//div[@id='wrapper']//a[contains(@href,'Suzuki')]"), 
		Top_Makes_CanAm("//div[@id='wrapper']//a[contains(@href,'Can-Am')]"), 
		Top_Makes_BMW("//div[@id='wrapper']//a[contains(@href,'BMW')]"), 
		Top_Makes_KTM("//div[@id='wrapper']//a[contains(@href,'KTM')]"), 
		Top_Makes_Triumph("//div[@id='wrapper']//a[contains(@href,'Triumph')]"), 
		Top_Makes_Victory("//div[@id='wrapper']//a[contains(@href,'Victory')]"), 
		Top_Model("//div[@id='wrapper']//div/*[contains(text(),'Models')]"),
		Top_KAWASAKI_NINJA("//div[@id='wrapper']//a[contains(text(),'Kawasaki NINJA')]"),
		Top_ELECTRA_GLIDE("//div[@id='wrapper']//a[contains(text(),'Harley-davidson ELECTRA GLIDE')]"),
		Top_HONDA_CRF("//div[@id='wrapper']//a[contains(text(),'Honda CRF')]"),
		Top_HONDA_CBR("//div[@id='wrapper']//a[contains(text(),'Honda CBR')]"),
		Top_Street_Glide("//div[@id='wrapper']//a[contains(text(),'Harley-davidson STREET GLIDE')]"),
		Top_KAWASAKI_VULCAN("//div[@id='wrapper']//a[contains(text(),'Kawasaki VULCAN')]"),
		Top_Spyder_Can("//div[@id='wrapper']//a[contains(text(),'Can-am SPYDER')]"),
		Top_YAMAHA_YZF("//div[@id='wrapper']//a[contains(text(),'Yamaha YZF')]"),
        Top_YAMAHA_V_STAR("//div[@id='wrapper']//a[contains(text(),'Yamaha V STAR')]"),
        Top_Road_Glide("//div[@id='wrapper']//a[contains(text(),'Harley-davidson ROAD GLIDE')]"),
		Top_Type("//*[contains(text(),'Top Motorcycle Types')]"),
		Top_Types_List("//div[@class='col-md-4']//a[contains(@href,'\" + topModelList + \"')]"),
		Sell_Motorcycle_Section("//*[@id='page-content-wrapper']/div[contains(@class,'marketing-promo marketing')]"),
		Post_For_Free("//*[@id='page-content-wrapper']/div[contains(@class,'marketing-promo marketing')]//a"),
		Interested_Used_Bikes("//*[@id='page-content-wrapper']/div[7]/div/h4"),
		Check_It_Out("//*[@id='page-content-wrapper']/div[7]/div/a"),
		ISSUU("(//a[@itemprop=\"author\" and text()='Cycle Trader'])[1]"),
		Stay_Connected("//*[@id='page-content-wrapper']//*[contains(text(),'Stay Connected')]"),
		Enter_Email("(//*[@type='email'])[1]"),
		Sign_Up_Button("(//*[@class='btn btn-inverse newsletterSignup'])[1]"),
		Give_Us_Feedback("//*[text()='Give Us Feedback']"),
		Newsletter_SignUp_ConfirmatioMessage("(//*[@id='page-content-wrapper']/div[8]/div/div[1])[1]"),
		Top_Make("//*[contains(text(),'Top Motorcycle Makes')]"),
		Top_MakeModel("//*[contains(text(),'Top Motorcycle Make/Models')]"),
		TopType("//*[contains(text(),'Top Motorcycle Make/Models')]"),
		Explore_CycleTrader("(//footer/div/div/*)[1]"),
		CycleTrader_Newsletter("(//footer/div/div[2]/*)[1]"),
		CycleTrader_Affiliates("(//footer/div/div[3]/*)[1]"),
		Dealer_Fuel("//*[contains(@class,'footer-title-bottom')]"),
		FollowUs("(//*[contains(@class,'h1')])[4]"),
		Give_Feedback("(//*[contains(@class,'btn-inverse hidden-xs hidden-sm')])[2]"),
		Career("//*[contains(text(),'Career')]"),
		Careers_ResultPage("//div[@id='careers']/h1"),
		Footer_Logo("//*[@class='footer-logo']"),
		Email_Us_Feedback("(//div[@class='col-xs-12'])[2]/a[1]"),
		Newsletter_Email("//*[@class='newsletterInput']"),
		Newsletter_SignUp("(//*[contains(@class,'newsletterSignup')])[2]"),
		Newsletter_Confirmation("(//*[contains(@class,'footerList')])[2]/li"),
		Dealer_Login_Signup("//a[contains(text(),'Dealer Login')]"),
		Dealer_Search("//a[contains(text(),'Dealer Search')]"),
		Dealer_Centre("//*[@id='index-section']//h1"),
		Motorcycle_Sale("(//div[@class='summary']//a)[1]"),
		Give_Trader_Feedback("//a[@data-track='Feedback Link'][1]");

		public String value;

		private Home(String value) {
			this.value = value;
		}
	}

	/**
	 * Locators related to Search.
	 *
	 */
	public enum Search {
		Search_Result_Page("//*[@id='topicTitle']/em"), 
		Advanced_Search_Page("//div[@id='nav-secondary']/following-sibling::div//*[contains(text(),'Find Motorcycles For')]"), 
		Ad_SearchResult("//*[@id='topicTitle']"), 
		Search_Result("//section[@id='searchPage']//h2/b"), 
		SearchAllMakes_Result("//*[@id='nav-secondary']/following-sibling::div//*[contains(text(),'Motorcycles For Sale')]"), 
		Browse_All_Makes("//a[@class='browseBtnAll']"), 
		Makes_Link("//div[@id='mkLnks']//a"),
		Buy_Result_Page("//*[@id='page-content-wrapper']//div/h1"),
		Save_This_Search_Button("(//*[@id='btnSaveSearch']/span)[1]"),
		Save_Search_Button("//div[@class='titleUpdate']//button[@id='modalSaveSearchButton']"),
		Save_Search_Title("//div[@id='mytraderModal']//input"),
		Listed_AD("(//div[@id='listingsContainer']//h2)[1]"),
		Listing_Name("//*[@class='contactBtns hidden-xs']//h1[1]"),
		Save_Listing("//div[@class='contactBtns hidden-xs']//*[@id='saveListing']"),
		Save_Listing_Button("//div[@id='mytraderModal']//*[@id='modalSaveListingButton']"),
		Save_Listing_Link("(//*[@class='saveListingText'])[1]"),
		Email_Only("//div[@class='contactBtns hidden-xs']//a[@href='#emailSection']"),
		Estimate_Payment("//*[@id='page-content-wrapper']/div[2]//div[@data-track='Detail-Top Bar-Calculate Payments']"),
		Contact_Seller("//div[@class='formCont']//*[contains(text(),'Contact Seller')]"),
		Listing_With_Price("(//div[@id='listingsContainer']//*[@class='listing-price'])"),
		Brochure_Icon_Listing("(//*[@id='listingsContainer']//*[contains(@class,'pix3 center ')])[1]"),
		Video_Icon_Listing("(//*[@id='listingsContainer']//*[contains(@class,'video-camera')])[1]"),
		Seller_Name("(//div[@id='listingsContainer']//*[contains(@class,'companyName seller-title')]/span[2])[1]");
		

		public String value;

		private Search(String value) {
			this.value = value;
		}
	}

	/**
	 * Locators related to Advanced Search.
	 *
	 */
	public enum AdvancedSearch {
		Location_Option("//div[@id='locationOption']"), 
		Location_Radius("//div[@id='locationDetail']/div[2]/select"), 
		Location_ZipCode("//div[@id='locationDetail']/div[2]/div/input"), 
		Location_Update("//div[@class='btn btn-primary updateLocation bounce animated']"), 
		See_Matches("//div[@id='runSearchBtn']//div[@id='runRefineSearch']"), 
		Keyword_Option("//div[@id='keywordOption']"), 
		Advanced_Keyword("//input[@id='modelText']"), 
		Advanced_Type("//div[@id='typeOption']"), 
		Advanced_Make("//div[@id='makeOption']"), 
		Advanced_Model("//div[@id='modelOption']"), 
		Advanced_Trim("//div[@id='trimOption']"), 
		Advanced_Category("//div[@id='categoryOption']"), 
		Advanced_Price("//div[@id='priceOption']"),
		Advanced_New_Used("//a[contains(text(),'New or Used')]"),
		Advanced_Year("//*[@id='yearOption']"),
		Advanced_Seller_Type("//*[@id='seller_typeOption']"),
		Advanced_Mileage("//*[@id='mileageOption']"),
		Advanced_Engine_Size("//*[@id='engineSizeOption']"),
		Advanced_State("//*[@id='stateOption']"),
		Advanced_City("//*[@id='cityOption']"),
		Keyword_Update_Button("//div[@class='btn btn-primary updateKeyword bounce animated']"), 
		Choose_Types("//div[@class='popover-content']//div[@data-value='356953']/span"), 
		Choose_Make("//div[@class='checkSelection']/label/span[text()='Aprilia']"), 
		Choose_Model("//div[@class='checkSelection']/label/span[text()='CAPONORD']"),
		Choose_Trim("(//*[@class='refineOptions']/div[2]//span[1])[12]"),
		Choose_Category("//div[contains(@id,'popover')]//div[2]/div/label/span"),
		Private_Seller_Type("//div[@id='seller_typeDetail']//a[contains(text(),'Private Seller')]"),
		Update_Button_PopUp("//div[@class='btn btn-primary bounce animated']"),
		Location_Updates("//*[@class='fa-2xx fa fa-trash fa-primary resetFilter rfloat fa-chevron-down']"), 
		Updating_Spinner("//div[@id='loadingModal']/div/i"),
		Find_By_Make_Button("//*[@class='btnBox rfloat']/a[contains(text(),' Find By Make')]"),
		Find_By_Type_Button("//*[@class='btnBox rfloat']/a[contains(text(),' Find By Type')]"),
		Find_By_State_Button("//*[@class='btnBox rfloat']/a[contains(text(),' Find By State')]"),
		Find_By_Search_Result("//section[@id='page-content-wrapper']//h1"),
		See_Matches_Button("//div[@id='runRefineSearch']/span"),
		Listing_Matches_Counts("//*[@id='searchPage']//b/span"),
		Min_Price("//div[contains(@id,'popover')]//div[2]//select[contains(@class,'minValue')]"),
		Max_Price("//div[contains(@id,'popover')]//div[2]//select[contains(@class,'maxValue')]"),
		Start_Over_Link("//*[@id='resetRefineSearch']"),
		Find_By_Make("//*[@id='browseMake']"),
		Find_By_Type("//*[@id='browseType']"),
		Find_By_State("//*[@id='browseState']"),
		Find_Dealers("//*[@id='browseDealer']"),
		Find_Makes_Links("(//*[@class='footerLink']/span)[1]/a"),
		Find_Types_Links("(//*[@class='footerLink']/span)[2]/a"),
		Find_State_Links("(//*[@class='footerLink']/span)[3]/a"),
		Find_Trader_Dealers("(//*[@class='footerLink']/span)[4]/a"),
		By_Type("(//a[contains(text(),'by Type')])[1]"),
		By_State("(//a[contains(text(),'by State')])[1]"),
		By_Make("(//a[contains(text(),'by Make')])[1]"),
		State_Links("//*[@class='browseContainer']/div"),
		Advanced_Search_Button("//*[@class='btnBox rfloat']/a"),
		Browse_All_Makes("//*[@id='allMakes']");

		public String value;

		private AdvancedSearch(String value) {
			this.value = value;
		}
	}

	/**
	 * Locators related to Join My trader page.
	 *
	 */
	public enum JoinMyTrader {
		First_Name("//input[@id='firstName']"), 
		Last_Name("//input[@id='lastName']"), 
		Email_Field("//input[@id='email1']"), 
		Password_Field("//input[@id='password']"), 
		Re_Password("//input[@id='password2']"), 
		Zip_Code("//input[@id='zip']"), 
		JoinMyTrader_Button("//*[@id='btnJoin']"), 
		SignUp_ExistingEmail_Message("//*[@id='joinForm']/p[2]"),
		SignUp_InvalidEmail_Message("//*[@id='joinForm']/p");

		public String value;

		private JoinMyTrader(String value) {
			this.value = value;
		}
	}

	/**
	 * Locators related to Makes.
	 *
	 */
	public enum Makes {
		Makes_Result_Page("//*[contains(@id,'topicLinks')]/*[contains(text(),'\" + text + \"')]"),
		BMW_Link("//div[@id='mkLnks']//a[contains(text(),'BMW')]"), 
		CAN_AM_Link("//div[@id='mkLnks']//a[contains(text(),'Can-Am')]"), 
		Ducati_Link("//div[@id='mkLnks']//a[contains(text(),'Ducati')]"), 
		Harley_Link("//div[@id='mkLnks']//a[contains(text(),' Harley-Davidson')]"), 
		Honda_Link("//div[@id='mkLnks']//a[contains(text(),'Honda')]"), 
		KTM_Link("//div[@id='mkLnks']//a[contains(text(),'KTM')]"), 
		Kawasaki_Link("//div[@id='mkLnks']//a[contains(text(),'Kawasaki')]"), 
		Suzuki_Link("//div[@id='mkLnks']//a[contains(text(),'Suzuki')]"), 
		Triumph_Link("//div[@id='mkLnks']//a[contains(text(),'Triumph')]"), 
		Victory_link("//div[@id='mkLnks']//a[contains(text(),'Victory')]"), 
		Yamaha_Link("//div[@id='mkLnks']//a[contains(text(),'Yamaha')]"), 
		Home_Breadcrumb("//*[@title='Home']"), 
		BMW_Icon("//*[@id='mkBtn']//*[@data-track='Browse-By Make-BMW']"), 
		Triumph_Icon("//*[@id='mkBtn']//*[@data-track='Browse-By Make-Triumph']"), 
		Yamaha_Icon("//*[@id='mkBtn']//*[@data-track='Browse-By Make-Yamaha']"),
		Make_Link("//*[@id='linkList']//li[1]/a"),
		BMW_Make_Link("//*[@id='linkList']/ul//a[contains(text(),'BMW')]"),
		Trim_Link("//*[@id='linkList']/ul[1]/li[1]/a");

		public String value;

		private Makes(String value) {
			this.value = value;
		}
	}
	
	/**
	 * Locators related to Types.
	 *
	 */
	public enum Types {
		Popular_Types("//div[@id='browse-section']//*[@title='Motorcycles by Type']"), 
		Search_All("//div[@id='browse-section']//*[@title='Search all motorcycle types for sale']"),
		Popular_Type_Icons("//*[@id='typeIcons']/li/a[contains(@title,'\"+topTypelList+\"')]"),
		Types_Result_Page("//*[@id='topicLinks']//em[contains(text(),'\"+text+\"')]"),
        View_New_Button("//*[@id='newTopicLinks']"),
        View_Used_Button("//*[@id='usedTopicLinks']"),
        View_All_Button("//*[@id='viewAllTopicLinks']"),
        Hide_All_Button("//*[@id='hideAllTopicLinks']"),
        Make_Section("//*[contains(@id,'linkList' ) and contains(@class,'truncated')]"),
        Type_Icon("//*[@class='browseContainer']//li[1]//a");

		public String value;

		private Types(String value) {
			this.value = value;
		}
	}
	
	/**
	 * Locators related to State.
	 *
	 */
	public enum State {

		Popular_State_Tab("//div[@id='browse-section']//a[3]"), 
		Search_All("//div[@id='browse-section']//*[@title='Search Motorcycles for sale in all states']"),
		State_Search_Result("//div[@class='hero-container']/div/h1");

		public String value;

		private State(String value) {
			this.value = value;
		}
	}
	
	/**
	 * Locators related to Sell Motorcycle.
	 *
	 */
	public enum Sell{
		Enter_Vehicle_Info("//div[@id='step1']/h4"),
		Sell_Your_Motorcycle("//div[@id='additional-info-sell']//a[@class='btn btn-primary btn-lg center']"),
		Have_Listing("//*[@id='sellCont']//div[2]/a"),
		Sell_Your_Motocycle_Page("//*[@id='sellCont']//*[contains(text(),'Sell your')]"),
		Select_Free_Button("//*[@id='packageAnchor']//tbody//a[contains(text(),'Select Free')]"),
		Select_Enhanced_Button("//*[@id='packageAnchor']//tbody//a[contains(text(),'Select Enhanced')]"),
		Select_Best_Button("//*[@id='packageAnchor']//tbody//a[contains(text(),'Select Best')]"),
		Select_Class("//*[@id='class']"),
		Select_Year("//*[@id='year']"),
		Select_Make("//*[@id='make']"),
		Select_Model("//*[@id='model']"),
		Select_Trim("//*[@id='trim']"),
		Enter_Price("//*[@id='price']"),
		Price_Tagline("//div[@class='rfloat width20p price-tagline']//select"),
		Select_Category("//div[@id='category']//select"),
		Enter_Message("//div[@id='mceu_5-body']//iframe[@id='description_ifr']"),
		Enter_Your_Contact_Info("//div[@id='step3']/h4"),
		Enter_FirstName("//div[@id='step3']//*[@id='firstName']"),
		Enter_LastName("//div[@id='step3']//*[@id='lastName']"),
		Enter_Address("//div[@id='step3']//*[@id=\"address\"]"),
		Enter_City("//div[@id='step3']//*[@id=\"city\"]"),
		Select_State("//div[@id='step3']//*[@id='state']"),
		Enter_Phone_Number("//div[@id='step3']//*[@id='phone']"),
		Enter_ZipCode("//div[@id='step3']//*[@id='zip']"),
		Checkout_Button("//div[@class='desktop-overflow-wrapper']/div//div/a[contains(text(),' Checkout')]"),
		Step_Validator("//i[@id='step1Validation']"),
		Listing_Confirmation("//div[@id='sellCont']//*[@id='title']"),
		Message_iFrame("//iframe[@id='description_ifr']"),
		CouponCode_Field("//input[@id='promoCode']"),
		Apply_Coupon_Code("//*[@id='checkPromoCode']");

		public String value;

		private Sell(String value) {
			this.value = value;
		}
	}
	
	/**
	 * Locators related to Motorcycle Dealers
	 *
	 */
	public enum Dealer {
		Find_Motorcyle_Dealer("//*[@id='page-content-wrapper']//h1[contains(text(),'Dealers')]"),
		Search_Dealer_Button("//div[@id='additional-info-dealers']//a[contains(text(),' Search Dealers')]"),
		Find_By_State("//*[@class='state-search clearfix']/*[contains(text(),'Find by State')]"),
		Search_Button("//*[@id='searchForm']//button[@id='submit_button']"),
		Dealer_Result_Page("//*[@id='topicTitle' and contains(text(),'motorcycle dealers')]"),
		Dealer_Login_SignUp("//*[@class='btn btn-inverse' and contains(text(),'Dealer Login')]"),
		Dealer_Name("//*[@id='nameText']"),
		All_Makes("//*[@id='makeSelect']"),
		Radius("//*[@name='radius']"),
		Zip_Code("//*[@id='zip_code']"),
		Listing_Name("(//*[@class='list-unstyled margin-top10']//h2)[1]"),
		Top_Makes("(//*[@id='makeSelect']/optgroup)[1]/option"),
		Dealer_Result("//*[@id='topicTitle']"),
		New_Search("//*[@class='btnBox']/a"),
		Nearest_Sorting("(//*[contains(text(),'Nearest')])[1]"),
		Name_Sorting("(//button[contains(text(),'Name')])[1]"),
		Buttons_DealerListed("//*[@class='list-unstyled margin-top10']//li[1]//a"),
		Call_Button("(//*[@title='call this seller'])[1]"),
		SearchListing_Button("//span[contains(text(),'Search')]"),
		Matches_Count("(//*[@id='searchPage']//span)[2]"),
		Dealer_Grid("//*[@class='dealerPage']//ul/li"),
		Dealer_First_Grid("//*[@class='dealerPage']//ul/li[1]//h2"),
		Dealer_ResultPage("//*[@class='dealer-detail-info']/h1"),
		Website_Link("//a[contains(text(),'Website')]"),
		Email_Link("//a[contains(text(),'Email')]"),
		Map_Link("//div[@class='dealer-detail-info']//a[contains(text(),'Map')]"),
		Google_Map("//div[@id='omnibox']"),
		Contact_Seller("//span[contains(text(),'Contact Seller')]"),
		Save_Search("//*[@id='btnSaveSearch']//span[1]"),
		Premium_Sorting("//button[contains(text(),'Premium')]"),
		Sorting_Options_Enabled("//button[@class='btn sortSelection btn-gray']"),
		Year_Sorting("//button[contains(text(),'Year')]"),
		Price_Sorting("//button[contains(text(),'Price')]"),
		Newly_Listed_Sorting("//button[contains(text(),'Newly Listed')]"),
		Refine_Section("//*[@id='refine-main']"),
		Filter_Link("//*[@id='refineHdr']/div[contains(@class,'lfloat pointer')]");
		
		public String value;

		private Dealer(String value) {
			this.value = value;
		}
	}
	
	/**
	 * Locators related to Ad details page.
	 *
	 */
	public enum ListingDetails{
		Seller_Fname("//div[@id='section1']//input[@name='first_name']"),
		Seller_Lname("//div[@id='section1']//input[@name='last_name']"),
		Seller_Email("//div[@id='section1']//input[@name='email']"),
		Verify_Checkbox("//*[@id='recaptcha-anchor']/div[contains(@class,'-checkmark')]"),
		Contact_Button("//div[@id='section1']//button[@id='submitEmail']"),
		Down_Payment("//*[@id='paymentCalc']//input[@name='dwnpymt']"),
		Interest_Rate("//*[@id='paymentCalc']//input[@name='rateInput']"),
		Loan_Term("//*[@id='paymentCalc']//input[@id='btn72']"),
		Estimated_Payment("//*[@id='paymentCalc']//*[@id='pymt']"),
		Cross_Icon("//div[@id='modalWindowsContainer']//a"),
		RequestPrice_Listing("(//a[contains(@class,'requestPrice btn')]/following::div[contains(@class,'companyName seller-title')])[1]"),
		Listing_Name("(//div[@class='detail-title']//h2)[1]"),
		Visit_Dealer_Website("(//a[contains(text(),'Visit Dealer Website')])[1]"),
		Request_Price("(//a[contains(text(),' Request Price')])[1]"),
		Estimate_Payment("(//a[contains(@class,'calculatePaymentsText')])[1]"),
		Email("(//a[@href='#emailSection'])[1]"),
		Save("(//a[@id='saveListing'])[1]"),
		Get_Quote_Listing("(//*[@id='bestPrice'])[1]/ancestor::div[1]"),
		Get_Quote_Button("(//*[@class='detail-price bold']/a)[1]"),
		Tagline_PopUp("//*[@id='mytraderModal']//*[@id='hdrSaveSearch']"),
		Phone_Number_ListingDetails("(//*[contains(@class,'callButton telHref')])[1]/span"),
		Phone_Number_GetQuote("//*[@id='modalWindowsContainer']//*[contains(text(),'Call')]"),
		GetQuote_Fname("//*[@id='modalWindowsContainer']//input[@name='first_name']"),
		GetQuote_Lname("//*[@id='modalWindowsContainer']//input[@name='last_name']"),
		GetQuote_Email("//*[@id='modalWindowsContainer']//input[@name='email']"),
		OBO_Listing("(//*[@class='tagline smallest' and contains(text(),'OBO')])[1]"),
		Tagline("(//*[@class='detail-title']//span)[1]"),
		OutTheDoor_Listing("(//*[@class='tagline smallest' and contains(text(),'Out The Door Price')])[1]"),
		Reduced_Listing("(//*[@class='tagline smallest' and contains(text(),'Reduced')])[1]"),
		Testing_Listing("(//*[@class='tagline smallest' and contains(text(),'testing')])[1]"),
		Warranty_Listing("(//*[@class='tagline smallest' and contains(text(),'Warranty')])[1]"),
		Financing_Listing("(//*[@class='tagline smallest' and contains(text(),'Financing')])[1]"),
		PhoneNumber_Listing("(//*[@class='seller-phone pointer']/span[2])[1]"),
		NextPage_Button("//*[@id='pageNext']"),
		Saved_Icon("(//*[@id='saveListing']/*[contains(@class,'fa-heart fa-yellow saved')])[1]"),
		Saved_This_Listing("(//a[@title='Unsave This Listing']//span[contains(text(),'Save This Listing')])[1]"),
		Save_This_Listing("(//a[@title='Save This Listing']//span[contains(text(),'Save This Listing')])[1]"),
		Dealer_Name("(//div[@id='listingsContainer']//span[contains(@class,'seller-name')])[1]"),
		Dealer_Address("(//*[contains(@class,'sellerOverview')]//li)[1]"),
		What_My_TradeIn("(//*[contains(@class,'tradeInButton')])[2]/span[1]"),
		Dealer_Logo("(//*[@alt='Dealer logo image'])[1]"),
		More_From_Dealer("(//*[contains(@class,'btn-group-vertical')])[1]//span[contains(text(),'More From')]"),
		Save_Listing_Tab("(//*[contains(@class,'btn-group-vertical')])[1]//span[contains(text(),'Save This Listing')]"),
		Captcha("(//*[contains(@id,'recaptcha-anchor')])[1]"),
		Friend_Email("//*[@id='section1']//input[@name='to']"),
		Your_Name("//input[@name='name']"),
		Your_LName("(//input[@name='last_name'])[2]"),
		Your_Email("//div[@id='section1']//input[@name='from']"),
		FriendEmail_Contact_Button("(//*[@id='submitEmail'])[2]"),
		SendTo_Friend_PopUp("//*[contains(@id,'hdrSaveSearch')]"),
		SendTo_Friend_Tab("(//*[contains(@class,'sendToFriend')]/span)[1]"),
		Estimate_Payment_Tab("(//*[contains(@class,'calculatePaymentsButton')])[3]"),
		Report_This_Ad("(//*[contains(@class,'lfloat') and contains(text(),'Report this Ad')])[1]"),
		Dealer_Website("(//*[contains(@class,'link dealerWebsiteLink')])[1]"),
		Print_Listing("(//*[contains(@class,'link hidden-xs hidden-sm')])[1]"),
		Sell_Motorcycle("//*[@class='texttoolbar']//*[contains(text(),'Sell My Motorcycle')]"),
		Share_Link("//*[@id='share']"),
		Facebook_icon("//*[@id='gigyaShare-reaction0-icon']//div"),
		Twitter_Icon("//*[@id='gigyaShare-reaction1-icon']//div"),
		Pinterest_Icon("//*[@id='gigyaShare-reaction2-icon']//div"),
		Brochure_Icon("//*[@id='royalSliderAutoPlay']/span"),
		Watch_Video("//*[@class='counts center']//*[contains(@class,'video-camera')]"),
		Listing_Image_Section("//*[@id='Gallery']//div[@class='rsThumbsContainer']"),
		Seller_Address("(//*[@id='page-content-wrapper']//*[contains(@class,'sellerOverview')]//p[2])[1]"),
		Resource_List("//*[contains(@class,'resourceList')]/li"),
		Issue("(//*[@id='issue']/option)[2]"),
		Reason("//*[@id='reason']"),
		Details_From_Seller("//*[@class='info-section']/*[contains(text(),' Details')]");
				
		public String value;

		private ListingDetails(String value) {
			this.value = value;
		}
	}
	
}
