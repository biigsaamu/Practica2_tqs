Feature: ShoppingCart
  Scenario: Add product to shopping cart
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the product is added to the shopping cart
    Then the shopping cart displays the product added

  Scenario: Modify quantity of product
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the product is added to the shopping cart
    #And the user clicks on the shopping cart menu
    And the user hovers over the shopping cart button
    And the user clicks on the shopping cart
    And the user changes the quantity of the product
    Then the shopping cart displays the correct information

  Scenario: Remove product
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the product is added to the shopping cart
    And the user clicks on the shopping cart menu
    And the user clicks on the shopping cart
    And the user removes the product from the shopping cart
    Then the shopping cart is empty

