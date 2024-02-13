Feature: nopCommerce Login Functionality Feature

Scenario: User able  Login Successfully

Given  User is on Login Page
When   User enters Username
And    User enters Password
And    User check Remember me button
And    User click on LOG IN button
Then   User navigate to dashboard 
And    close the browser