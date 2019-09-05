package com.test.guice.framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HelperMethods {

    private WebDriver driver;

    public void assignDriver(WebDriver driver) {
        this.driver = driver;
    }

    public JavascriptExecutor getJScript() {

        return (JavascriptExecutor) driver;
    }
}
