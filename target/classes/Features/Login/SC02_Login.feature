@Regression
Feature: Verify login Functionality

  Scenario Outline: User could log in with valid email and password
    When user enter valid email"<username>"
    And user enter valid password"<password>"
    And user click on login
    Then user could login successfully and redirected to home page
    Examples:
      | username        | password |

      | mohamed.osama_94@yahoo.com | 12345678 |
