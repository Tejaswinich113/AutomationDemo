@logintest
Feature: OrangeHrm Application Login Functionality Test

  @positivelogin
  Scenario: OrangeHRM application login page testing
    Given User lands on the OrangeHRM login page
    When User enters username as username
    And User enters password as password
    And User clicks on login button
    And Users wants to logout from application
    Then User wants to close the browser

  @multipletestdata
  Scenario Outline: OrangeHRM application login page testing with multiple sets of login data
    Given User lands on the OrangeHRM login page
    When User enters "<username>" as username
    And User enters "<password>" as password
    And User clicks on login button
    And Users wants to logout from application
    Then User wants to close the browser

    Examples: 
      | username | password |
      | Admin    | admin123 |
    
   @negativedata   
   Examples:
      |username  |password  |
      | Admin123 | admin123 |

  @negativelogin
  Scenario: OrangeHRM application login test functionality
    Given User lands on the OrangeHRM login page
    When User enters username as username
    And User enters password as password
    Then User clicks on login button
    But User unable to login
