package com.test.guice.stepdef;

import com.test.guice.framework.ParentFunctionWeb;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private WebDriver driver;
    private ParentFunctionWeb parentFunctionWeb;
    @Before
    public void beforeScenario(){

        System.out.println("Inside hook");
        parentFunctionWeb= new ParentFunctionWeb();

        parentFunctionWeb.setDriver();
        driver=parentFunctionWeb.getDriver();
        driver.get("http://automationpractice.com/index.php");

    }
}
