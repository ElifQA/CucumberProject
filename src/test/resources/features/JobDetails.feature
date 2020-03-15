
@Sprint
Feature: employee's job details
  I want to use this template for my feature file
	
	Background: 
    Given I am logged into HRMS
    When Clicking on PIM at dashboard
    Then Clicking on EmployeeList
  
  @tag1
  Scenario: Add Job Details
    When I enter employee id
    And I click search button on job Details
    Then I click employee name
    When I click on Job button
    And I click Edit button on Job Details
    Then I am able to add Job Details

  
