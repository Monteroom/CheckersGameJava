Feature: Play checkers
  @test
  Scenario: Make five moves
    Given I am on Checkers game page
    When I make five legal moves as orange
    And I include taking a blue piece
    Then I should see the "Make a move" confirmation
    When I restart the game
    Then the game should restart successfully
