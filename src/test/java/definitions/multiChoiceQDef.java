package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import support.TestContext;

import java.util.concurrent.TimeUnit;
//import static org.assertj.core.api.Assertions.*;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;
import static org.assertj.core.api.Assertions.*;
import static support.TestContext.getDriver;


public class multiChoiceQDef {

    @Given("I open {string} page")
    public void iOpenPage(String Page) {
        if (Page.equalsIgnoreCase("registration")) {
            getDriver().get(" getDriver().get(\"http://ask-stage.portnov.com/#/registration\");");
        } else if (Page.equalsIgnoreCase("login")) {
            getDriver().get("http://ask-stage.portnov.com/#/login");
        } else {
            System.out.println("Page is not supported");
        }

    }

    @And("I type email {string}")
    public void iTypeEmail(String email) {
        getDriver().findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(email);
    }

    @And("I type password {string}")
    public void iTypePassword(String pass) {
        getDriver().findElement(By.xpath("//*[@placeholder='Password *']")).sendKeys(pass);
    }

    @And("I click SignIn button")
    public void iClickSignInButton() throws InterruptedException {

        getDriver().findElement(By.xpath("//*[contains(text(), 'Sign In')]")).click();
        Thread.sleep(3000);
    }

    @Then("{string} message appears")
    public void messageAppears(String message) throws InterruptedException {
        WebElement element = getDriver().findElement(By.xpath("//*[contains(text(), '"+message+"')]"));
        assertThat(element.isDisplayed()).isTrue();
        Thread.sleep(3000);
    }
    /*
    @Then("{string} message appears")
public void messageAppears(String message) {
    WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'"+message+"')]"));
    assertThat(element.isDisplayed()).isTrue();
     */

