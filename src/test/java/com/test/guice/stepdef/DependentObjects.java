package com.test.guice.stepdef;

import com.google.inject.Inject;
import com.test.guice.FindElement;
import com.test.guice.TestContext;
import com.test.guice.framework.csvparser.DataResolveIn;
import com.test.guice.framework.csvparser.DataResolveIn2;
import com.test.guice.framework.csvparser.ParseCSV;
import com.test.guice.framework.csvparser.ParseCSVMap;
import com.test.guice.pages.HomePageInteractables;
import com.test.guice.pages.NavigationPage;
import com.test.guice.pages.SearchResults;
import com.test.guice.workflow.NavigateWeb;
import com.test.guice.workflow.automationpractice.NavigateOnWebsite;
import com.test.guice.workflow.automationpractice.SearchResultActions;
import com.test.guice.workflow.automationpractice.searchitem.SearchItem;
import cucumber.api.java.en.And;

public class DependentObjects {

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

    @And("^Initialise for navigation2$")
    public void initialInitialisation2() {

        testContext.navigateWeb = new NavigateWeb();
        testContext.find = new FindElement();
        testContext.navigationPage = new NavigationPage();
        testContext.navigateOnWebsite = new NavigateOnWebsite();
        testContext.searchItem = new SearchItem();
        testContext.homePageInteractables = new HomePageInteractables();
        testContext.searchResults=new SearchResults();
        testContext.searchResultActions= new SearchResultActions();
    }
}
