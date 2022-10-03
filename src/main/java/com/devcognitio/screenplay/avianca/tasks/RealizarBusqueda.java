package com.devcognitio.screenplay.avianca.tasks;

import com.devcognitio.screenplay.avianca.user_interface.BusquedaBiblicaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarBusqueda implements Task {

    public String palabraClave;
    public Target target;

    public RealizarBusqueda(String palabraClave, Target target) {
        this.palabraClave = palabraClave;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(palabraClave).into(BusquedaBiblicaPage.SEARCH),
                Hit.the(Keys.ENTER).into(BusquedaBiblicaPage.SEARCH)
        );

    }
    public static Performable from(String palabraClave, Target target){
        return instrumented(RealizarBusqueda.class, palabraClave, target);
    }
}
