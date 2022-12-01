package StepDefinations;

import SeleniumCode.AT03_CreatAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD03_CreatAnAccount {
    @Given("user navigates to Create and Account screen")
    public void user_navigates_to_create_and_account_screen() throws IOException {
        AT03_CreatAnAccount.NavToAcc();
    }
    @Then("Enter data {string},{string},{string}")
    public void enter_data(String FirstName,String LastName,String EmailAddress) {
        AT03_CreatAnAccount.EnterAccData(FirstName,LastName,EmailAddress);
    }

    }
