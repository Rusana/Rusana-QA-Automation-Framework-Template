Feature: Login Tests

  Scenario: Login Success

    Given I open Login Page
    When I enter email "shikhabidovarusana@gmail.com"
    And I enter password "Te$t$tudent"
    And I submit
    Then I am logged in