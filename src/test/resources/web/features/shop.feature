@Shop
Feature: SHOP

  Background:
    Given the client is on page Automation


  @testCase2Shop
  Scenario: Shop-Product Categories Funcionality
    When the client Clicks on Shop
    And the client does Click on Android from PRODUCT CATEGORIES
    Then the client can view books only from categories Android

  Scenario Outline: Shop-Default Sorting Funcionality - <filter>
    When the client Clicks on Shop
    When the client Clicks on <filter> item in Default sorting dropdown
    Then the client can view books the <category> products only
    @testCase3Shop
    Examples:
      | filter | category |
      | Sort by Popularity | Popular |
    @testCase4Shop
    Examples:
      | filter | category |
      | Sort by Average rating | Average rating |
    @testCase5Shop
    Examples:
      | filter          | category |
      | Sort by Newness | Newness  |


