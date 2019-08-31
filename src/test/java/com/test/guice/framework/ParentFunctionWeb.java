package com.test.guice.framework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentFunctionWeb {

    protected static WebDriver driver;

    public void setDriver(){

        if(driver==null){
            ChromeDriverManager.getInstance(ChromeDriver.class).setup();
            driver = new ChromeDriver();
        }
    }

    public WebDriver getDriver(){

        return driver;
    }
}
