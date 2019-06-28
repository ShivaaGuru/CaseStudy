
Feature:TestMeApp Registration

  Scenario: Reg
    Given User enters into TestMeApp Homepage
    When User clicks the signUp link
    Then The Registration page will open
    And User enters the new UserName "shivaaguru"
    And User enters the FirstName "Shivaa"
    And User enters the LastName "Guru"
    And User enters the new password "shivaa123"
    And User enter the new password for confirmation "shivaa123"
    And click the Gender option "Male"
    And User enters the Email address "shivaaguru@gmail.com"
    And User enters the Mobile Number "9876543210"
    And User select the Date Of Birth "07/02/1996"
    And User types the Address "Kumbakonam"
    And User select the security question 
    And User enters answer for security question "blue"
    When User clicks the Registration button
    Then Registration will be succesfull