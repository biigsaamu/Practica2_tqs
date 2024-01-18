Feature: Toys

  Scenario: Table games
    Given the user is in the home page and accepts or not the cookies
    And the user clicks toys option
    And the user selects table games option
    Then the table games page is displayed

  Scenario: Symbolic games
    Given the user is in the home page and accepts or not the cookies
    And the user clicks toys option
    And the user selects symbolic games option
    Then the symbolic games page is displayed

  Scenario: Video games
    Given the user is in the home page and accepts or not the cookies
    And the user clicks toys option
    And the user selects video games option
    Then the video games page is displayed

  Scenario: Ages
    Given the user is in the home page and accepts or not the cookies
    And the user clicks toys option
    And the user selects ages option
    Then the toys by ages page is displayed

  Scenario: Brands
    Given the user is in the home page and accepts or not the cookies
    And the user clicks toys option
    And the user selects brands option
    Then the most searched brands page is displayed

  Scenario: Classic games
    Given the user is in the home page and accepts or not the cookies
    And the user clicks toys option
    And the user hovers the mouse over table games category
    And the user clicks the classic games option
    Then the classic games page is displayed

  Scenario: pair games
    Given the user is in the home page and accepts or not the cookies
    And the user clicks toys option
    And the user hovers the mouse over table games category
    And the user clicks the pair games option
    Then the pair games page is displayed

  Scenario: Filter toys by price 9-10€

    Given the user is in the home page and accepts or not the cookies
    And the user clicks toys option
    And the user selects the age range
    And the user clicks the price dropdown menu
    And the user scrolls the price filter bar to ten euros
    Then the web loads toys between nine and ten euros

  Scenario: Filter toys by price 9-15€

    And the user scrolls the price filter bar to fifteen euros
    Then the web loads toys between nine and fifteen euros


