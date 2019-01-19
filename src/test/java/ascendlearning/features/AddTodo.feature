Feature: Add todo
  As a user
  I want to be able to add a todo to my list

  @add-todo
  Scenario: Add todo
    Given I am on the todo list
    When I add a todo called "Item 1"
    Then I see a todo called "Item 1"

