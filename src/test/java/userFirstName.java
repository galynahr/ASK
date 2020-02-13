import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class userFirstName {
    @Given("I open registration page")
    public void iOpenRegistrationPage() {
    }

    @And("i  type first name {string}")
    public void iTypeFirstName(String arg0) {
    }

    @And("I type last name {string}")
    public void iTypeLastName(String arg0) {
    }

    @And("I type email {string}")
    public void iTypeEmail(String arg0) {
    }

    @And("I type group code {string}")
    public void iTypeGroupCode(String arg0) {
    }

    @And("I type password {string}")
    public void iTypePassword(String arg0) {
    }

    @And("I confirm password {string}")
    public void iConfirmPassword(String arg0) {
    }

    @And("I click Register me button")
    public void iClickRegisterMeButton() {
    }

    @And("I wait for {int} sec")
    public void iWaitForSec(int arg0) {
    }

    @Then("{string} message appears")
    public void messageAppears(String arg0) {
    }
}
