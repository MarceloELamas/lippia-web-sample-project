@Login
Feature: My Account - Login

  Background:
    Given the client is on page Automation

  @testCase1Login
  Scenario: Login OK
    When the client Clicks on My Account
    When the client enter marcelolamas2495+48@gmail.com in Login textbox
    When the client enter P@ssw@rd2025! in Login textbox
    And the client Clicks on Login
    Then the client can view the message Hello marcelolamas249548


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

    @testCase7Login @tpFinal
    Examples:
      | emailAddress                  | password      | fail             | message                                                                                                          |
      | marcelolamas2495+48@gmail.com | p@SSw@RD2025! | Invalid Password | Error: The password you entered for the username marcelolamas2495+48@gmail.com is incorrect. Lost your password? |

  @testCase8 @LogOut
  Scenario: Logout OK
    When the client Clicks on My Account
    When the client enter marcelolamas2495+48@gmail.com in Login textbox
    When the client enter P@ssw@rd2025! in Login textbox
    And the client Clicks on Login
    And the client Clicks on Logout
    Then the client can view the text LOGIN in page