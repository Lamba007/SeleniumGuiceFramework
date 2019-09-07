package com.test.guice.pages;

import org.openqa.selenium.By;

public class AuthenticationPage {

    //Create
    private final By emailAddress= By.id("email_create");
    private final By submitCreate= By.id("SubmitCreate");

    //Login
    private final By emailAddressLogin= By.id("email");
    private final By password= By.id("passwd");

    public By getEmailAddress() {
        return emailAddress;
    }

    public By getSubmitCreate() {
        return submitCreate;
    }

    public By getEmailAddressLogin() {
        return emailAddressLogin;
    }

    public By getPassword() {
        return password;
    }
}
