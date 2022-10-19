Feature: Check home page functionality
Background: User is Logged In
	Given user is on login page
When user enters username and password
And clicks on login button
Then user is navigated to home page
	
Scenario: Check logout link

Given user is logged in
When user clicks on welcome link
Then logout link is displayed


Scenario: verify quick launch tool bar is presemt

Given user is logged in
When user clicks on dashboard link
Then quick launch toolbar is displayed

