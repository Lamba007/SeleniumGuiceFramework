package com.test.guice.pages;

import com.google.inject.Inject;
import org.openqa.selenium.By;

public class HomePageInteractables {

    private final By myCart= By.xpath("//a[@title='View my shopping cart']");
    private final By searchBox= By.id("search_query_top");
    private final By submitSearch= By.name("submit_search");

    public By getMyCart() {
        return myCart;
    }

    public By getSearchBox() {
        return searchBox;
    }

    public By getSubmitSearch() {
        return submitSearch;
    }
}
