Feature: Language

  Scenario: Catalan language

    Given the user is in the home page and accepts or not the cookies
    Then the web language is catalan

  Scenario: Spanish language

    And the user selects the spanish language feature
    Then the web language is spanish