@automation2
Feature: SignIn Page

  Scenario: Sign in automation
    Given The user is on the main page of BBC.
    When The user click to sign in.
    Then The user should be able write user name.
    And The user should be able to write password.
    And The user should be able to click sign in button.

