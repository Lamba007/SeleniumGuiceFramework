# new feature
# Tags: optional

Feature: Navigate on the homepage

  @smoke
  Scenario: I navigate through the Women tab
    Given Initialise for navigation2
    Given I navigate path Women>Tops>T-shirts
    When I test something