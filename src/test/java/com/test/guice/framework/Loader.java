package com.test.guice.framework;

import org.openqa.selenium.WebDriver;

public abstract class Loader {

    private static WebDriver driver;

    public static void assignDriver(WebDriver driver1){

        driver=driver1;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
