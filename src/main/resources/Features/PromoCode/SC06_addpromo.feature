@Regression
Feature: verify adding new Promo functionality

  Scenario: User could add new Promo successfully
    Given I am on the promo code page
    When I click on the add new promo code button
    And I enter the promo code details
    And I submit the promo code
    Then I should see the promo code added successfully