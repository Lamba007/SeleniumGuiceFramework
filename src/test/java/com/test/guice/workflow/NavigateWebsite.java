package com.test.guice.workflow;

import com.google.inject.Inject;
import com.test.guice.World;

public class NavigateWebsite {

    private World world;

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
