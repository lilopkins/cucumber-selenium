Feature: DuckDuckGo can Search
  As a user I can type a search query on the Google search page, press search, and it shows a list of results.

  Scenario: DuckDuckGo Search Query
    Given I browse to the webpage "https://start.duckduckgo.com"
    When I enter the search query "ducks" and press search
    Then The results list appears
