package com.test.guice.pages;

import org.openqa.selenium.By;

public class SearchResults {

    private final By countOfResults=By.className("heading-counter");

    public By getCountOfResults() {
        return countOfResults;
    }
}
