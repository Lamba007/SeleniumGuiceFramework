package com.test.guice.pages;

import org.openqa.selenium.By;

public class NavigationPage {


    public By getItemByTitle(String item) {

        return By.xpath("//a[@title='" + item + "']");
    }
}
