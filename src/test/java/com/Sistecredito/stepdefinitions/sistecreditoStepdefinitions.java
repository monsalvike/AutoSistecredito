package com.Sistecredito.stepdefinitions;

import com.Sistecredito.driver.DriverOwn;
import com.Sistecredito.driver.PlayApp;
import com.Sistecredito.models.Usuario;
import com.Sistecredito.questions.sistecreditoQuestion;
import com.Sistecredito.task.realizarPagoTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static com.Sistecredito.userinterface.paginaPrincipal.RESULTADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class sistecreditoStepdefinitions {

    @Given("the {actor} open the app Sistecredito")
    public void theUserOpenTheAppSistecredito(Actor actor) {
    actor.whoCan(PlayApp.with(DriverOwn.init()));
    }


    @When("the user enter the user payment information")
    public void theUserEnterTheUserPaymentInformation(List<Usuario> usuarioList) {
    theActorInTheSpotlight().attemptsTo(realizarPagoTask.realizarPagoTask(usuarioList));

    }
    @Then("The user should see the messsage {string}")
    public void theUserShouldSeeTheMesssage(String expectedResult) {
        theActorInTheSpotlight().should(seeThat(sistecreditoQuestion.sistecreditoQuestion(expectedResult)));


    }
}
