Feature: SupportChat

  Scenario: Open and close support chat
    Given the user is in the home page and accepts or not the cookies
    When the user clicks support chat button
    And the support chat is displayed
    And the user clicks close support chat button
    Then the support chat is closed


