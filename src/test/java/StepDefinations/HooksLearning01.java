package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksLearning01 {
    //@Before and @After will run for all featurefiles
@Before
    public void startTest(){
        System.out.println("Test Started");
    }

    @Given("user opens browser first")
    public void user_opens_browser_first() {
        System.out.println("Browser opened for scenario-1");
    }
    @When("user on homepage first")
    public void user_on_homepage_first() {
        System.out.println("I am on homepage for scenario-1");
    }
    @Then("user clicks on account link first")
    public void user_clicks_on_account_link_first() {
        System.out.println("I am on my account screen for scenario-1");
    }
    @After
    public void EndTest(){
        System.out.println("Test Ended");
    }
}
