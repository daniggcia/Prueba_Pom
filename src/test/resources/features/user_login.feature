Feature: User Login

  Scenario: User login
    Given the user open the browser
    And  the user is on the login page
    When the user enters valid credentials
    And the user clicks on the login button
    Then the user should be logged in successfully
    And the user close the browser