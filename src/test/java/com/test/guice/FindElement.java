package com.test.guice;


import com.sun.media.jfxmedia.logging.Logger;
import com.test.guice.framework.HelperMethods;
import com.test.guice.framework.ParentFunctionWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement element;
    private ParentFunctionWeb parentFunctionWeb;
    private HelperMethods helperMethods;
    private JavascriptExecutor js;

    public FindElement() {
        parentFunctionWeb= new ParentFunctionWeb();
        helperMethods= new HelperMethods();

        driver= parentFunctionWeb.getDriver();
        wait= new WebDriverWait(driver,10);

    }


    public WebElement webElement(By locator) {

        wait.until(d -> driver.findElement(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));

        element = driver.findElement(locator);

        String jsHighLighter = "arguments[0].style.border='3px dotted green'";

        if (driver != null) {
            ((JavascriptExecutor) driver).executeScript(jsHighLighter, element);
        }

        return driver.findElement(locator);
    }

    public void moveToElement(By locator) {

        Logger.logMsg(Logger.ERROR, "Trying to find - " + locator);
        wait.until(d -> driver.findElement(locator));

        wait.until(ExpectedConditions.elementToBeClickable(locator));
        WebElement element = driver.findElement(locator);

        Logger.logMsg(Logger.ERROR, "Element found - " + locator);

        String jsHighLighter = "arguments[0].style.border='1px dotted green'";

        if (driver != null) {
            ((JavascriptExecutor) driver).executeScript(jsHighLighter, element);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
