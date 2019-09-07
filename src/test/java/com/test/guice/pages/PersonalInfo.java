package com.test.guice.pages;

import org.openqa.selenium.By;

public class PersonalInfo {

    private final By RegisterButton = By.id("submitAccount");

    public By getInputFields(String item){

        return By.id(item);
    }

    public By getRegisterButton() {
        return RegisterButton;
    }
}
