package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;

public class userFirstName {
    @Given("I open login page")
    public void iOpenLoginPage() {
        getDriver().get("http://ask-stage.portnov.com/#/login");
    }

    @Given("I open registration page")
    public void iOpenRegistrationPage() {
        getDriver().get("http://ask-stage.portnov.com/#/registration");
    }

    @And("I type first name {string}")
    public void iTypeFirstName(String firstName) {
        getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);
    }

    @And("I type last name {string}")
    public void iTypeLastName(String lastName) {
        getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
    }

    @And("I type email {string}")
    public void iTypeEmail(String email) {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
    }

    @And("I type group {string}")
    public void iTypeGroup(String group) {
        getDriver().findElement(By.xpath("//input[@placeholder='Group Code']")).sendKeys(group);
    }

    @And("I type password {string}")
    public void iTypePassword(String passWord) {
        getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passWord);
    }

    @And("I type confirm password {string}")
    public void iTypeConfirmPassword(String confPassword) {
        getDriver().findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(confPassword);
    }

    @Then("I click on Register Me button")
    public void iClickOnRegisterMeButton() {
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }
}
