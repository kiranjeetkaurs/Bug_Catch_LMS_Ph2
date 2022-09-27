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
@tag
Feature: Delete Multiple Batches

Background:
Given User is logged on to LMS website
And User is on Batch page

  @tag1
  Scenario: Validate Delete Multiple Batches
    When User clicks on two records
    And User clicks on "Yes" button.
    Then User verifies that "Batches Deleted" message is displayed.
    
  @tag1
  Scenario: Validate Delete Multiple Batches
    When User clicks on two records
    And User clicks on "No" button.
    Then User verifies that no "no message" message is displayed.

