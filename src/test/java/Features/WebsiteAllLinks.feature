@website_all_links
Feature: SlideTeam Links

@header
Scenario: 

	Given Open the Website URL.
	Then user enter email and password epu
	Then Check Ebooks Page.
	Then Pricing Page.
	Then Free PPTs Page.
	Then Most Downloaded Page.
	Then Newly Added Page.
	Then Blog Page.
	Then Free Business PPTs Page.
	Then Template Finder Page.

@Footer_Quick_Links
Scenario Outline: Footer Quick Links.

	Then About Us Page.
	Then How it Works page.
	Then Site Map Page.
	Then Contact Us Page.
	Then FAQ Page.
	Then Terms of Use Page.
	Then Privacy Policy Page.
	Then Popular Free Slides Page.
	Then Template Finder Page.
	Then Research Services Page.
	Then Google Slides Page.


Examples:

|Email Address| |Password|
|himanshi.sharma@slidetech.in| |123456|

	@1_Diagrams
	Scenario: Test Diagram Footer.
		Given user is already on Website Footer.
		Then Advertising Test Diagram Page.
		Then View All Test Diagram Page.
	
	@2_Business_Slides
	Scenario: Business Slides Footer.
		Given user is already on Website Footer.
		Then About Us Company Details Business Details Page.
		Then View All Business Slides Page.
	
	@3_Flat_Designs
	Scenario: Arrows and Targets Footer.
		Given user is already on Website Footer.
		Then Arrows and Targets Flat Designs Page.
		Then View All Flat Designs Page.
	
	@4_Themes
	Scenario: Themes Footer.
		Given user is already on Website Footer.
		Then Abstract Themes Page.
		Then View All Themes Page.
	
	@5_Icons
	Scenario: Icons Footer.
		Given user is already on Website Footer.
		Then Abstract Icons Page.
		Then View All Icons Page.
	
	

