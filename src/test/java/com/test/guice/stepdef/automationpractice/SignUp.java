package com.test.guice.stepdef.automationpractice;

import com.google.inject.Inject;
import com.test.guice.TestContext;
import com.test.guice.framework.csvparser.AddCartModal;
import com.test.guice.framework.csvparser.ParseCSV;
import com.test.guice.framework.csvparser.ParseCSVMap;
import com.test.guice.framework.stringutilities.StringUtility;
import com.test.guice.modals.SignUpModal;
import com.test.guice.stepdef.DependentObjects;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java8.En;

import java.util.concurrent.TimeoutException;

public class SignUp {

    private TestContext testContext;
    ParseCSVMap parseCSVMap;
    private SignUpModal signUpModal;

    @Inject
    public SignUp(TestContext testContext) {
        this.testContext = testContext;
    }


    @Given("^I sign up on the page")
    public void iSearchOnWebsite(){

        ParseCSVMap parseCSVMap= new ParseCSVMap();
        signUpModal= new SignUpModal();
        parseCSVMap.resolveData(signUpModal,"qa.csv");

        testContext.initialiseOnSpot(signUpModal);

        testContext.headerActions.clickSignUp(testContext);
        testContext.createAnAccount.enterEmailAddress(StringUtility.randomString(3)+"."+StringUtility.randomString(3)+"@gmail.com");
        testContext.createAnAccount.clickCreateAccount();

    }

    @And("^I add information for Signup$")
    public void iAddInformationForSignup(){

//        ParseCSVMap parseCSVMap= new ParseCSVMap();
//        signUpModal= new SignUpModal();
//        parseCSVMap.resolveData(signUpModal,"qa.csv");

        signUpModal=testContext.signUpModal;

        testContext.enterInforForSignUp.enterPersonalInfo("customer_firstname",signUpModal.getFirstname());
        testContext.enterInforForSignUp.enterPersonalInfo("customer_lastname",signUpModal.getLastname());
        testContext.enterInforForSignUp.enterPersonalInfo("passwd",signUpModal.getPassword());
        testContext.enterInforForSignUp.enterPersonalInfo("firstname",signUpModal.getFirstname());
        testContext.enterInforForSignUp.enterPersonalInfo("lastname",signUpModal.getLastname());
        testContext.enterInforForSignUp.enterPersonalInfo("company",signUpModal.getCompany());
        testContext.enterInforForSignUp.enterPersonalInfo("address1",signUpModal.getAddress());
        testContext.enterInforForSignUp.enterPersonalInfo("city",signUpModal.getCity());
        testContext.enterInforForSignUp.enterPersonalInfo("postcode",signUpModal.getPostalcode());
        testContext.enterInforForSignUp.enterPersonalInfo("phone_mobile",signUpModal.getMobile());
        testContext.enterInforForSignUp.enterPersonalInfo("alias",signUpModal.getAlias());
        testContext.enterInforForSignUp.selectDropdown("id_state",signUpModal.getState());

        testContext.enterInforForSignUp.clickRegisterButton();
    }
}
