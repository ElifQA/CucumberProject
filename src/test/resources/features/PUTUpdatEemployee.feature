
Feature: Validating Syntax HRMS API's
Background:
Given user generates token

@APITEST @UPDATEEMP
Scenario: This test will check to see if an Employee is ubdated
Given user calls ubdate Employee API
When user retrieves ubdate response
Then user get status code 200
Then user validates employee is ubdated