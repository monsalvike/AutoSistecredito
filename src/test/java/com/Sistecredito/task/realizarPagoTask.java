package com.Sistecredito.task;

import com.Sistecredito.models.Usuario;
import com.openhtmltopdf.css.parser.property.BorderPropertyBuilders;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.Sistecredito.userinterface.paginaPrincipal.*;

public class realizarPagoTask implements Task {

    private Usuario usuario;

    public realizarPagoTask(List<Usuario> usuarioList){
        this.usuario=usuarioList.get(0);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTNPAGORAPIDO));
        actor.attemptsTo(Enter.theValue(usuario.getCedula()).into(CAMPOCEDULA));
        actor.attemptsTo(Click.on(BTNCONTINUAR));
    }

    public static realizarPagoTask realizarPagoTask (List<Usuario>usuarioList){
        return new realizarPagoTask(usuarioList);

    }
}
