Feature: User First Name
  Scenario Outline: User First Name - Field is required
    Given I open registration page
    And i  type first name "<FirstName>"
    And I type last name "I"
    And I type email "example@gmail.com"
    And I type group code "ABC"
    And I type password "12345"
    And I confirm password "12345"
    And I click Register me button
    And I wait for 3 sec
    Then "<message>" message appears
    Examples:
      | FirstName | message|
      | Ivan123   |You have been Registered |
      | --------- | Field is required       |
      | assertstate a fact or belief confidently and forcefullystate a fact or belief confidently and forcefullystate a fact or belief confidently and forcefullystate a fact or belief confidently and forcefullystate a fact or belief confidently and forcefullyas|You have been Registered  |
      |sassertstate a fact or belief confidently and forcefullystate a fact or belief confidently and forcefullystate a fact or belief confidently and forcefullystate a fact or belief confidently and forcefullystate a fact or belief confidently and forcefullyas | Too long                |



