package com.devcognitio.screenplay.avianca.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickElement implements Task {
    public static Target clickElemento;

    public ClickElement(Target clickElemento) {
        this.clickElemento = clickElemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(
                Click.on(clickElemento)
        );

    }

    public static Performable accion(Target clickElemento){return instrumented(ClickElement.class, clickElemento);
    }
}
