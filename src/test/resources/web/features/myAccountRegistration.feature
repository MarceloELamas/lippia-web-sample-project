@myAccountRegistration
Feature: My Account - Registration

  Background:
    Given the client is on page Automation

  Scenario Outline: My Account - Registration OK mail <emailAddress>
    When the client Clicks on My Account
    When the client enter <emailAddress> in its textbox
    When the client enter <password> in its textbox
    And the client Clicks on Register
    Then the client can view the message Hello <user>
    Examples:
      | emailAddress                  | password      | user               |
      | marcelolamas2495+48@gmail.com | P@ssw@rd2025! | marcelolamas249548 |


  Scenario Outline: My Account - Registration Fail for <fail>
    When the client Clicks on My Account
    When the client enter <emailAddress> in the box mail
    When the client enter <password> in the box password
    And the client Clicks on Register
    Then the client can view the message <message> in page

    Examples:
      | emailAddress | password      | fail       | message                                      |
      |              | P@ssw@rd2025! | Email null | Error: Please provide a valid email address. |
    Examples:
      | emailAddress                  | password | fail          | message                                  |
      | marcelolamas2495+49@gmail.com |          | Password null | Error: Please enter an account password. |