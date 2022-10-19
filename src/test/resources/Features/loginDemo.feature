Feature: Test login functionality

Scenario Outline: Check login is successful with valid crdentials

Given Browser is open
And user is on login page 
When user enters <username> and <password>
And clicks on login button
Then user is navigated to home page

Examples:
| username | |password|
|shwetha| |12345|