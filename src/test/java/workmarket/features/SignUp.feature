Feature: SignUp Page Work Market

Scenario: All required fields successful register
	Given I navigate to signup page
	And I click join as individual button  
	And I type random first name in field
	And I type random last name in field
	And I type random email in field
	And I type "Memetril01*" in password field
	And I check the consent checkbox
	And I click register button
	Then Register button is enabled
	And Header of success register is displayed
	
Scenario: Not first name required
	Given I navigate to signup page
	And I click join as individual button 
	When I type "" in first name field 
	And I type "Contreras" in last name field 
	And I type "emmanuel@hotmail.com" in email field 
	And I type "Memetril01*" in password field
	And I check the consent checkbox
	Then Register button is disabled

Scenario: Not correct password
	Given I navigate to signup page
	And I click join as individual button 
	When I type "Emmanuel" in first name field 
	And I type "Contreras" in last name field 
	And I type "emmanuel@hotmail.com" in email field 
	And I type "Memet*" in password field
	And I check the consent checkbox
	Then Register button is disabled

Scenario: Not first consent checked
	Given I navigate to signup page
	And I click join as individual button 
	When I type "Emmanuel" in first name field 
	And I type "Contreras" in last name field 
	And I type "emmanuel@hotmail.com" in email field 
	And I type "Memetril01*" in password field
	Then Register button is disabled
	
Scenario: Required/incorrect first name alert message 
	Given I navigate to signup page
	And I click join as individual button 
	When I type "123" in first name field 
	And I type "" in first name field
	And I type "emmanuel" in last name field
	Then The alert message for first name field is "Please enter a valid first name"

Scenario: Required/incorrect last name alert message 
	Given I navigate to signup page
	And I click join as individual button 
	When I type "123" in last name field 
	And I type "" in last name field
	And I type "emma" in first name field 
	Then The alert message for last name field is "Please enter a valid last name"

Scenario: Required/incorrect email alert message
	Given I navigate to signup page
	And I click join as individual button 
	When I type "emmanuel" in email field
	And I type "Contreras" in last name field 
	Then The alert message for email field is "Please enter a valid email"

Scenario: Required/incorrect password alert message
	Given I navigate to signup page
	And I click join as individual button 
	When I type "Memetr" in password field
	And I type "Contreras" in last name field 
	Then The alert message for password field is "Please enter a valid password"

Scenario: Validate elements in login page
	Given I navigate to signup page
	When I click join as individual button 
	Then The Register Button value is "Register" 
	And The First Name value is "First Name" 
	And The Last Name value is "Last Name" 
	And The page header is "Sign Up for Work Market"
	And The email value is "Email"
	And The password value is "Password"
	And The password condition message is "Min 8 characters, at least 1 number"