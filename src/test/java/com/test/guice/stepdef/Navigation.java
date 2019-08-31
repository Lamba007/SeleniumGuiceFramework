package com.test.guice.stepdef;

import com.google.inject.Inject;
import com.test.guice.World;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java8.En;

public class Navigation implements En {

    private World world;

    @Inject
    public Navigation(World world) {
        this.world = world;
    }

    @Given("^I navigate to the path Women>Tops>T-shirts$")
    public void navigateTo() {

        world.navigateWeb.parsePath(world,"Women");
    }
}
