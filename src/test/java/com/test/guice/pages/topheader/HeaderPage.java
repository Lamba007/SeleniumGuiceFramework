package com.test.guice.pages.topheader;

import org.openqa.selenium.By;

public class HeaderPage {

    private final By contactUs= By.xpath("//a[@title='Contact Us']");
    private final By signIn= By.xpath("//a[@title='Log in to your customer account']");

    public By getContactUs() {
        return contactUs;
    }

    public By getSignIn() {
        return signIn;
    }
}
