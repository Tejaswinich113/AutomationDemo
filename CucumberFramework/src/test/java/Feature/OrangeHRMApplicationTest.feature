@applicationtest
Feature: Orange HRM application functionality testing

  Background: 
    Given User lands on the OrangeHRM login page
    When User enters username as username
    And User enters password as password
    And User clicks on login button

  @adminpage
  Scenario: OrangeHRM Admin Page Test
    And User clicks on Admin Tab and verify user on Admin page
    And Users wants to logout from application
    Then User wants to close the browser

  @leavepage
  Scenario: OrangeHRM Leave Page Test
    And User clicks on Leave Tab and verify user on Leave page
    And Users wants to logout from application
    Then User wants to close the browser

  @claimpage
  Scenario: OrangeHRM Claim Page Test
    And User clicks on Claim Tab and verify user on Claim page
    And Users wants to logout from application
    Then User wants to close the browser
