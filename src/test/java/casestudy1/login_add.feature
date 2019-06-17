
Feature: Add new product in TestMeApp
  Alex wants to login as an admin and add a HP Laptop product in TestMeApp

  
  Scenario: successfull Admin login
    Given Alex wants to open chrome
    Given he wants to enter url
    Given he wants to click SignIn link
    Given he wants to enter his username
    And he wants to enter his password
    When he clicks on login button 
    Then the Admin Home page is displayed
    
  
  Scenario: Add new product
    Then he clicks on Add new product 
    And he fill all the mandatory details
    Then he clicks on Add product button
    
 
  Scenario: successful payment of user
    Given Larry wants to enter his username
    And he wants to enter his password
    When he clicks on login button 
    Then he wants to enter productname
    Then he clicks on find details button
    Then he clicks on add to cart button
    Then he clicks cart1 link
    Then he clicks on checkout button
    Then he clicks on proceed to pay button
    Then he wants to select bank option
    Then he wants to enter his username
    Then he wants to enter his password
    Then he clicks on login button
    