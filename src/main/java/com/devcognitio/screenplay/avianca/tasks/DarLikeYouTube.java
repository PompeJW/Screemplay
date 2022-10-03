package com.devcognitio.screenplay.avianca.tasks;

import com.devcognitio.screenplay.avianca.user_interface.Youtube;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DarLikeYouTube implements Task {


    public DarLikeYouTube(){

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(Youtube.LIKE.resolveAllFor(actor).get(0))
        );
    }
    public static Performable on(){
        return instrumented(DarLikeYouTube.class);
    }
}
