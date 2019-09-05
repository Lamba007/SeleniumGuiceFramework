package com.test.guice;
import com.test.guice.pages.HomePageInteractables;
import com.test.guice.pages.NavigationPage;
import com.test.guice.pages.SearchResults;
import com.test.guice.stepdef.Hooks;
import com.test.guice.workflow.NavigateWeb;
import com.test.guice.workflow.NavigateWebsite;
import com.test.guice.workflow.automationpractice.NavigateOnWebsite;
import com.test.guice.workflow.automationpractice.SearchResultActions;
import com.test.guice.workflow.automationpractice.searchitem.SearchItem;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class TestContext {

        public FindElement find;
        public HomePageInteractables homePageInteractables;
        public NavigateWeb navigateWeb;
        public NavigationPage navigationPage;
        public NavigateOnWebsite navigateOnWebsite;
        public SearchResultActions searchResultActions;
        public SearchItem searchItem;
        public SearchResults searchResults;
}
