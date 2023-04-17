@Regression
Feature: Verify Invalidlogin Functionality

  Scenario Outline: User couldn't log in without valid  password
    When user enter Invalid user"<username>"
    And user enter Invalid password"<password>"
    And user Invalid click on login
    Then user cannot login
    Examples:

      | username        | password |

      | mohamed.osama_94@yahoo.com | Test@123 |

  Scenario Outline: User couldn't log in without valid email
    When user enter Invalid user"<username>"
    And user enter Invalid password"<password>"
    And user Invalid click on login
    Then user cannot login
    Examples:

      | username        | password |

      | rahul@gmail.com | 12345678 |

  Scenario Outline: User couldn't log in without valid email and password
    When user enter Invalid user"<username>"
    And user enter Invalid password"<password>"
    And user Invalid click on login
    Then user cannot login
    Examples:

      | username        | password |

      | rahul@gmail.com | rahul@gmail.com |