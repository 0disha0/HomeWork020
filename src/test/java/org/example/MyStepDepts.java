package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDepts {

HomePage homePage= new HomePage();
RegisterPage registerPage = new RegisterPage();
Utils utils =new Utils();

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user select a register page")
    public void user_select_a_register_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.toVerifyUserCanOpenRegisterPage();

    }
    @Then("user should be able to go to the register Page")
    public void user_should_be_able_to_go_to_the_register_page() {
        // Write code here that turns the phrase above into concrete actions
    }
    @And("user enter all required registration details")
    public void user_enter_all_required_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.registrationDetails();
    }

    @And("select a register Button")
    public void select_a_register_button() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.clickOnRegisterButton();

    }
    @Then("User should be able to see\" Your Registration Complete\"")
    public void user_should_be_able_to_see_your_registration_complete() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("user click on the {string} link")
    public void user_click_on_the_link(String category_link) {
        // Write code here that turns the phrase above into concrete actions
       homePage.clickOnCategoryPage(category_link);
    }
    @Then("user should be able to go to the {string} Page")
    public void user_should_be_able_to_go_to_the_page(String category_page) {
        // Write code here that turns the phrase above into concrete actions
       utils.currentURL(category_page);
    }
}
