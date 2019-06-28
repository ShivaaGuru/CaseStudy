
Feature: Data Table

  Scenario Outline: Title of your scenario outline
    Given User enters into the TestMeApp LoginPage
    Then Login page is displayed
    And User enters username "<username>"
    And User enter the password "<password>"
    When User click the login button
    Then User logged in and Home page is displayed
    
    Examples: 
      | username  | password    |
      | Lalitha   | password123 | 
