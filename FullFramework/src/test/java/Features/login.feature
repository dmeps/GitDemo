Feature: App Login

Scenario Outline: Positive Test - Login Validation # "Outline" is added for parameterization
Given Launch Chrome
And Navigate to the "https://rahulshettyacademy.com/" site
And Click the Login link on Homepage to land on Sign In page
When Enter <username> and <password> and log in
Then Verify successful login
And Close browser

Examples:
#separate parameters with | and tab
|username			|password	|
|dmepst@gmail.com	|qamusik111	|
|dmitry@epstein.to	|musik111	|
