@GoogleSearch
Feature: As a potential client i need to search in google to find a web site

  @SearchOK @Regresion
  Scenario Outline: The client search by <word>
    Given The client is on google page
    When The client search for word <word>
    Then The client verify that results are shown properly
    @Example1 @Smoke
    Examples:
      | word            |
      | Crowdar Academy |
    @Example2
    Examples:
      | word    |
      | Calidad |
    @Example3
    Examples:
      | word     |
      | Software |
    @Example4
    Examples:
      | word    |
      | Testing |