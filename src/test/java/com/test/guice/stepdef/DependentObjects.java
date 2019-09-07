package com.test.guice.stepdef;

import com.google.inject.Inject;
import com.test.guice.FindElement;
import com.test.guice.TestContext;
import com.test.guice.modals.SignUpModal;
import com.test.guice.pages.*;
import com.test.guice.pages.topheader.HeaderPage;
import com.test.guice.workflow.NavigateWeb;
import com.test.guice.workflow.automationpractice.*;
import com.test.guice.workflow.automationpractice.searchitem.SearchItem;
import cucumber.api.java.en.And;

public class DependentObjects <T> {

    private TestContext testContext;

    @Inject
    public DependentObjects(TestContext testContext) {
        this.testContext = testContext;
    }


    @And("^Initialise for navigation$")
    public void initialInitialisation() {

        testContext.navigateWeb = new NavigateWeb();
        testContext.find = new FindElement();
        testContext.navigationPage = new NavigationPage();
        testContext.navigateOnWebsite = new NavigateOnWebsite();
        testContext.searchItem = new SearchItem();
        testContext.homePageInteractables = new HomePageInteractables();

    }

    @And("^Initialise search item$")
    public void initialiseSearchItem() {

        testContext.navigateWeb = new NavigateWeb();
        testContext.find = new FindElement();
        testContext.navigationPage = new NavigationPage();
        testContext.navigateOnWebsite = new NavigateOnWebsite();
        testContext.searchItem = new SearchItem();
        testContext.homePageInteractables = new HomePageInteractables();
        testContext.searchResults = new SearchResults();
        testContext.searchResultActions = new SearchResultActions();
    }

    @And("^Initialise add to cart$")
    public void initialiseAddToCart() {

        testContext.navigateWeb = new NavigateWeb();
        testContext.find = new FindElement();
        testContext.navigationPage = new NavigationPage();
        testContext.navigateOnWebsite = new NavigateOnWebsite();
        testContext.searchItem = new SearchItem();
        testContext.homePageInteractables = new HomePageInteractables();
        testContext.searchResults = new SearchResults();
        testContext.searchResultActions = new SearchResultActions();
    }

    @And("^Initialise SignUp$")
    public void initialiseSignUp() {

        testContext.navigateWeb = new NavigateWeb();
        testContext.find = new FindElement();
        testContext.navigationPage = new NavigationPage();
        testContext.navigateOnWebsite = new NavigateOnWebsite();
        testContext.searchItem = new SearchItem();
        testContext.homePageInteractables = new HomePageInteractables();
        testContext.searchResults = new SearchResults();
        testContext.searchResultActions = new SearchResultActions();

        testContext.headerPage= new HeaderPage();
        testContext.headerActions= new HeaderActions();
        testContext.authenticationPage= new AuthenticationPage();
        testContext.createAnAccount= new CreateAnAccount(testContext);
        testContext.enterInforForSignUp= new EnterInforForSignUp(testContext);
        testContext.personalInfo= new PersonalInfo();
    }


}
