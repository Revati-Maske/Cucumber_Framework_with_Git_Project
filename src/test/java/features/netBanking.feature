Feature: Credit card application
@Regression
Scenario: Admin page default login
Given User is on net banking page
When User enter  username "admin" and password 123 and click on submit
Then Home page is displayed
And Cards are displayed

#Reusable
@Smoke
Scenario Outline: User page default login
Given User is on net banking page
When User enter  username "<Username>" and password "<Password>" and click on submit
Then Home page is displayed
And Cards are displayed

Examples:
|Username | Password |
|credit| 1234|
|debit|321|
|admin|544|

@Smoke
Scenario: User page default Sign up
Given User is on practice landing page
When User enters all details
|Rahul|
|Shetty|
|rs@gmail.com|
|237894792479|
Then Home page is displayed
And Cards are displayed