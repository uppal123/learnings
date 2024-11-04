
@regression
Feature: Create new user account
  This feature file is used to ceate a new user account on Facebook

  @positive
  Scenario: Create new user account test
    Given I am on Facebook page
    And I click on "Create new account" button
    When I enter all necessary user details
    And I click on Sign Up button
    Then I will be successfully created an account on Facebook

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
