package com.cybertek.library.step_definitions;

import com.cybertek.library.pges.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage login = new LoginPage();


    @Given("I am on the  login page")
    public void i_am_on_the_login_page() {
        String url = ConfigurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);

    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        String email = ConfigurationReader.getProperty("lib55Email");
        login.email.sendKeys(email);
        String password = ConfigurationReader.getProperty("lib55pass");
        login.password.sendKeys(password);
        login.signInButton.click();

    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expected ="dashboard";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));
        System.out.println("actual = " + actual);

        //Driver.closeDriver();

    }


}
