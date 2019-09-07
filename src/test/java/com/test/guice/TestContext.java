package com.test.guice;

import com.test.guice.modals.SignUpModal;
import com.test.guice.pages.*;
import com.test.guice.pages.topheader.HeaderPage;
import com.test.guice.stepdef.Hooks;
import com.test.guice.workflow.NavigateWeb;
import com.test.guice.workflow.NavigateWebsite;
import com.test.guice.workflow.automationpractice.*;
import com.test.guice.workflow.automationpractice.searchitem.SearchItem;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class TestContext <T> {

    public FindElement find;
    public HomePageInteractables homePageInteractables;

    public NavigateWeb navigateWeb;
    public NavigationPage navigationPage;
    public NavigateOnWebsite navigateOnWebsite;
    public SearchResultActions searchResultActions;
    public SearchItem searchItem;
    public SearchResults searchResults;

    //Sign up

    public HeaderPage headerPage;
    public HeaderActions headerActions;
    public AuthenticationPage authenticationPage;
    public CreateAnAccount createAnAccount;

    //personal information
    public PersonalInfo personalInfo;
    public EnterInforForSignUp enterInforForSignUp;

    //MODALS
    public SignUpModal signUpModal;

    public void initialiseOnSpot(T objRef){

      signUpModal= (SignUpModal) objRef;
    }
}


