Feature: Books

  Scenario: Fiction books
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the user selects fiction option
    Then the fiction page is displayed

  Scenario: Non-Fiction books
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the user selects non-fiction option
    Then the non-fiction page is displayed

  Scenario: Books for youth people
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the user selects youth option
    Then the youth page is displayed

  Scenario: Books for children
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the user selects children option
    Then the children page is displayed

  Scenario: Comics and mangas
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the user selects comics and manga option
    Then the comics and manga page is displayed

  Scenario: Textbooks
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the user selects textbooks option
    Then the textbooks page is displayed

  Scenario: Literature books
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the user hovers the mouse over fiction category
    And the user clicks the literature option
    Then the literature page is displayed

  Scenario: IT books
    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the user hovers the mouse over non-fiction category
    And the user clicks the IT option
    Then the IT page is displayed
    