package com.cybertek.library.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTables_StepDefinitions {

    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> fruitList) {
        System.out.println("fruitList = " + fruitList);
        for(String each : fruitList){
            System.out.println(each);
        }


    }
}