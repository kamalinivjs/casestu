

Feature: data driven in testmeapp
  I want to pass the products name in data table and them to testmeapp

  
  Scenario:add product
    Given I want to login
    Given I want to select Category name "Electronics"
    Given I want to select subcategory name "Head Phone"
   
      | productname| price | Quantity |brand|
      | Basketball |  200  | 10       |abc  |
      | Volleyball |  300  | 20       |xyz  |
    Given I want to enter description "HeadPhone suitable for office" 
    Then I click on add product