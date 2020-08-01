Feature: Search all available hotels on current date on Moscow

  Scenario: Search as guest
    Given User open Booking page
    When User enter Moscow on search field
    And User Select currenet date
    And User select one date after current date
    And User submit search field by button
    Then User see list of all available cities