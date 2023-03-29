Feature: Login Data Driven

  Scenario Outline:  Login Data Driven 
    Given User launches browser
		And Opens URL "https://demo-opencart.com/index.php?route=common/home"
	
		When User navigates to MyAccount menu
		And Clicks on login
		And User enters Email as "<email>" and Password as "<password>"
		And Clicks on Login button
	
		Then User navigates to MyAccount Page

    Examples: 
      | email              | password       | 
      | testingk@gmail.com | test@123       | 
      | testing@gmail.com  | test@gmail.com | 
