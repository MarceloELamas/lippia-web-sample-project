@myAccount
Feature: My Account

  Background:
    Given the client is on page Automation

  @testCase7myAccount @tpFinal
  Scenario: View my account info
    When the client Clicks on My Account
    When the client enter marcelolamas2495+48@gmail.com in Login textbox
    When the client enter P@ssw@rd2025! in Login textbox
    And the client Clicks on Login
    When the client Clicks on My Account
    When the client Clicks on Account Details
    Then the client can view the message Password Change

    @testCase8myAccount @tpFinal @Smoke
    Scenario: Logout OK - My Account
      When the client Clicks on My Account
      When the client enter marcelolamas2495+48@gmail.com in Login textbox
      When the client enter P@ssw@rd2025! in Login textbox
      And the client Clicks on Login
      And the client Clicks on Logout
      Then the client can view the text LOGIN in page