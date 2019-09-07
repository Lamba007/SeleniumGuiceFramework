package com.test.guice.workflow.automationpractice;

import com.test.guice.TestContext;

public class CreateAnAccount<T> {

    private TestContext testContext;

    public CreateAnAccount(TestContext testContext){

        this.testContext= testContext;
    }

    public void enterEmailAddress(String emailAddress){

        testContext.find.webElement(testContext.authenticationPage.getEmailAddress()).sendKeys(emailAddress);
    }

    public void clickCreateAccount(){

        testContext.find.webElement(testContext.authenticationPage.getSubmitCreate()).click();
    }
}
