package com.devcognitio.screenplay.avianca.tasks;

import com.devcognitio.screenplay.avianca.user_interface.LocalizadoresAuto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Clicks implements Task {
    public static Target accionClick;

    public Clicks (Target accionClick){
        this.accionClick = accionClick;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(LocalizadoresAuto.DESKTOPS),
                Click.on(LocalizadoresAuto.PC),
                Click.on(LocalizadoresAuto.ADDTOCARD),
                Click.on(LocalizadoresAuto.CAR),
                Click.on(LocalizadoresAuto.CHEKOUT),
                Click.on(LocalizadoresAuto.CONTINUE)
        );


    }
    public static Performable On(Target accionClick){return instrumented(Clicks.class, accionClick);
    }
}
