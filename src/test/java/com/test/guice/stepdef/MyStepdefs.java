package com.test.guice.stepdef;


import com.google.inject.Inject;
import com.test.guice.World;
import com.test.guice.workflow.NavigateWebsite;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MyStepdefs {

    private World world;

    @Inject
    public MyStepdefs(World world) {
        this.world = world;

    }

    @When("^I navigate path Women>Tops>T-shirts$")
    public void navigateFeature() {

        world.navigateWebsite.setTest("called from 1");
        System.out.println(world.navigateWebsite.getTest());
    }

    @Given("^I test$")
    public void iTest() throws Throwable {
        System.out.println("working");
    }


//    @When("^I test something$")
//    public void iTestSomething() throws Throwable {
//
//        System.out.println(world.navigateWebsite.getTest());
//    }
}
