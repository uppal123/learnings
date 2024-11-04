@login @regression
Feature: Login feature
  This feature file is used to test Login feature

  #@positive
  #Scenario: Valid Username and password test
    #Given I am on Login page
    #When I enter "abc@gmail.com" and "Test@123"
    #Then I should be successfully logged in
   
   @positive
  Scenario: Login Test
    Given I am on Login page
    When I enter "abc@gmail.com" and "Test@123"
    And I click on Log in button
    Then I should be successfully logged in 
    

  #@negative
  #Scenario Outline: Negative login scenario testing
    #Given I am on Login page
    #When I enter "<username>" and "<password>"
    #Then I should get login error message
#
    #Examples: 
      #| username              | password         |
      #| abc@gmail.com         | invalid-test1234 |
      #| invalid-abc@gmail.com | test1234         |
      #| invalid-abc@gmail.com | invalid-test1234 |
      #|                       | test1234         |
      #| abc@gmail.com         |                  |
      #|                       |                  |
      

  #@positive
  #Scenario: Forgot password scenario
    #Given I am on Login page
    #When I click on forgotton password button
    #Then I should be moved to find your account page
