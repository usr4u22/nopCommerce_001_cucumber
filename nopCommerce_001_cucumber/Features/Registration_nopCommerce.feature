Feature: nopCommerce Demo Registration Page feature
Scenario: New User Registration successfully

Given User already on Home Page

When  User click on HomePage Register Button
When  Title of Registration Page should be Matched 
And   User Choose Gender
And   User enters First Name
And   User enters Last Name
And   User select Date of Birth
And   User enters Email
And   User Enters Company names
And   User Uncheck the Newsletter
And   User enters password
And   User enters confirm password
When  User click on Register button
And   User close the browser