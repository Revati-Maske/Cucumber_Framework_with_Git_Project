Feature: Credit card application

Background:
When launch the browser from config variables
And hit the home page url of banking site

@Smoke @NetBanking @Regression
Scenario: Admin page default login
Given User is on net banking page
When User enter  username "admin" and password 123 and click on submit
Then Home page is displayed
And Cards are displayed

#Reusable
@Smoke @Regression @Mortgage
Scenario Outline: User page default login
Given User is on Mortgage banking page
When User enter  username "<Username>" and password "<Password>" and click on submit
Then Home page is displayed
And Cards are displayed

Examples:
|Username | Password |
|credit| 1234|
|debit|321|
|admin|544|

