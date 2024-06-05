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
Feature: Amazon Search

  Scenario: Search a produt
    Given I have a search filed in Amazon Page
    When I search for a product with name "Apple Macbook Pro" and price 1000
    Then Product with name "Apple Macbook Pro" should be displayed

  @smoke 
  Scenario: Search a produt MacBook Air
    Given I have a search filed in Amazon Page
    When I search for a product with name "Apple Macbook Air" and price 2000
    Then Product with name "Apple Macbook Pro" should be displayed
    Then order id is 12345 and username is "Shahul"

@smoke 
Scenario: Search a produt for iPhone
    Given I have a search filed in Amazon Page
    When I search for a product with name "iPhone" and price 800
    Then Product with name "iPhone" should be displayed
    Then order id is 9999 and username is "Shahul"
