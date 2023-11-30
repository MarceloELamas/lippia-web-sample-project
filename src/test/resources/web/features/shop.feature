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
      | filter             | category |
      | Sort by Popularity | Popular  |
    @testCase4Shop
    Examples:
      | filter                 | category       |
      | Sort by Average rating | Average rating |
    @testCase5Shop
    Examples:
      | filter          | category |
      | Sort by Newness | Newness  |

    @Smoke
  Scenario Outline: Shop-Product Purchase
    When the client Clicks on Shop
    When the client Clicks on ADDTOBASKET in product
    When the client Clicks on CART
    When the client Clicks on PROCED_TO_CHECKOUT
    When the client Complete all inputs with <firstName>, <lastName>, <email>, <phone>, <address>, <town>, <postalCode>
    When the client Clicks on Cash on Delibery
    When the client Clicks on Cash on Place order
    Then client can view her purchase details


    Examples:
      | firstName | lastName | email                  | phone      | address        | town  | postalCode |
      | marcelo   | lamas    | marcelolamas@gmail.com | 1115555666 | San Martin 165 | Salta | 4400       |



