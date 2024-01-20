Feature: Footer
  Scenario: About us
    Given the user is in the home page and accepts or not the cookies
    When the user clicks about us option
    Then the about us page is displayed

  Scenario: Membership
    Given the user is in the home page and accepts or not the cookies
    When the user clicks membership option
    Then the membership subscription form appears

  Scenario: Frequent questions
    Given the user is in the home page and accepts or not the cookies
    When the user clicks frequent questions option
    And the user selects a question
    Then the question information appears

  Scenario: Contact us
    Given the user is in the home page and accepts or not the cookies
    When the user clicks contact us option
    Then the contact us page is displayed

  Scenario: Youtube
    Given the user is in the home page and accepts or not the cookies
    When the user clicks youtube option
    And the user refuses the youtube cookies
    Then the youtube page is displayed

  Scenario: Cookies policy
    Given the user is in the home page and accepts or not the cookies
    When the user clicks cookies policy option
    Then the cookies policy page is displayed

  Scenario: Map
    Given the user is in the home page and accepts or not the cookies
    When the user clicks map option
    Then the map page is displayed

  Scenario: Terms and conditions
    Given the user is in the home page and accepts or not the cookies
    When the user clicks terms and conditions option
    Then the terms and conditions page is displayed

  Scenario: Privacy policy
    Given the user is in the home page and accepts or not the cookies
    When the user clicks privacy policy option
    Then the privacy policy page is displayed