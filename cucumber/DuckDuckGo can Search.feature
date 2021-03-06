Feature: DuckDuckGo can Search
  As a user I can type a search query on the DuckDuckGo search page, press search, and it shows a list of results.

  Scenario: DuckDuckGo Search Query
    Given I browse to the webpage "https://start.duckduckgo.com"
    When I enter the search query "ducks"
    And I press search
    Then the results list appears
    And the browser is closed
