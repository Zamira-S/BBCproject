@automation1
Feature: Home Page

  Scenario: Comment verify automation
    Given The user is on the main page of BBC.
    When The user should click a Top News Headline.
    Then The user checks if the comments can be viewed for the "article".
    And The user should be able to click News article.
    And The user verifies if the commenting is enabled.

