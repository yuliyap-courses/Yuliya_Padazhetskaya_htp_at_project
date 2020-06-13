Feature: Cinema

  Scenario: Search movie
    Given I open an app
    When I search for <search word> word
    Then I see the list of movie items
    And each item name or description contains <search word>

    Scenario: I Search movie by keyword five
      Given I open search form
      When I Search movie by keyword "five"
      Then I see list of movies with keyword five

  Scenario: I Search movie by city
    Given I open search form
    When I Search movie by city "Minsk"
    Then I see list of movies shown in Minsk




