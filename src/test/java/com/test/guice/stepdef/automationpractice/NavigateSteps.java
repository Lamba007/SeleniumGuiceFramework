package com.test.guice.stepdef.automationpractice;

import com.google.inject.Inject;
import com.test.guice.TestContext;
import cucumber.api.java.en.Given;

public class NavigateSteps {

    private TestContext testContext;

    @Inject
    public NavigateSteps(TestContext testContext) {
        this.testContext = testContext;
    }


    @Given("^I navigate on the website (.+)$")
    public void iNavigateOnTheWebsite(String path){

        testContext.navigateOnWebsite.parsePath(testContext,path);
    }
}
