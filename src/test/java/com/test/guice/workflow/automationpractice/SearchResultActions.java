package com.test.guice.workflow.automationpractice;

import com.test.guice.TestContext;

public class SearchResultActions {

    public String getResultsCount(TestContext testContext){

        return testContext.find.webElement(testContext.searchResults.getCountOfResults()).getText();
    }
}
