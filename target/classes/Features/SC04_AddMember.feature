@Regression
Feature: verify adding new member functionality

  Scenario: User could add new member successfully
    Given user login to dashboard
    Given user navigate to member page
    When user add new member
    And user choose marketing
    And user entering name
    And user adding membership
    And user addning info
    And user add contact
