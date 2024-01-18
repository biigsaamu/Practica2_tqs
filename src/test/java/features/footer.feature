Feature: Footer

  Scenario: Frequent questions

    Given the user is in the home page and accepts or not the cookies
    When the user clicks frequent questions option
    And the user selects a question
    Then the question information appears