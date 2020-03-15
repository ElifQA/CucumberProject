
@sprint2 @addemployee
Feature: Add Employee

  Background: 
    Given I am logged into HRMS
    And I navigated to Add Employee Page

  @smoke 
  Scenario: Add new Employee
    When I add "John", "S" and "Smith"
    And I click Save
    Then I see Employee has been succesfully added

  @regression
  Scenario Outline: Add new Employee
    When I add "<FirstName>", "<MiddleName>" and "<LastName>"
    And I click Save
    Then I see Employee with "<FirstName>", "<MiddleName>" and "<LastName>" is displayed

    Examples: 
      | FirstName | MiddleName | LastName |
      | James     |            | Smith    |
      | Jane      | J          | Smith    |
      
  @regression
  Scenario: Add Employee without employee id
    When I add "Jemi", "M" and "White"
    And I delete employee id
    And I click Save
    Then I see employee without employee id is being added
	

  @inProgress
  Scenario: Add and Modify Employee Details
    When I enter employee details
      | FirstName | MiddleName | LastName |
      | Winter     | J          | Smith    |
    And I click Save
    Then I am able to modify Employee Details
      | DriverLisence | ExpirationDate | SSN         | SIN     | Gender | MaritalStatus | Nationality | DOB        |
      | N78787458     | 2021-12-08     | 123-45-6789 | 7687687 | Male   | Other         | Afghan      | 1980-10-10 |
      | Nhkjkgkhg458   | 2018-12-08     | yiy-45-6789 | uyiy    | Female | Married       | Burmese     | 1980-10-10 |
    
    #if dont have headers, we will store data table as a List<String>
    
   Scenario: Add Employee and validate database 
    When I add "James", "John" and "Smith"
    And I click Save
    And I see Employee has been succesfully added
    Then I collect employee data from database
    And I verfy employee data is matched
    
    