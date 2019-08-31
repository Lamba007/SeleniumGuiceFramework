package com.test.guice.workflow;

import com.google.inject.Inject;
import com.test.guice.World;

public class NavigateWeb {

    public void parsePath(World world,String path) {

        String[] unparsedPath = path.trim().split(">");
        int parsedPath = 0;

        if (unparsedPath.length == 1) {

            world.find.webElement(world.navigationPage.getItemByTitle(unparsedPath[parsedPath])).click();
        }
    }

}
