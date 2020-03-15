Feature: Validating Syntax HRMS API's
Background:
Given user generates token

@APITEST @getOneEmp
Scenario: This test will check to see if an get one employee
Given user calls getOneEmployee API
When user retrieves getOneEmployee response
Then user get oneEmployee code is 200
Then user validates getOneEmployee displayed


#This is the only homework Assignment
@APITEST
Scenario: Retrieving created Employee using /getOneEmployee.php API
Given user calls getOneEmployee API
When User retrieves response 
Then status code is 200
Then user validates created employee exists