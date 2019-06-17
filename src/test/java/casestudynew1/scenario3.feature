

Feature: Add new product in TestMeApp
I want to add a new product in TestMeApp

  
  Scenario: Add product
    Given I want to login
    Given I want to select Category name "Electronics"
    Given I want to select subcategory name "Head Phone"
    Then I want to enter productname "Jabra 11"
    Then I want to enter price "$300"
    Then I want to enter Quantity "10"
    Then I want to enter brand "Jabra"
    Then I want to enter description "HeadPhone suitable for office" 