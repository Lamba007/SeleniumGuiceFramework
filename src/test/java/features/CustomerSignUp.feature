# new feature
# Tags: optional

Feature: Sign up on the application

  @e2e
  Scenario: I sign up on the website
    Given Initialise SignUp
    And I sign up on the page
    And I add information for Signup
