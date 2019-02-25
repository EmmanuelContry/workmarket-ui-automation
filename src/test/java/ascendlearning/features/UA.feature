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
	
Scenario: A.7 Validate portal tabs and login error messages 
	Given I click my account button 
	And I login typing username "4657Duncan" and password "Pq4B3rBxNjvAa!" and clicking login button 
	When all tabs elements in elearning center page are displayed 
	And I click log off link 
	And the login page is displayed 
	And I login typing username "4657Duncan" and password "" and clicking login button 
	Then the login error message displayed is "Incorrect username or password." 
	And I login typing username "" and password "Pq4B3rBxNjvAa!" and clicking login button 
	Then the login error message displayed is "Incorrect username or password." 
	And I login typing username "abcdf" and password "Pq4B3rBxNjvAa!" and clicking login button 
	Then the login error message displayed is "Invalid username or password." 
	And I login typing username "12345" and password "Pq4B3rBxNjvAa!" and clicking login button 
	Then the login error message displayed is "Invalid username or password." 
	And I login typing username "12345" and password "Pq4B3rBxNjvAa!" and clicking login button 
	Then the login error message displayed is "Invalid username or password." 
	And I login typing username "4657Duncan" and password "incorrectpassword" and clicking login button 
	Then the login error message displayed is "Invalid password." 
	And I login typing username "" and password "" and clicking login button 
	Then the login error message displayed is "Incorrect username or password." 
	
Scenario: A.8 Verify wrong billing and shipping address error message 
	Given I click login button 
	And I login typing username "4657Duncan" and password "Pq4B3rBxNjvAa!" and clicking login button 
	When I click in continous education 
	And I click in all courses 
	And I click the product "CPT All-Inclusive Program" 
	And I click the add to car button 
	And the shopping cart page is displayed 
	And product "CPT All-Inclusive Program" is present in cart 
	Given I navigate to home page 
	When I click in continous education 
	And I click in all courses 
	And I click the product "CPT Guided Study Program" 
	And I click the add to car button 
	And the shopping cart page is displayed 
	And product "CPT Guided Study Program" is present in cart 
	And click checkout button 
	And I click address continue button 
	And I uncheck shipping add same as shipping address checkbox 
	Then the address error message is "please enter valid billing address" 

Scenario: A.9 Verify Mandatory fields in billing address of customerInfoPage 
	Given I click login button 
	And I login typing username "4657Duncan" and password "Pq4B3rBxNjvAa!" and clicking login button 
	When I click in continous education 
	And I click in all courses 
	And I click the product "CPT All-Inclusive Program" 
	And I click the add to car button 
	And the shopping cart page is displayed 
	And product "CPT Guided Study Program" is present in cart 
	And click checkout button 
	And fill with "" billing first name field 
	Then the required of billing first name message is "First name is required." 
	And fill with "" billing last name field 
	Then the required of billing last name message is "Last name is required." 
	And fill with "" billing email field 
	Then the required of billing email message is "Email is required." 
	And fill with "" billing address field 
	Then the required of billing address message is "Billing Address is required." 
	And fill with "" billing city address field 
	Then the required of billing city address message is "City is required." 
	And fill with "" zip code field 
	Then the required of billing zip code message is "Zip is required." 
	And fill with "Duncan" billing first name field
	And fill with "Orn" billing last name field 
	And fill with "kary.beer@hotmail.com" billing email field
	And fill with "8302 Lincoln Ln" billing address field 
	And fill with "McLean" billing city address field
	And fill with "22102" zip code field
	And I click address continue button
	Then check out page is displayed
	And shipping options is displayed

Scenario: A.10 Verify User suspended message 
	Given I click my account button  
	When I login typing username "paloips3@mailinator.com" and password "password1" and clicking login button
	Then suspended message is displayed
    When I click courses tab
    Then suspended message "Your program access has been suspended because we were unable to process your scheduled payment. To update your credit card information, please contact us at 1-800-460-6276." displayed
    Given I click my account button
    And I click account tab
    Then suspended message "Your program access has been suspended because we were unable to process your scheduled payment. To update your credit card information, please contact us at 1-800-460-6276." displayed
 	Given I click my account button
 	And I click enrollmentkey tab
 	Then suspended message "Your program access has been suspended because we were unable to process your scheduled payment. To update your credit card information, please contact us at 1-800-460-6276." displayed

Scenario: A.11 Verify Suspended User and UserDetails
	Given I click my account button  
	When I login typing username "paloips3@mailinator.com" and password "password1" and clicking login button
	Then suspended message is displayed
    Given I click my account button
    And I click account tab
    Then suspended checkbox is selected
    Given I click on change button
    When I fill billing street address 2 with random number
    And I fill billing address country with random letters
    And I click register button in edit page
    And I click on change button
    Then the street address 2 has the random numbers
    And the address country has the random letters
    And I click cancel button
    And I click history tab left side
    Then the history page is displayed
    Then the history data is displayed
    And I click certificates tab left side
    Then the page title is "My Certificates"
    And the certificate "International Certified Personal Trainer" is displayed

@123
Scenario: A.12 Verify Suspended User and UserDetails
	Given I click my account button  
	And the login page is displayed 
	And I login typing username "4657Duncan" and password "Pq4B3rBxNjvAa!" and clicking login button 
	Given I click my account button
	Then the page title is "eLearning Center"
	And I click account tab
	Then the page header is "ACCOUNT DETAILS"
	And the change button displayed
	And I click on change button
	Then the page title is "NASMCentral Login"
	And last name field is read only
	And first name field is read only