    @And("I click Quizzes menu")
    public void iClickQuizzesMenu() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Quizzes')]")).click();
        Thread.sleep(3000);
    }

    @And("I Create New Quiz")
    public void iCreateNewQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        Thread.sleep(3000);
    }

    @And("I type quiz title {string}")
    public void iTypeQuizTitle(String qtitle) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(qtitle);
        Thread.sleep(3000);
    }

    @And("I add question")
    public void iAddQuestion() throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        Thread.sleep(3000);
    }

    @And("I select multiple choice question")
    public void iSelectMultipleChoiceQuestion() throws InterruptedException {
        getDriver().findElement(By.xpath("//div[contains(text(),'Multiple-Choice')]/..//div[@class='mat-radio-outer-circle']")).click();
        Thread.sleep(3000);
    }

    ////div[contains(text(),'Multiple-Choice')]/..//div[@class='mat-radio-outer-circle']

    @And("I wait for {int} sec")
    public void iWaitForSec(int time) throws Throwable{
        time = time * 1000;
        Thread.sleep(time);
    }
    //And I type question "Choose all digits beginning with 2"
    @And("I type the question {string}")
    public void iTypeTheQuestion(String question) {
        getDriver().findElement(By.xpath("//*[@formcontrolname='question']")).sendKeys(question);
    }

    @And("I type {string} for first Option")
    public void iTypeForFirstOption(String option) {
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 1*']")).sendKeys(option);
    }

    @And("I type {string} for second Option")
    public void iTypeForSecondOption(String option) {
            getDriver().findElement(By.xpath("//textarea[@placeholder='Option 2*']")).clear();
            getDriver().findElement(By.xpath("//textarea[@placeholder='Option 2*']")).sendKeys(option);
    }

    @And("I add Option")
    public void iAddOption() {
        getDriver().findElement(By.xpath("//span[contains(text(), 'Add Option')]")).click();
    }

    @And("I type {string} for third Option")
    public void iTypeForThirdOption(String option) {
        getDriver().findElement(By.xpath("//*//textarea[@placeholder='Option 3*']")).sendKeys(option);
    }

    @And("I set the correct answers")
    public void iSetTheCorrectAnswers() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Option 1*')]/../../../../../..//label[@class='mat-checkbox-layout']")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Option 3*')]/../../../../../..//label[@class='mat-checkbox-layout']")).click();
    }

    @And("I save the quiz")
    public void iSaveTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(), 'Save')]")).click();
        Thread.sleep(5000);
    }

    @And("I find and open the quiz")
    public void iFindAndOpenTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'A quiz to edit')]")).click();
        Thread.sleep(3000);
    }

    @And("I edit the quiz")
    public void iEditTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'A quiz to edit')]/../../..//*[contains(text(),'Edit')]")).click();
        Thread.sleep(3000);
    }

    @And("I select first question")
    public void iSelectFirstQuestion1() throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q1: Choose all digits beginning with 2')]")).click();
        Thread.sleep(3000);
    }

    @And("I delete the Question")
    public void iDeleteTheQuestion() throws InterruptedException {
        getDriver().findElement(By.xpath("//textarea[@placeholder='Question *']")).click();
        getDriver().findElement(By.xpath("//textarea[@placeholder='Question *']")).clear();
        Thread.sleep(1000);
    }

    @And("I change question type to Textual")
    public void iChangeQuestionTypeToTextual() throws InterruptedException {
        getDriver().findElement(By.xpath("//div[contains(text(),'Textual')]/..//div[@class='mat-radio-outer-circle']")).click();
        //OR  //div[contains(text(),'Textual')]/..//div[@class='mat-radio-container']
        Thread.sleep(5000);
    }

    @And("I confirm the changes")
    public void iConfirmTheChanges() throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Switch')]")).click();
        Thread.sleep(3000);
    }

    @And("I Preview the quiz")
    public void iPreviewTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'A quiz to edit')]/../../..//*[contains(text(),'Preview')]")).click();
        Thread.sleep(20000);
    }

    @Then("the Preview page is present with changes")
    public void thePreviewPageIsPresentWithChanges() throws InterruptedException {
        assertThat(getDriver().findElement(By.xpath("//*[contains(text(),'Write 2')]")).isDisplayed()).isTrue();
        Thread.sleep(2000);

    }
    /*
    @Then("^element with xpath \"([^\"]*)\" should be displayed$")
    public void elementWithXpathShouldBeDisplayed(String xpath) {
        assertThat(getDriver().findElement(By.xpath(xpath)).isDisplayed()).isTrue();
    }
     */

    @And("I change max point of the question to 8")
    public void iChangeMaxPoint() {
        WebElement element = getDriver().findElement(By.xpath("//div[@class='wrapper']//div[@class='mat-slider-thumb']"));
        Actions action = new Actions(getDriver());
        action.dragAndDropBy(element, 50, 0).perform();
    }
    @Then("I verify maxinum possible core is 8")
    public void iVerifyMaxinumPossibleCoreShouldBe() {
        WebElement element = getDriver().findElement(By.xpath("//td[contains(text(),'Maximum possible score:')]/following-sibling::td[contains(text(),'8')]/../../../../../../..//mat-panel-title[contains(text(),'A quiz to edit')]"));
        assertThat(element.isDisplayed()).isTrue();
        //  //td[contains(text(),'Maximum possible score:')]/following-sibling::td[contains(text(),'8')]/../../../../../../..//mat-panel-title[contains(text(),'A quiz to edit')]
    }
    @Then("I verify if second option show 45")
    public void secondOptionShouldShowCorrectNumber() {
        assertThat(getDriver().findElement(By.xpath("//span[contains(text(),'45')]")).isDisplayed()).isTrue();
    }

//    @Then("I verify if second option show 45")
//    public void secondOptionShouldShowCorrectNumber_2() {
//        assertThat(getDriver().findElement(By.xpath("//span[contains(text(),'45')]")).isDisplayed()).isTrue();
//    }

    @Then("I verify if quiz has one question with correct text and a text field for answer")
    public void theQuizShouldHaveOneQuestionAndTextFieldForAnswer() {
        assertThat(getDriver().findElement(By.xpath("//h5[contains(text(),'Question 1 / 1')]")).isDisplayed()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//h3[contains(text(),'Choose all digits beginning with 2')]")).isDisplayed()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//textarea[@placeholder='Enter your answer']")).isDisplayed()).isTrue();
    }

    @Then("I verify question {string} is present")
    public void iVerifyQuestionIsPresent(String question) {
        String questionText = getDriver().findElement(By.xpath("//*[contains(text(),'Write 2')]")).getText();
        assertThat(questionText.equalsIgnoreCase(question));
    }


    @Then("I verify there is a text field for answer")
    public void iVerifyThereIsATextFieldForAnswer() {
        assertThat(getDriver().findElement(By.xpath("//textarea[@placeholder='Enter your answer']")).isDisplayed()).isTrue();
    }

    @And("I clean up the db by delete the quiz")
    public void iCleanUpTheDbByDeleteTheQuiz() {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'A quiz to edit')]/../../..//*[contains(text(),'Delete')]")).click();
    }

}
