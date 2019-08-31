package com.test.guice.stepdef;

import com.google.inject.Inject;
import com.test.guice.FindElement;
import com.test.guice.World;
import com.test.guice.pages.NavigationPage;
import com.test.guice.workflow.NavigateWeb;
import com.test.guice.workflow.NavigateWebsite;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class MyStepdefs3 {

    private World world;

    @Inject
    public MyStepdefs3(World world) {
        this.world = world;
    }

    @When("^My first stepdef$")
    public void iTestSomething() throws Throwable {

        world.navigateWebsite = new NavigateWebsite();
    }

    @And("^My first stepdef 2$")
    public void myFirstStepdef() throws Throwable {

        world.navigateWeb = new NavigateWeb();
        world.find = new FindElement();
        world.navigationPage = new NavigationPage();
    }
}
