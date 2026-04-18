Feature: Samplee Test

  Background:
    Given Open Browser

  @Regression
  Scenario Outline: Sign up on Github
    Given I am on GitHub Website
    When Validate the Headers
    And Click the Header
    Then Go to Sign up page and input the <name> and <password>
    And validate "I am Sign Up page"

    Examples:
      | name  | password    |
      | scott | password123 |
      | byron | qwerty123   |
