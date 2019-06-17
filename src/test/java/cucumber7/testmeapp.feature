
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Online shopping in TestMeApp
    Given I want to open chrome
    Given I want to enter url
    Given I want to click signIn link
    Given I want to enter username 
    And I want to enter password
    When I click on login button
    Then the Home page is displayed
    Given I want to enter productname
    Then I click on Find details button
     Then the search page is displayed
   Then I click on Add to cart button
   Given I want to cart1 link
   Then the view cart page is displayed
   Then I click on checkout button 
   Then the cart checkout page is displayed
    Then I click on proceed to pay button
    Then Payment gateway page is displayed
    Given I want to select bank option
    Then I click on continue
    Then I want to close the chrome
   