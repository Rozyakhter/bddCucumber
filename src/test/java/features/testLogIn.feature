@test
Feature: I want to log in to Orange HRM

  @tag1
  Scenario: Login with valid creds
    Given The user is on the logIn page
    And user maximize the window
    And provides valid userID
    And provides valid password
    And clicks on LogIn button
    Then user closes the browser
