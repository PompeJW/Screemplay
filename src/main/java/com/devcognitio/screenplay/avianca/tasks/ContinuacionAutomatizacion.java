package com.devcognitio.screenplay.avianca.tasks;

import com.devcognitio.screenplay.avianca.user_interface.LocalizadoresAuto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinuacionAutomatizacion implements Task {

    public ContinuacionAutomatizacion(Target accionon) {
        this.accionon = accionon;
    }

    public  Target accionon;




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LocalizadoresAuto.CIUDAD),
                Click.on(LocalizadoresAuto.DEPARTAMENTO),
                Click.on(LocalizadoresAuto.POLITICA),
                Click.on(LocalizadoresAuto.CONTINIUN),
                Click.on(LocalizadoresAuto.CONTINUE3),
                Click.on(LocalizadoresAuto.CONTINUE4),
                Click.on(LocalizadoresAuto.TERMINOS),
                Click.on(LocalizadoresAuto.CONFIRMACION),
                Click.on(LocalizadoresAuto.PASOFINAL)

        );
    } public static Performable On(Target accionon){return instrumented(Clicks.class, accionon);
    }
}
