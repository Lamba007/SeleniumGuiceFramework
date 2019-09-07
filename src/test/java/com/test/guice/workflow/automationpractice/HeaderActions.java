package com.test.guice.workflow.automationpractice;

import com.test.guice.TestContext;

public class HeaderActions {

    public void clickSignUp(TestContext testContext) {

        testContext.find.webElement(testContext.headerPage.getSignIn()).click();
    }

    public void clickContactUs(TestContext testContext) {

        testContext.find.webElement(testContext.headerPage.getContactUs()).click();
    }
}
