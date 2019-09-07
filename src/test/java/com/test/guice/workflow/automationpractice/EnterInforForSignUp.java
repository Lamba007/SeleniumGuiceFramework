package com.test.guice.workflow.automationpractice;

import com.test.guice.TestContext;
import org.openqa.selenium.support.ui.Select;

public class EnterInforForSignUp {

    private TestContext testContext;

    public EnterInforForSignUp(TestContext testContext) {

        this.testContext = testContext;
    }

    public void enterPersonalInfo(String item, String value) {

        testContext.find.webElement(testContext.personalInfo.getInputFields(item)).sendKeys(value);
    }

    public void selectDropdown(String item, String value){

        Select select= new Select(testContext.find.selectWebElement(testContext.personalInfo.getInputFields(item)));
        select.selectByIndex(1);
    }

    public void clickRegisterButton(){

        testContext.find.webElement(testContext.personalInfo.getRegisterButton()).click();
    }
}
