Feature: Validating Syntax HRMS API's
Background:
Given user generates token

@APITEST @getStatus
Scenario: This test will check to see if an get employee status
Given user calls getEmployeeStatus API
When user retrieves getEmployeeStatus response
Then user get EmployeeStatus code is 200
Then user validates all employee status displayed