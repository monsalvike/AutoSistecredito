package com.Sistecredito.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GeneralStepDefinitions {
    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
}
