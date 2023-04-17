@Regression
Feature: verify reset password functionality

  Scenario Outline: User could reset his/her password successfully
    Given user opened login page
    And user click on reset password
    And user enter his email"<email>"

    And user click recover
    Then user should receive a link to reset password
    Examples:
      | email                      |
      | mohamed.osama_94@yahoo.com |