package com.test.guice.stepdef.automationpractice;

import com.google.inject.Inject;
import com.test.guice.TestContext;
import com.test.guice.framework.csvparser.AddCartModal;
import com.test.guice.framework.csvparser.ParseCSVMap;
import cucumber.api.java.en.Given;
import cucumber.api.java8.En;

public class SearchOnHomepage implements En {

    private TestContext testContext;

    @Inject
    public SearchOnHomepage(TestContext testContext) {
        this.testContext = testContext;
    }


    @Given("^I search on website for an item")
    public void iSearchOnWebsite(){

        AddCartModal addCartModal = new AddCartModal(); //Modal
        ParseCSVMap parseCSVMap= new ParseCSVMap();

        parseCSVMap.resolveData(addCartModal,"qa.csv");

        testContext.searchItem.searchInToolbar(testContext,addCartModal.getSearchitem());
        testContext.searchItem.clickSearch(testContext);
    }
}
