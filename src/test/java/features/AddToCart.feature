# new feature
# Tags: optional

Feature: Add Items to cart

  Scenario: Select a dress and add to the cart
    Given Initialise for navigation2
    And I search on website for dress
    And I assert the result count


