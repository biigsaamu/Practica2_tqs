Feature: Product details

  Scenario: "La cuenta atrás para el verano" book details

    Given the user is in the home page and accepts or not the cookies
    When the user clicks books option
    And the user hovers the mouse over fiction category
    And the user clicks the literature option
    And the user selects La cuenta atras para el verano book
    Then "La cuenta atrás para el verano" information is displayed

  Scenario: UNO card game details

    Given the user is in the home page and accepts or not the cookies
    And the user clicks toys option
    And the user hovers the mouse over table games category
    And the user clicks the classic games option
    And the user selects UNO game
    Then "UNO Basic" information is displayed

  Scenario: White glue bar details

    Given the user is in the home page and accepts or not the cookies
    And the user clicks stationery option
    And the user hovers the mouse over crafts category
    And the user clicks white glue option
    And the user selects the withe glue
    Then "Cola Blanca Instant 100ml" information is displayed

  Scenario: Atomic Habits book details

    Given the user is in the home page and accepts or not the cookies
    When the user enters "Hábitos atómicos" in the search bar
    And the user clicks enter in search bar
    And the user selects the Atomic Habits book
    Then "Hábitos atómicos" information is displayed

  Scenario: Search Sapiens book details

    Given the user is in the home page and accepts or not the cookies
    When the user enters "Sapiens libro" in the search bar
    And the user clicks enter in search bar
    And the user selects the Sapiens book
    Then "Sàpiens" information is displayed


