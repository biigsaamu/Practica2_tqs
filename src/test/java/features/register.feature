Feature: Register

  Scenario: User not registered does fill all the fields except private policies
    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fill in the fields
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does not fill the fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in all fields

  Scenario: User not registered does only fill name field

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp requerit" appears in pwd field
    Then a message error "Camp requerit" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does only fill lastname field

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the lastname field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in name field
    Then a message error "Camp requerit" appears in pwd field
    Then a message error "Camp requerit" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does only fill pwd field

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in name field
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp requerit" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does only fill confirm pwd field

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in name field
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp requerit" appears in pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill name and lastname fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills the lastname field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in pwd field
    Then a message error "Camp requerit" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill name and pwd fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills the pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp requerit" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill name and confirm pwd fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp requerit" appears in pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill lastname and pwd fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the lastname field
    And the user fills the pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in name field
    Then a message error "Camp requerit" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill lastname and confirm pwd fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the lastname field
    And the user fills the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in name field
    Then a message error "Camp requerit" appears in pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill pwd and confirm pwd fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the pwd field
    And the user fills the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in name field
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill name, lastname and pwd fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills the lastname field
    And the user fills the pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill name, lastname and confirm pwd fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills the lastname field
    And the user fills the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill name, pwd and confirm pwd fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills the pwd field
    And the user fills the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill lastname, pwd and confirm pwd fields

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the lastname field
    And the user fills the pwd field
    And the user fills the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in name field
    Then a message error "Camp requerit" appears in privacy policy field



  Scenario: User not registered does fill name and lastname with valid inputs but pwd and confirm pwd with invalid inputs

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills the lastname field
    And the user fills wrong the pwd field
    And the user fills wrong the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp no vàlid" appears in pwd field
    Then a message error "Camp no vàlid" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill name with a valid input, but pwd and confirm pwd with invalid inputs and does
  not fill lastname field

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills wrong the pwd field
    And the user fills wrong the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp no vàlid" appears in pwd field
    Then a message error "Camp no vàlid" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill name with a valid input, but pwd with invalid input and does not fill
  lastname and confirm pwd field

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills wrong the pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp no vàlid" appears in pwd field
    Then a message error "Camp requerit" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill name with a valid input, but confirm pwd with invalid input and does not fill
  lastname and pwd field

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the name field
    And the user fills wrong the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp requerit" appears in pwd field
    Then a message error "Camp no vàlid" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill lastname with a valid input, but pwd and confirm pwd with invalid inputs and does
  not fill name field

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills the lastname field
    And the user fills wrong the pwd field
    And the user fills wrong the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in name field
    Then a message error "Camp no vàlid" appears in pwd field
    Then a message error "Camp no vàlid" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

  Scenario: User not registered does fill pwd and confirm pwd with invalid inputs and does not fill name and lastname
  field

    Given the user is in the register or login page and accepts or not the cookies
    And the user selects the not member option
    And the user enters the mail
    And the user clicks the register button
    And the user fills wrong the pwd field
    And the user fills wrong the confirm pwd field
    And the user clicks the register button of the form
    Then a message error "Camp requerit" appears in name field
    Then a message error "Camp requerit" appears in lastname field
    Then a message error "Camp no vàlid" appears in pwd field
    Then a message error "Camp no vàlid" appears in confirm pwd field
    Then a message error "Camp requerit" appears in privacy policy field

