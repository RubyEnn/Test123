@test
Feature: As a user, I should be able to load

  Scenario : Verify load with invalid credentials
    Given user on the homePage
    When user use username and password
    And user clicks the login button
    Then user should be at the dashboard page
