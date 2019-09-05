package com.test.guice.framework;

import com.test.guice.framework.stringutilities.StringUtility;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentFunctionWeb {

//    private ParentFunctionWeb(){
//
//        throw new IllegalStateException();
//    }
    private static WebDriver driver=null;

    public static void setDriver(){

            ChromeDriverManager.getInstance(ChromeDriver.class).setup();
            driver = new ChromeDriver();
    }

    public static WebDriver getDriver(){

        return driver;
    }
}
