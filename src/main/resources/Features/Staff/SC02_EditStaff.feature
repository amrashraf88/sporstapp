Feature: Edit Staff Page
  Scenario Outline: Add a new staff member
    Given I am on the Edit Staff page
    When I update the first name to "<firstName>"
    And I update the last name to "<lastName>"
#    And I update the Job Title to "<jobTitle>"
    And I update the Role to "<role>"
    And I update the date of birth to "<dob>"
    And I update the gender to "<gender>"
    And I update the SSN to "<ssn>"
    And I update the Education to "<education>"
    And I update the institution to "<institution>"
    And I update the phone number to "<phoneNumber>"
    And I update the email address to "<emailAddress>"
    And I update the preferred contact method to "<preferredContactMethod>"
    And I update the street address to "<StreetAddress>"
    And I update the state to "<state>"
    And I update the city to "<city>"
    And I update the zip code to "<ZipCode>"
    And I update the work hours for Monday
    And I update the coaches' health history to "<CoashHealh>"
    And I update the allergies to "<Allergies>"
    And I update the carried medications to "<Carriedmedications>"
    And I update the employment status to "<Employmentstatus>"
    And I update the payment method
    And I click on the Update Staff button
    Then I should see the success message "<expectedMessage>"

    Examples:
      | firstName | lastName | jobTitle | role  | dob        | gender | ssn         | education         | institution          | phoneNumber    | emailAddress          | preferredContactMethod | expectedMessage    |StreetAddress|state|city|ZipCode|CoashHealh|Allergies|Carriedmedications|Employmentstatus|
      | John      | Doe      | Coach | Manager | 01/01/1980 | Male       | 123456789| BA | University of Example | 1234567890  | johndoe@example.com    | Text                  | Staff member added successfully. |test   |  New York   |  New York  |   12345    |test|test|test|Active|
