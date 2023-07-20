@Regression
Feature: verify adding new member functionality

  Scenario: User could add new member successfully
    Given user login to Edit member to  dashboard
    Given user navigate to edit member
    When user Edit new member
    And user Edit marketing
    And user Edit name
    And user Edit membership
    And user Edit info
    And user Edit contact
    And user Edit his address
    And user Edit his Health
    And user Edit his activity
    And user Edit his payment
    Then user save data of Editmember