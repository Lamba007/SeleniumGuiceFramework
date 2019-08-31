package com.test.guice.stepdef;


import com.google.inject.Inject;
import com.test.guice.World;
import com.test.guice.workflow.NavigateWebsite;
import cucumber.api.java.en.When;

public class MyStepdefs2 {

    private World world;

    @Inject
    public MyStepdefs2(World world) {
        this.world = world;
    }

    @When("^I test something$")
    public void iTestSomething() throws Throwable {

        System.out.println(world.navigateWebsite.getTest());
    }
}
