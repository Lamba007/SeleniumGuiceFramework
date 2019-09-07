# new feature
# Tags: optional

Feature: Navigate on the homepage

  Scenario: I navigate through the Women tab1
    And My first stepdef 2
    Given I navigate to the path Women>Tops>T-shirts

  @smoke
  Scenario: I navigate through the Women tab2
    And Initialise for navigation
    Given I navigate on the website Women>Tops>T-shirts

  @smoke
  Scenario: I search for items
    And Initialise for navigation
    Given I search on website for an item

