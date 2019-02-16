Feature: Register

  @register
  Scenario: Register Random user
    Given I click register button
    When I register a random user 
    And I click the accept term button
    And I click in continous education
    And I click in all courses

