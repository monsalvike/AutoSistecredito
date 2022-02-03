package com.Sistecredito.stepdefinitions;

import com.Sistecredito.models.Usuario;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class VariablesDefinitions {
    @ParameterType(".*")
    public Actor actor (String actorName){
        return OnStage.theActorCalled(actorName);
    }

    @DataTableType
    public Usuario usuario(Map<String,String> data){
        return new Usuario(data.get("cedula"));
    }
}
