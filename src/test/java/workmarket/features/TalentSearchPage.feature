Feature: Talent Search Page Work Market

@123
Scenario: All restult items from search contain string
	Given I navigate to Login page
	When I fill "qa+candidatetest@workmarket.com" in email field  
	And I fill "candidate123" in password field
	And I click login button
	And I click search talent link
	And I fill search field with "test"
	Then All items displayed contain string "test"
