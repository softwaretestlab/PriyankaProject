package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksLearning02 {
    @Given("user opens browser Second")
    public void user_opens_browser_second() {
        System.out.println("Second Browser opened");
    }
    @When("user on homepage Second")
    public void user_on_homepage_second() {
        System.out.println("Second Homepage opened");
    }
    @Then("user clicks on account link Second")
    public void user_clicks_on_account_link_second() {
        System.out.println("Second accountlink opened");
    }
}
