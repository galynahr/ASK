Feature: Create and Edit multiple-choice question

  Scenario: Create quiz with multiple-choice question and edit quiz with new question and question type
    Given I open "login" page
    And I type email "marthadngo@yahoo.com"
    And I type password "3492@Lisbon"
    And I click SignIn button
    When "My New name" message appears
    And I click Quizzes menu
    And I Create New Quiz
    And I type quiz title "A quiz to edit"
    And I add question
    And I select multiple choice question
    And I type the question "Choose all digits beginning with 2"
    And I type "21" for first Option
    And I type "32" for second Option
    And I add Option
    And I type "25" for third Option
    And I set the correct answers
    And I save the quiz
    And I find and open the quiz
    And I edit the quiz
    And I select first question
    And I delete the Question
    And I type the question "Write 2"
    And I change question type to Textual
    And I confirm the changes
    And I save the quiz
    And I find and open the quiz
    And I Preview the quiz
    Then I verify question "Write 2" is present
    Then I verify there is a text field for answer
    And I wait for 5 sec

  Scenario: Create quiz with multiple-choice question and change point per question
    Given I open "login" page
    And I type email "marthadngo@yahoo.com"
    And I type password "3492@Lisbon"
    And I click SignIn button
    When "My New name" message appears
    And I click Quizzes menu
    And I Create New Quiz
    And I type quiz title "A quiz to edit"
    And I add question
    And I select multiple choice question
    And I type the question "Choose all digits beginning with 2"
    And I type "21" for first Option
    And I type "32" for second Option
    And I add Option
    And I type "25" for third Option
    And I set the correct answers
    And I save the quiz
    And I find and open the quiz
    And I edit the quiz
    And I select first question
    And I change max point of the question to 8
    And I save the quiz
    And I find and open the quiz
    Then I verify maxinum possible core is 8
    And I wait for 5 sec

  Scenario: Create quiz with multiple-choice question and change option 2 with new value
    Given I open "login" page
    And I type email "marthadngo@yahoo.com"
    And I type password "3492@Lisbon"
    And I click SignIn button
    When "My New name" message appears
    And I click Quizzes menu
    And I Create New Quiz
    And I type quiz title "A quiz to edit"
    And I add question
    And I select multiple choice question
    And I type the question "Choose all digits beginning with 2"
    And I type "21" for first Option
    And I type "32" for second Option
    And I add Option
    And I type "25" for third Option
    And I set the correct answers
    And I save the quiz
    And I find and open the quiz
    And I edit the quiz
    And I select first question
    And I type "45" for second Option
    And I save the quiz
    And I find and open the quiz
    And I Preview the quiz
    Then I verify if second option show 45
    And I wait for 5 sec


  Scenario: Create quiz w/ mult-choice Q and change QType to textual and verify text field is present for answer
    Given I open "login" page
    And I type email "marthadngo@yahoo.com"
    And I type password "3492@Lisbon"
    And I click SignIn button
    When "My New name" message appears
    And I click Quizzes menu
    And I Create New Quiz
    And I type quiz title "A quiz to edit"
    And I add question
    And I select multiple choice question
    And I type the question "Choose all digits beginning with 2"
    And I type "21" for first Option
    And I type "32" for second Option
    And I add Option
    And I type "25" for third Option
    And I set the correct answers
    And I save the quiz
    And I find and open the quiz
    And I edit the quiz
    And I select first question
    And I change question type to Textual
    And I confirm the changes
    And I save the quiz
    And I find and open the quiz
    And I Preview the quiz
    Then I verify if quiz has one question with correct text and a text field for answer




