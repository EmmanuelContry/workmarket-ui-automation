Feature: Register

  @register
  Scenario: Register Random user
    Given I click register button
    When I register a random user 
    Then accept term button is visible

