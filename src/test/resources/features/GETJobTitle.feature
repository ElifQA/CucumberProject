Feature: Validating Syntax HRMS API's
Background:
Given user generates token

@APITEST @jobs
Scenario: This test will check to see if an get all job Title
Given user calls getAllJobTitles API
When user retrieves getJobTitles response
Then user get alljobsTitle status code is 200
Then user validates allJobsTitles displayed