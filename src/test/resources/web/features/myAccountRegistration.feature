@myAccountRegistration
Feature: My Account - Registration

  Background:
    Given the client is on page Automation
  @testCase1Registration
  Scenario Outline: My Account - Registration OK mail <emailAddress>
    When the client Clicks on My Account
    When the client enter <emailAddress> in its textbox
    When the client enter <password> in its textbox
    And the client Clicks on Register
    Then the client can view the message Hello <user>
    Examples:
      | emailAddress                  | password      | user               |
      | marcelolamas2495+50@gmail.com | P@ssw@rd2025! | marcelolamas249550 |


  Scenario Outline: My Account - Registration Fail for <fail>
    When the client Clicks on My Account
    When the client enter <emailAddress> in the box mail
    When the client enter <password> in the box password
    And the client Clicks on Register
    Then the client can view the message <message> in page
    @testCase2Registration
    Examples:
      | emailAddress | password      | fail         | message                                      |
      |              | P@ssw@rd2025! | Invalid Mail | Error: Please provide a valid email address. |
    @testCase4Registration
    Examples:
      | emailAddress                 | password | fail             | message                                  |
      | marcelolamas2495+51@gmail.com |          | Invalid Password | Error: Please enter an account password. |