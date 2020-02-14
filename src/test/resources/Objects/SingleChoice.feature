Feature: Single-Choice Question
  Scenario: Single-Choice Question - Delete
    Given I open login page "http://ask-stage.portnov.com/#/login" from browser
    And I type email "minniminaya@gmail.com" in the field
    And I type password "tester1" in the field
    When I click Sign in  button at the login page
    And I wait for 3 sec
    Then homepage "http://ask-stage.portnov.com/#/home" should be displayed
    And I click on "Quizzes" from the homepage
    And I open List of Quizzes page
    And I click Create new quiz button on the Quizzes page
    Then I open page with "Title of the Quiz"
    And I type "Math Quiz" into the title of quiz
    And I click on "Add Question" under the title of quiz
    Then expansion panel with "Q1: new empty question" should be  displayed
    And I select radio button of "Single-choice" type question
    Then Single-choice question content window should be displayed
    And I type Question: "How much is 2X2?" on the question text field
    And I type Option 1 is "4"
    And I type Option 2 is "5"
    And  I check radio button with Option 1 inside of question window
    And I click on "Add question" at the question window
    Then expansion panel with "Q2: new empty question" should be  displayed
    And I select radio button of "Textual"  type question
    Then Textual question content window should be displayed
    And I type Question: "How much is 2+1?" on the question text field
    When I click "Save" button on the right panel of quiz
    Then list of quizzes page should be displayed
    And I select quiz "Math Quiz" from list of quizzes
    When I click on "Math Quiz"
    Then Expansion panel with quiz info should be displayed
    And I click "Edit" button at the expansion panel
    Then page with "Math Quiz" name and Option 1 and Option 2 questions should be displayed
    When I select Question 1 "How much is 2X2?"
    Then Question 1 dialogue window should be displayed
    When I click "Delete question" at the bottom of question 1 dialogue window
    And Select "Delete" from the confirmation pop up window
    Then Question Q2: "How much is 2+1??" should be displayed as question Q1
    And I click Save button at the right side of quiz page
    Then "List of Quizzes" should be displayed
    And  I click on "Math Quiz"from list of quizzes
    And expansion panel with info should be displayed on the list of quizzes
    And I click "Preview mode" at the expansion panel
    Then Quiz "Math Quiz" with one question "How much is 2+1?" should be displayed

