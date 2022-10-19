Feature: feature to test logIn functionality

@smoketest
Scenario: Check login is successful with valid crdentials

Given user is on login page
When user enters username and password
And clicks on login button
Then user is navigated to home page

