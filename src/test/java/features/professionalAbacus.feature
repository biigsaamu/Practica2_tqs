Feature: Professional Abacus
  Scenario: Professional Link
    Given the user is in the home page and accepts or not the cookies
    When the user clicks professional abacus link
    Then the professional abacus page is displayed

  Scenario: Professional Stationery
    Given the user is on the professional home page and accepts or not the cookies
    When the user clicks professional stationery link
    Then the professional stationery page is displayed

  Scenario: Professional Material
    Given the user is on the professional home page and accepts or not the cookies
    When the user clicks professional material link
    Then the professional material page is displayed

  Scenario: Professional Technology
    Given the user is on the professional home page and accepts or not the cookies
    When the user clicks professional technology link
    Then the professional technology page is displayed

  Scenario: Professional Furniture
    Given the user is on the professional home page and accepts or not the cookies
    When the user clicks professional furniture link
    Then the professional furniture page is displayed

  Scenario: Professional Catalogs
    Given the user is on the professional home page and accepts or not the cookies
    When the user clicks professional catalogs link
    Then the professional catalogs page is displayed

  Scenario: Professional Paper
    Given the user is on the professional home page and accepts or not the cookies
    When the user hovers the mouse of stationery link
    And the user clicks professional paper link
    Then the professional paper page is displayed

  Scenario: Professional Footer Quality
    Given the user is on the professional home page and accepts or not the cookies
    When the user clicks professional quality link
    Then the professional quality page is displayed

  Scenario: Professional Footer Contact
    Given the user is on the professional home page and accepts or not the cookies
    When the user clicks professional contact link
    Then the professional contact page is displayed

  Scenario: Professional Search
    Given the user is on the professional home page and accepts or not the cookies
    When the user enters "Estima'm quan menys ho mereixi" in the professional search bar
    And the user clicks enter in professional search bar
    Then the page with the results of "Estima'm quan menys ho mereixi... perquè és quan més ho necessito" professional search is displayed
