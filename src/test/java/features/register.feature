Feature: Register

  Scenario: User Register

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks enter register
    And the user fill in the fields
    And the user accepts the privacy policy
    #And the user clicks in the register button def
    #And the user submits the register
