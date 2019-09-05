package com.test.guice.stepdef;

import com.test.guice.framework.HelperMethods;
import com.test.guice.framework.ParentFunctionWeb;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks extends ParentFunctionWeb{

    private static WebDriver driver;
    private HelperMethods helperMethods;


    @Before
    public void beforeScenario() {

        ParentFunctionWeb.setDriver();
        driver=ParentFunctionWeb.getDriver();

        helperMethods= new HelperMethods();

        helperMethods.assignDriver(driver);

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

    }

    @After
    public void afterScenario() throws IOException {

//        driver=ParentFunctionWeb.getDriver();
        for (String winHandle : driver.getWindowHandles()) {
            try {
                driver.switchTo().window(winHandle);
                driver.close();
                driver.quit();
            } catch (Exception e) {
            }
        }
    }
}

