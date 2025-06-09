
Feature: Login feature

  Scenario: Verify login is successful with valid login credentials
    Given Login page is displayed
    When enter valid username and password
    When enter login button
    When Product page is displayed
