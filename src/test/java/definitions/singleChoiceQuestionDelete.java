package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;

public class singleChoiceQuestionDelete {
    @Given("I open login page {string} from browser")
    public void iOpenLoginPageFromBrowser(String Login) {
        getDriver().get(Login);
    }

    @And("I type email {string} in the field")
    public void iTypeEmailInTheField(String Email) {
        getDriver().findElement(By.xpath("//*[@placeholder='Email *']")).sendKeys(Email);
    }

    @And("I type password {string} in the field")
    public void iTypePasswordInTheField(String Password) {
        getDriver().findElement(By.xpath("//*[@placeholder='Password *']")).sendKeys(Password);
    }

    @When("I click Sign in  button at the login page")
    public void iClickSignInButtonAtTheLoginPage() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
    }

    @And("I wait for {int} sec")
    public void iWaitForSec(int arg0) throws Throwable {
        Thread.sleep(3000);
    }

    @Then("homepage {string} should be displayed")
    public void homepageShouldBeDisplayed(String Homepage) {
        getDriver().get(Homepage);
    }


    @And("I click on {string} from the homepage")
    public void iClickOnFromTheHomepage(String Quizzes) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Quizzes')]")).click();
    }

    @And("I open List of Quizzes page")
    public void iOpenListOfQuizzesPage() {
        getDriver().findElement(By.xpath("//*[contains(text(),'List of Quizzes')]")).click();
    }

    @And("I click Create new quiz button on the Quizzes page")
    public void iClickCreateNewQuizButtonOnTheQuizzesPage() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
    }


    @Then("I open page with {string}")
    public void iOpenPageWith(String QuizBuilder) {
        getDriver().findElement(By.xpath("//ac-quiz-builder-page[@class='ng-star-inserted']")).sendKeys(QuizBuilder);
    }

    @And("I type {string} into the title of quiz")
    public void iTypeIntoTheTitleOfQuiz(String Title) {
        getDriver().findElement(By.xpath("//*[@placeholder='Title Of The Quiz *']")).sendKeys(Title);
    }

    @And("I click on {string} under the title of quiz")
    public void iClickOnUnderTheTitleOfQuiz(String Add) {
        getDriver().findElement(By.xpath("//*[contains(text(),'add_circle')]")).click();

    }


    @Then("expansion panel with {string} should be  displayed")
    public void expansionPanelWithShouldBeDisplayed(String Q1) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q1: new empty question')]")).sendKeys(Q1);
    }

    @And("I select radio button of {string} type question")
    public void iSelectRadioButtonOfTypeQuestion(String arg0) {
        getDriver().findElement(By.xpath("//mat-radio-button[@id='mat-radio-47']//div[@class='mat-radio-outer-circle']")).click();
    }

    @Then("Single-choice question content window should be displayed")
    public void singleChoiceQuestionContentWindowShouldBeDisplayed() {
        boolean displayed = getDriver().findElement(By.xpath("//*[contains(text(), 'Q1: new empty question')]")).isDisplayed();
    }

    @And("I type Question: {string} on the question text field")
    public void iTypeQuestionOnTheQuestionTextField(String Type1) {
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Type1);
    }


    @And("I type Option {int} is {string}")
    public void iTypeOptionIs(int arg0, String Option1) {
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys(Option1);
    }
    @And("I type Option {int} is {string}")
    public void iTypeOptionIs(int arg0, String Option2) {
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys(Option2);
    }

    @And("I check radio button with Option {int} inside of question window")
    public void iSelectRadioButtonWithOptionInsideOfQuestionWindow(int arg0) {
        getDriver().findElement(By.xpath("//*[@id='mat-radio-50']//div[@class='mat-radio-inner-circle']")).click();
    }


    @And("I click on {string} at the question window")
    public void iClickOnAtTheQuestionWindow(String Add) throws Throwable{
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//*[contains(text(),'add_circle')]")).click();
    }

    @Then("expansion panel with {string} should be  displayed")
    public void expansionPanelWithShouldBeDisplayed(String Q2) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q2: new empty question')]")).sendKeys(Q2);
    }

    @And("I select radio button of {string}  type question")
    public void iSelectRadioButtonOfTypeQuestion(String Textual) {
        getDriver().findElement(By.xpath("//div//*[@id='mat-radio-58-input']")).click();
    }

    @Then("Textual question content window should be displayed")
    public void textualQuestionContentWindowShouldBeDisplayed() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q2: new empty question')]")).isDisplayed();
    }
    @And("I type Question: {string} on the question text field")
    public void iTypeQuestionOnTheQuestionTextField(String Howmuch) {
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys(Howmuch);
    }


    @When("I click {string} button on the right panel of quiz")
    public void iClickButtonOnTheRightPanelOfQuiz(String Save) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
    }


    @Then("list of quizzes page should be displayed")
    public void listOfQuizzesPageShouldBeDisplayed() {
        getDriver().findElement(By.xpath("//[contains(text(),'List of Quizzes')]")).isDisplayed();
    }

    @And("I select quiz {string} from list of quizzes")
    public void iSelectQuizFromListOfQuizzes(String arg0) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Math Quiz')]")).isSelected();
    }

    @When("I click on {string}")
    public void iClickOn(String arg0) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Math Quiz')]")).click();
    }

    @Then("Expansion panel with quiz info should be displayed")
    public void expansionPanelWithQuizInfoShouldBeDisplayed() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Math Quiz')]")).isDisplayed();

    }

    @And("I click {string} button at the expansion panel")
    public void iClickButtonAtTheExpansionPanel(String Edit) {
        getDriver().findElement(By.xpath("//div[@id='cdk-accordion-child-443']//span[@class='mat-button-wrapper'][contains(text(),'Edit')]")).click();
    }

    @Then("page with {string} name and Option {int} and Option {int} questions should be displayed")
    public void pageWithNameAndOptionAndOptionQuestionsShouldBeDisplayed(String arg0, int arg1, int arg2) {
        getDriver().findElement(By.xpath("//*[@placeholder='Title Of The Quiz']")).isDisplayed();

    }

    @When("I select Question {int} {string}")
    public void iSelectQuestion(int arg0, String arg1) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q1*: how much is 2+2')]")).isSelected();
    }

    @Then("Question {int} dialogue window should be displayed")
    public void questionDialogueWindowShouldBeDisplayed(int Q1) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q1*: how much is 2+2')]")).isDisplayed();
    }

    @When("I click {string} at the bottom of question {int} dialogue window")
    public void iClickAtTheBottomOfQuestionDialogueWindow(String Delete, int arg1) {
        getDriver().findElement(By.xpath("//div[@id='cdk-accordion-child-621']//span[@class='mat-button-wrapper'][contains(text(),'Delete Question')]")).click();
    }

    @And("Select {string} from the confirmation pop up window")
    public void selectFromTheConfirmationPopUpWindow(String arg0) {
        getDriver().findElement(By.xpath("//*[@id='mat-dialog-title-6']")).isSelected();
    }

    @Then("Question Q{int}: {string} should be displayed as question Q{int}")
    public void questionQShouldBeDisplayedAsQuestionQ(int arg0, String arg1, int arg2) {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1: how much is 2+3')]")).isDisplayed();

    }

    @And("I click Save button at the right side of quiz page")
    public void iClickSaveButtonAtTheRightSideOfQuizPage() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Save']")).click();
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String arg0) {
        getDriver().findElement(By.xpath("//[contains(text(),'List of Quizzes')]")).isDisplayed();
    }

    @And("I click on {string}from list of quizzes")
    public void iClickOnFromListOfQuizzes(String MathQuiz) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Math Quiz')]")).click();
    }

    @And("expansion panel with info should be displayed on the list of quizzes")
    public void expansionPanelWithInfoShouldBeDisplayedOnTheListOfQuizzes() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Math Quiz')]")).isDisplayed();
    }

    @And("I click {string} at the expansion panel")
    public void iClickAtTheExpansionPanel(String arg0) {
        getDriver().findElement(By.xpath("//div[@id='cdk-accordion-child-1064']//span[@class='mat-button-wrapper'][contains(text(),'Preview')]")).click();
    }

    @Then("Quiz {string} with one question {string} should be displayed")
    public void quizWithOneQuestionShouldBeDisplayed(String MathQuiz, String Howmuch) {
        getDriver().findElement(By.xpath("//*[contains(text(),'PREVIEW MODE')]")).isDisplayed()
    }
}
}







