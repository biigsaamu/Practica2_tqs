Feature: login

  Scenario: login fail, no fields filled
    Given the user is in the register or login page and accepts or not the cookies
    When the user clicks login button
    Then a massage error "Camp requerit" appears in both fields (user and pwd)

  Scenario: login fail, only user field
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "samupautqs@gmail.com" in user field and "" pwd field
    And the user clicks login button
    Then a massage error "Camp requerit" appears in pwd field

  Scenario: login fail, only pwd field
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "" in user field and "P2tqs2024" pwd field
    And the user clicks login button
    Then a massage error "Camp requerit" appears in user field

  Scenario: login fail, invalid user and pwd
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "a" in user field and "a" pwd field
    And the user clicks login button
    Then a massage error "Camp no vàlid" appears in both fields (user and pwd)

  Scenario: login fail, invalid user valid pwd
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "a" in user field and "P2tqs2024" pwd field
    And the user clicks login button
    Then a massage error "Camp no vàlid" appears in user field

  Scenario: login fail, valid user invalid pwd
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "samupautqs@gmail.com" in user field and "a" pwd field
    And the user clicks login button
    Then a massage error "Camp no vàlid" appears in pwd field

  Scenario: login fail, unfilled user invalid pwd
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "" in user field and "a" pwd field
    And the user clicks login button
    Then a massage error "Camp requerit" appears in user field
    Then a massage error "Camp no vàlid" appears in pwd field

  Scenario: login fail, invalid user unfilled pwd
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "incorrect" in user field and "" pwd field
    And the user clicks login button
    Then a massage error "Camp no vàlid" appears in user field
    Then a massage error "Camp requerit" appears in pwd field

  Scenario: login fail, user correct pwd incorrect
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "samupautqs@gmail.com" in user field and "P2tqs2023" pwd field
    And the user clicks login button
    Then a massage error "Usuari o contrasenya incorrectes" appears in the form

  Scenario: login fail, pwd correct user incorrect
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "incorrect@gmail.com" in user field and "P2tqs2024" pwd field
    And the user clicks login button
    Then a massage error "Usuari o contrasenya incorrectes" appears in the form

  Scenario: login correct
    Given the user is in the register or login page and accepts or not the cookies
    When the user enters "samupautqs@gmail.com" in user field and "P2tqs2024" pwd field
    And the user clicks login button
    Then the user "samupautqs@gmail.com" profile page appears

  Scenario: logout
    Given the user profile page
    When user clicks logout button
    Then the register or login page appears

