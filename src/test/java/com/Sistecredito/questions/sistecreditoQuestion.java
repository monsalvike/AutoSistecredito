package com.Sistecredito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.Sistecredito.userinterface.paginaPrincipal.RESULTADO;

public class sistecreditoQuestion implements Question<Boolean> {
    private String expectedResult;

    public sistecreditoQuestion(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return RESULTADO.resolveFor(actor).getText().equals(expectedResult);
    }

    public static sistecreditoQuestion sistecreditoQuestion(String expectedResult){
        return new sistecreditoQuestion(expectedResult);
    }
}
