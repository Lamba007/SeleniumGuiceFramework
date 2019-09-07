package com.test.guice.framework;

import cucumber.api.Scenario;

public class ScenarioName {

    private static Scenario scenario1;

    public static void setScenario(Scenario scenario) {

        scenario1=scenario;
    }

    public static String getScenario(){

        return scenario1.getName();
    }
}
