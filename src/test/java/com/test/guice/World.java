package com.test.guice;



import com.test.guice.pages.NavigationPage;
import com.test.guice.stepdef.MyStepdefs;
import com.test.guice.workflow.NavigateWeb;
import com.test.guice.workflow.NavigateWebsite;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class World {

        public NavigateWebsite navigateWebsite;
        public NavigateWeb navigateWeb;
        public FindElement find;
        public NavigationPage navigationPage;
}
