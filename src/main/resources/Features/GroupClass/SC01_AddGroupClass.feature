@Regression
Feature: Add Group Class

  Scenario: Add a new group class
    Given I am on the group class page
    When I add group class name
    When I add Members’ price per class
    When I add Non members’ price per class
    When I select a weapon
    When I add Min Number of Member
    When I add Max Number of Member
    When I add location
    When I select level
    When I select status
    When I add description
    When I select start date
    When I select end date
    When I select main coach
    When I select calender type
    Then click submit and the group class is added
