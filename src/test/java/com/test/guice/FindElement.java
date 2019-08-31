package com.test.guice;

import com.test.guice.framework.ParentFunctionWeb;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement element;
    private ParentFunctionWeb parentFunctionWeb;

    public FindElement() {
        parentFunctionWeb= new ParentFunctionWeb();
        driver= parentFunctionWeb.getDriver();
        wait= new WebDriverWait(driver,10);
    }


    public WebElement webElement(By locator) {

        wait.until(d -> driver.findElement(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));

        element = driver.findElement(locator);

//        highlightElement(element);

        return driver.findElement(locator);
    }
}
