package com.test.guice.workflow.automationpractice.searchitem;

import com.test.guice.TestContext;
import com.test.guice.framework.stringutilities.StringUtility;

public class SearchItem {

    public void searchInToolbar(TestContext testContext,String item){

        testContext.find.webElement(testContext.homePageInteractables.getSearchBox()).sendKeys(item);
    }

    public void clickSearch(TestContext testContext){

        testContext.find.webElement(testContext.homePageInteractables.getSubmitSearch()).click();
    }
}
