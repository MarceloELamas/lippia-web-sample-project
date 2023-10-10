@Login
Feature: My Account - Login

  Background:
    Given the client is on page Automation
  @testCase1Login
  Scenario Outline: Login OK mail <emailAddress>
    When the client Clicks on My Account
    When the client enter <emailAddress> in Login textbox
    When the client enter <password> in Login textbox
    And the client Clicks on Login
    Then the client can view the message Hello <user>

    Examples:
      | emailAddress                  | password      | user               |
      | marcelolamas2495+48@gmail.com | P@ssw@rd2025! | marcelolamas249548 |


  Scenario Outline: Login Fail for <fail>
    When the client Clicks on My Account
    When the client enter <emailAddress> in Login box mail
    When the client enter <password> in Login box password
    And the client Clicks on Login
    Then the client can view the message <message> in Login Page
    @testCase4Login
    Examples:
      | emailAddress     | password      | fail         | message                                                   |
      | lalala@gmail.com | P@ssw@rd2025! | Invalid Mail | Error: A user could not be found with this email address. |
    @testCase3Login
    Examples:
      | emailAddress                  | password | fail             | message                                                                                                          |
      | marcelolamas2495+48@gmail.com | lalala   | Invalid Password | Error: The password you entered for the username marcelolamas2495+48@gmail.com is incorrect. Lost your password? |