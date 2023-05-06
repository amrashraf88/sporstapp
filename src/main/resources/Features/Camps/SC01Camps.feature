@Regression
Feature: Add Camps

  Scenario Outline: Add a new camp
    Given I am on the Camps page
    When I click on the Add New Camp button
    And I enter the Camp Name "<name>"
    And I enter the Camp Location "<location>"
    And I enter the Price Per Day "<price>"
    And I enter the Camp Description "<description>"
    And I enter the Camp Min Member "<min_member>"
    And I enter the Camp Max Member "<max_member>"
    And I select the Camp Level "<level>"
    And I select the Statues "<status>"
    And I select the Weapon "<weapon>"
    And I enter the Camp Start Date "<start_date>"
    And I enter the Camp End Date "<end_date>"
    And I select the Main Coach "<coach>"
    And I enter the Duration "<duration>"
    And I select the Calender Type "<calendar>"
    And I choose from Calender
    And I click on the Submit Camp button
    Then I should see the success message "<message>"

    Examples:
      | name         | location | price | weapon         | description                           | start_date  | end_date    | min_member | max_member | level    | status  | coach     | duration | calendar   | message                 |
      | Summer Camp | New York | 100   | Foil  | This is a fun summer camp for kids!  | 01-05-2023 | 10-06-2023 | 5          | 20         | Beginner | Active  | Vielka Levy  | 10       | Custom | Camp added successfully |
