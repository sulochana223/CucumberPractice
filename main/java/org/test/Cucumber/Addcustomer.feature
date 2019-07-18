#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#AddCustomer

Feature: To test add customer functionality
Scenario: To test the generate customer ID functionality
    Given the user is in add customer page
    When the user fill in valid customer details
    |test|selenium|test@gmail.com|chennai|78676876|
    And the user clicks the submit button
    Then the user should see the custmer ID generated
   

  
