package com.test.guice.stepdef.automationpractice;

import com.google.inject.Inject;
import com.test.guice.TestContext;
import com.test.guice.framework.stringutilities.StringUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java8.En;
import org.junit.Assert;

public class AssertResults implements En {

    private TestContext testContext;

    @Inject
    public AssertResults(TestContext testContext) {
        this.testContext = testContext;
    }


    @Given("^I assert the result count")
    public void iSearchOnWebsite() {

        String noOfResultsInString = testContext.searchResultActions.getResultsCount(testContext);

        Assert.assertEquals(7,StringUtility.getNumberFromString(noOfResultsInString));
    }
}
