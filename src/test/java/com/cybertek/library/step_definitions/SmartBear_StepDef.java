package com.cybertek.library.step_definitions;

import com.cybertek.library.pges.SmartBearLogin;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartBear_StepDef {

    SmartBearLogin smart = new SmartBearLogin();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("Url");
        Driver.getDriver().get(url);
        String username = ConfigurationReader.getProperty("smartUser");
        smart.username.sendKeys(username);

        String password = ConfigurationReader.getProperty("smartPass");
        smart.password.sendKeys(password);
        BrowserUtils.sleep(1);
        smart.loginButton.click();

    }

    @When("User fills out the form as followed from the table below:")
    public void userFillsOutTheFormAsFollowedFromTheTableBelow() {
    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {

    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {

    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {

    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {

    }

    @When("User enters {string} to city")
    public void user_enters_to_city (String string){

    }

    @When("User enters {string} to state")
    public void user_enters_to_state (String string){

    }

    @When("User enters {string} to zip")
    public void user_enters_to_zip (String string){

    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type (String string){
    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number (String string){

    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date (String string){

    }

    @When("User clicks process button")
    public void user_clicks_process_button () {

    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list (String string){
    }


}
