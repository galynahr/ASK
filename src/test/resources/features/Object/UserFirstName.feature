Feature: User - First Name

  Scenario: User - First Name - Alphanumeric and special char
    Given I open registration page
    And I type first name "Nazar12!"
    And I type last name "Demchuk"
    And I type email "fsdfs@fsdg"
    And I type group "p100"
    And I type password "12345"
    And I type confirm password "12345"
    When I click on Register Me button
    Then I wait for loading
    Then object with xpath "//h4[contains(text(),'You have been Registered.')]" must be present

  Scenario: User - First Name - 1 char
    Given I open registration page
    And I type first name "n"
    And I type last name "Demchuk"
    And I type email "fsdfs@fsdg"
    And I type group "p100"
    And I type password "12345"
    And I type confirm password "12345"
    When I click on Register Me button
    Then I wait for loading
    Then object with xpath "//h4[contains(text(),'You have been Registered.')]" must be present

  Scenario: User - Firs Name - White Space is not allowed
    Given I open registration page
    And I type first name "n d"
    And I type last name "Demchuk"
    And I type email "fsdfs@fsdg"
    And I type group "p100"
    And I type password "12345"
    And I type confirm password "12345"
    Then object with xpath "//mat-error[@role='alert']" must be present

  Scenario: User - First Name - Required Field
    Given I open registration page
    And I type last name "Demchuk"
    And I type email "fsdfs@fsdg"
    And I type group "p100"
    And I type password "12345"
    And I type confirm password "12345"
    When I click on Register Me button
    Then object with xpath "//mat-error[@role='alert']" must be present

  Scenario: User - First Name - 254 characters
    Given I open registration page
    And I type first name "TestingFirstNameAllowablecharacters:FirstNameLastName:Allowablecharacters:Alphanumeric&Specialchara12sdfAllowablecharacters:Alphanumeric&Specialchara12sdfAllowablecharacters:Alphanumeric&Specialchara12sdfAllowablecharacters:Alphanumeric&Specialchara12sdhh"
    And I type last name "Demchuk"
    And I type email "fsdfs@fsdg"
    And I type group "p100"
    And I type password "12345"
    And I type confirm password "12345"
    When I click on Register Me button
    Then I wait for loading
    Then object with xpath "//h4[contains(text(),'You have been Registered.')]" must be present

  Scenario: User - First Name - 255 characters
    Given I open registration page
    And I type last name "TestingFirstNameAllowablecharacters:FirstNameLastName:Allowablecharacters:Alphanumeric&Specialchara12sdfAllowablecharacters:Alphanumeric&Specialchara12sdfAllowablecharacters:Alphanumeric&Specialchara12sdfAllowablecharacters:Alphanumeric&Specialchara12sdhh11"
    And I type email "fsdfs@fsdg"
    And I type group "p100"
    And I type password "12345"
    And I type confirm password "12345"
    When I click on Register Me button
    Then object with xpath "//mat-error[@role='alert']" must be present