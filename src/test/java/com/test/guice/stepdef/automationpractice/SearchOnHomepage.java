package com.test.guice.stepdef.automationpractice;

import com.google.inject.Inject;
import com.test.guice.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java8.En;

public class SearchOnHomepage implements En {

    private TestContext testContext;

    @Inject
    public SearchOnHomepage(TestContext testContext) {
        this.testContext = testContext;
    }


    @Given("^I search on website for (.+)")
    public void iSearchOnWebsite(String item){

        testContext.searchItem.searchInToolbar(testContext,item);
        testContext.searchItem.clickSearch(testContext);
    }
}
