@Regression
Feature: Add Staff Page
  Scenario Outline: Add a new staff member
    Given I am on the Add Staff page
    When I enter the first name "<firstName>"
    And I enter the last name "<lastName>"
    And I select the Job Title "<jobTitle>"
    And I select the Role "<role>"
    And I enter the date of birth "<dob>"
    And I select the gender "<gender>"
    And I enter the SSN "<ssn>"
    And I select the Education "<education>"
    And I enter the institution "<institution>"
    And I enter the phone number "<phoneNumber>"
    And I enter the email address "<emailAddress>"
    And I select the preferred contact method "<preferredContactMethod>"
    And I click on the Add Staff button
    Then I should see the success message "<expectedMessage>"

    Examples:
      | firstName | lastName | jobTitle | role  | dob        | gender | ssn         | education         | institution          | phoneNumber    | emailAddress          | preferredContactMethod | expectedMessage            |
      | John      | Doe      | Coach | Manager | 01/01/1980 | Male       | 123456789| BA | University of Example | 1234567890  | johndoe@example.com    | Text                  | Staff member added successfully. |
