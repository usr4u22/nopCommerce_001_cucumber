Feature: nopCommerce Forgot Password Feature

Scenario: User able to Use Forgot Password 

Given  User already on Login Page
 When  User click on Forgot Password Link
And   User enters Email address to recover account
And   User click on RECOVER button
Then  User Landing on homepage
And   User Close the browser