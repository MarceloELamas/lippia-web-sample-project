@myAccountRegistration
Feature: My Account - Registration

  Background:
    Given the client is on page Automation

  Scenario Outline: My Account - Registration OK mail <emailAddress>
    When the client Clicks on My Account
    When the client enter <emailAddress> in its textbox
    When the client enter <password> in its textbox
    And the client Clicks on Register
    Then the client can view the message Hello <user> in page
    @Smoke
    Examples:
      | emailAddress                  | password      | user               |
      | marcelolamas2495+24@gmail.com | P@ssw@rd2025! | marcelolamas249523 |