Feature: login to crm application

Scenario: verify the user is login to crm application

Given User is already on home page
When user enters username
Then user enters password 
Then click on signin
And user is on homepage