package com.test.guice.workflow.automationpractice;

import com.test.guice.TestContext;


public class NavigateOnWebsite {

    //Method
    public void parsePath(TestContext testContext, String path) {

        String[] unparsedPath = path.trim().split(">");
        int parsedPath = 0;

        if (unparsedPath.length == 1) {

            testContext.find.moveToElement(testContext.navigationPage.getItemByTitle(unparsedPath[parsedPath]));
        } else {
            while (parsedPath < unparsedPath.length) {

                if (parsedPath != unparsedPath.length - 1) {

                    testContext.find.moveToElement(testContext.navigationPage.getItemByTitle(unparsedPath[parsedPath]));

                } else {

                    testContext.find.webElement(testContext.navigationPage.getItemByTitle(unparsedPath[parsedPath])).click();
                }

                parsedPath++;
            }
        }
    }

}
