
package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;


public class LoginStepDefinition  {
    @Given("I open Login Page")
    public void openLoginPage() {

        BaseDefinition.getThreadLocal().get("https://qa.koel.app/");
        // This step opens the login page by navigating to the specified URL.
    }

    @When("I enter email {string}")
    public void enterEmail(String email) {
        LoginPage loginPage = new LoginPage(BaseDefinition.getThreadLocal());
        loginPage.enterEmail(email);
        // This step enters the provided email into the email field on the login page.
    }

    @And("I enter password {string}")
    public void enterPassword(String password) {
        LoginPage loginPage = new LoginPage(BaseDefinition.getThreadLocal());
        loginPage.enterPassword(password);
        // This step enters the provided password into the password field on the login page.
    }

    @And("I submit")
    public void submit() {
        LoginPage loginPage = new LoginPage(BaseDefinition.getThreadLocal());
        loginPage.clickSubmit();
        // This step clicks the submit button on the login page.
    }

    @Then("I am logged in")
    public void loggedIn() {
        HomePage homePage = new HomePage (BaseDefinition.getThreadLocal());
        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
        // This step asserts that the user is logged in by checking if the user avatar is displayed on the home page.
    }
//
//    @And("I enter incorrect password {string}")
//    public void enterIncorrectPassword(String password) {
//        LoginPage loginPage = new LoginPage(BaseDefinition.getThreadLocal());
//        loginPage.enterIncorrectPassword();
//        // This step does not perform any action as it is missing the code to enter the incorrect password.
//    }
//
//    @Then("I still Login page")
//    public void stillLoginPage() {
//        LoginPage loginPage = new LoginPage(BaseDefinition.getThreadLocal());
//        Assert.assertTrue(loginPage.clickBtnRegistration());
//        // This step asserts that the login page is still displayed by checking if the registration link is displayed.
//    }

    @When("I enter Not existing email {string}")
    public void enterNotExistingEmail(String email) {
        LoginPage loginPage = new LoginPage(BaseDefinition.getThreadLocal());
        loginPage.enterEmail(email);
        // This step enters the provided non-existing email into the email field on the login page.
    }

    @When("I enter Empty email {string}")
    public void enterEmptyEmail(String email) {
        LoginPage loginPage = new LoginPage(BaseDefinition.getThreadLocal());
        loginPage.enterEmail(email);
        // This step enters the provided empty email into the email field on the login page.
    }

    @And("I enter Empty password {string}")
    public void enterEmptyPassword(String password) {
        LoginPage loginPage = new LoginPage(BaseDefinition.getThreadLocal());
        loginPage.enterPassword(password);
        // This step enters the provided empty password into the password field on the login page.
    }
}


