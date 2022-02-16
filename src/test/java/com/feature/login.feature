@Login_test
Feature: verify login functionality

Scenario: login test
      Given user navigate to facebook page
      When user entered valid username 
      And user entered valid password
      Then click on login page
      
   Scenario Outline: admin test
      Given user navigate to facebook page
      When user entered  username  "<username>"
      And user entered  password  "<password>" 
      Then click on login page
      Examples:
      |username|password|  
      |abc|abc123|
      |sushil|sushil123|