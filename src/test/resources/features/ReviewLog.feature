Feature: HRMS Login
  
  Description: The purpose of this feature file is to automate HRMS login to make sure
  						that everything works as epected.

  Scenario: HRMS valid login
    Given user is already on Login page
    When user enters valid username as "Admin" and password as "Syntax@123"
    And user click on login button
    Then user sees that dashboard is displayed

  Scenario Outline: Invalid Login
    Given user is already on Login page
    When I enter invalid username as "<username>" and invalid password as "<password>"
    And I click on login button
    Then I see error message 
    And I close browser

    Examples: 
      | username |  | password   |
      | Admin    |  | Syntax@123 |
      | nhgkg|||
