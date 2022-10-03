package com.devcognitio.screenplay.avianca.tasks;

import com.devcognitio.screenplay.avianca.user_interface.Youtube;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class QuitarAnuncio implements Task {

    public QuitarAnuncio() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(
                WaitUntil.the(Youtube.ANUNCIO, WebElementStateMatchers.isEnabled()),
                Click.on(Youtube.ANUNCIO)
        );

    }

    public static Performable video(){return instrumented(QuitarAnuncio.class);
    }
}
