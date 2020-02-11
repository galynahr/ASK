Feature: User - First Name
  Scenario: User - First Name - Alphanumeric and special char
    Given I open registration page
    And I type first name "Nazar12!"
    And I type last name "Demchuk"
    And I type email "fsdfs@fsdg"
    And I type group "p100"
    And I type password "12345"
    And I type confirm password "12345"
    Then I click on Register Me button
