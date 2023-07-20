@Regression
Feature: Add Private Lesson

  Scenario: Add a new private lesson
    Given I am on the private lesson page
    When I add a new private lesson
    Then the new private lesson should be added successfully
