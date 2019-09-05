package com.test.guice.stepdef.automationpractice;

import com.google.inject.Inject;
import com.test.guice.TestContext;
import com.test.guice.framework.csvparser.DataResolveIn2;
import com.test.guice.framework.csvparser.ParseCSVMap;
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

        DataResolveIn2 dataResolveIn= new DataResolveIn2();
        ParseCSVMap parseCSVMap= new ParseCSVMap();
        parseCSVMap.resolveData(dataResolveIn,"src\\test\\resources\\qa.csv","create a PM with cost");

        testContext.searchItem.searchInToolbar(testContext,dataResolveIn.getFname());
        testContext.searchItem.clickSearch(testContext);
    }
}
