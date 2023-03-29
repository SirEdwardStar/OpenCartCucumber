Feature: Login valid credentials

@Sanity @Regression
	Scenario: Succesful login with valid credentials
	
	Given User launches browser
	And Opens URL "https://demo-opencart.com/index.php?route=common/home"
	
	When User navigates to MyAccount menu
	And Clicks on login
	And User enters Email as "testingk@gmail.com" and Password as "test@123"
	And Clicks on Login button
	
	Then User navigates to MyAccount Page
