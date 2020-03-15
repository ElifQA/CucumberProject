Feature: Validating Syntax /PutUpdateEmployee.php HRMS API
Background:
Given user generates token
@SyntaxHRMSAPIEndToEndupdate
Scenario: Retrieving created employee using/updateEmployee.php API
Given user calls for updateEmployee API
When User retrieves response for updateEmployee API
Then status code is 200 for updateEmployee API
Then user verifies employee name was updated
Then user validates employee updated
