# new feature
# Tags: optional

Feature: Search an item

  @smoke
  Scenario: I search for items
    And Initialise search item
    Given I search on website for an item

  @smoke
  Scenario: Select a dress and assert result count
    Given Initialise search item
    And I search on website for an item
    And I assert the result count

