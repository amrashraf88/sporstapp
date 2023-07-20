@Regression
Feature: verify adding new Promo functionality

  Scenario: User could add new Promo successfully
    Given I am on the promo code page for edit
    When I click on the add edit promo code button
    And I change the promo code details
    And I submit the changed of promo code
    Then I should see the promo code edited successfully