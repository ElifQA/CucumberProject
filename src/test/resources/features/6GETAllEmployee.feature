Feature: Validating Syntax /getallemployee.php HRMS API
Background:
Given user generates token
@SyntaxHRMSAPIEndToEndgetall
Scenario: This test will check to see if an getallEmployee 
Given user calls getAllEmployees API
When User retrieves response for getAllEmployees API
Then status code is 200 for getAllEmployeeAPI
Then user validates getAllEmployees exist