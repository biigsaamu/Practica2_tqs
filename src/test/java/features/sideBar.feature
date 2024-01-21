Feature: SideBar

  Scenario: Deals
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks deals option in the dropdown menu
    Then the user is redirected to the deals page

  Scenario: Cultural Bonus
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks cultural bonus option in the dropdown menu
    Then the user is redirected to the cultural bonus page

  Scenario: Stationery
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks stationery option in the dropdown menu
    Then the user is redirected to the stationery page

  Scenario: Toys
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks toys option in the dropdown menu
    Then the user is redirected to the toys page

  Scenario: Books
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks books option in the dropdown menu
    Then the user is redirected to the books page

  Scenario: Youth Books
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks youth books option in the dropdown menu
    Then the user is redirected to the youth books page

  Scenario: Child Books
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks child books option in the dropdown menu
    Then the user is redirected to the child books page

  Scenario: Comics
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks comics option in the dropdown menu
    Then the user is redirected to the comics page

  Scenario: Journals
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks journals option in the dropdown menu
    Then the user is redirected to the journals page

  Scenario: School Uniforms
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks school uniforms option in the dropdown menu
    Then the user is redirected to the school uniforms page

  Scenario: Costumes
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks costumes option in the dropdown menu
    Then the user is redirected to the costumes page

  #Scenario: Customer Support
    # Given the user is in the home page and accepts or not the cookies
      # When the user clicks the dropdown menu
        # And the user clicks customer support option in the dropdown menu
        # Then the user is redirected to the customer support page

  Scenario: FAQ
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks FAQ option in the dropdown menu
    Then the user is redirected to the FAQ page

  Scenario: Others
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks others option in the dropdown menu
    Then the user is redirected to the others page

  Scenario: Filter Others By Size
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks others option in the dropdown menu
    And the user clicks on the size filter
    And the user clicks on the size option
    Then the products of the size selected are displayed

  Scenario: Search School Books
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks school books option in the dropdown menu
    And the user introduces "Duran i Bas" on the search bar for school books
    And the user clicks on the search button for school books
    Then the user is redirected to the "Duran i Bas" page

  Scenario: Filter Technology By Price
    Given the user is in the home page and accepts or not the cookies
    When the user clicks the dropdown menu
    And the user clicks technology option in the dropdown menu
    And the user clicks on the price filter
    And the user scrolls the price filter bar to 986 euros
    Then the products of the price selected are displayed
