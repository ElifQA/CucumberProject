Feature: Report

  Background: 
    Given I am logged into HRMS
    And I navigated to the Reports Page

  Scenario: Search for invalid report
    When I enter invalid report
    And I click search button
    Then I see no record found message

  @smoke
  Scenario: Search for valid report
    When I enter valid "Employee" report
    And I click search button
    Then I see the search "Employee" is displayed
	
	@addreport
  Scenario Outline: 
    When I search "<Reportname>" report should match or give error message "<Message>"

    Examples: 
      | Reportname |  | Message          |
      | sql        |  | No Records Found |
      | Employee   |  |                  |
      | Api        |  | No Records Found |
