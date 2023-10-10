@Shop
Feature: SHOP

  Background:
    Given the client is on page Automation

  @testCase1
  Scenario: Shop-Filter By Price Funcionality
    When the client Clicks on "Shop"
    When the client adjust the filter by price between 150 to 450 rps
    And the client Clicks on "Filter"
    Then the client can view books only between 150 to 450 rps price

  @testCase2 @Smoke
  Scenario: Shop-Product Categories Funcionality
    When the client Clicks on Shop
    And the client does Click on Android from PRODUCT CATEGORIES
    Then the client can view books only from categories Android

  Scenario Outline: Shop-Default Sorting Funcionality - <filter>
    When the client Clicks on Shop
    When the client Clicks on <filter> item in Default sorting dropdown
    Then the client can view books the <category> products only
    @testCase3
    Examples:
      | filter | category |
      | Sort by Popularity | Popular |
    @testCase4
    Examples:
      | filter | category |
      | Sort by Average rating | Average rating |
    @testCase5
    Examples:
      | filter | category |
      | Sort by Newness | Newness |
    @testCase6
    Examples:
      | filter | category |
      | Sort by price:low to high | price low to high |
    @testCase7
    Examples:
      | filter | category |
      | Sort by price:high to low | price high to low |

  @testCase8
  Scenario: Shop-Read More Funcionality
    When the client Clicks on "Shop"
    When the client Clicks on "Read more" in home page
    Then client cannot add the product which has read more option as it was out of stock.

  @tescCase9
  Scenario: Shop-Sale Funcionality
    When the client Clicks on "Shop"
    When the client Clicks on "Sale" in home page
    Then the client can clearly view the actual price with old price striken for the sale written products

  @testCase10
  Scenario Outline: Shop-Add to Basket-View Basket Funcionality
    When the client Clicks on "Shop"
    When the client Clicks on "ADD TO BASKET" in the book "HTML Forms"
    When the client Clicks on "Shopping Cart"
    When the client Clicks on "PROCEED TO CHECKOUT"
    When the client fill First Name <name>, Last Name <lname>, Email Address <email>, Phone <phone>, Address <address>, Town/City <city>, Postcode / Zip <pcode> his details in "Billing details" form
    And the client Clicks on "PLACE ORDER"
    Then the client view the message "Thank you. Your order has been received" in the confirmation page
    Examples:
      | name      | lname   | email              | phone     | address             | city  | pcode |
      | Guillermo | Sanchez | gsanchez@gmail.com | 112533558 | Av. San Martin 1650 | India | 4505  |

  @testCase11
  Scenario: Shop-Add to Basket-View Basket-Tax Funcionality
    When the client Clicks on "Shop"
    When the client Clicks on "ADD TO BASKET" in the book "HTML Forms"
    And the client Clicks on "Shopping Cart"
    Then the price "Total" is the "Subtotal" + its 2%