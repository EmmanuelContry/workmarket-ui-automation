Feature: UA Scenarios 
 
Scenario: A.1 Register Random user 
	Given I click register button 
	When I register a random user 
	And I click the accept term button 
	And I click in continous education 
	And I click in all courses 
	Then the welcome message correspond to the correct user 
	
Scenario: A.2 Verify Autologin Multi-sites 
	Given I click login button 
	And I login typing username "4657Duncan" and password "Pq4B3rBxNjvAa!" and clicking login button 
	When I click in continous education 
	And I click in all courses 
	And I click the product "CPT Guided Study Program" 
	And I click the add to car button 
	Then the welcome message correspond to the correct user "Duncan" 
	And the log out button exists 
	
Scenario: A.3 Verify Forgot Password for user with no security question 
	Given I click login button 
	And I click forgot password link 
	When I type "8814Kristeen" in user name field 
	And I click reset button 
	Then button security question is not displayed 
	
Scenario: A.4 Verify Forgot Password for incorrect user 
	Given I click login button 
	And I click forgot password link 
	When I type "IncorrectUser123" in user name field 
	And I click reset button 
	Then forgot password error message "User IncorrectUser123 cannot be found" will be displayed 
	
Scenario: A.5 Validate elements in log in page are displayed 
	Given I click my account button 
	Then the elements of log in page are displayed 
	
Scenario: A.6 Validate states in dropdown 
	Given I click register button 
	Then the dropdown has have all expected states