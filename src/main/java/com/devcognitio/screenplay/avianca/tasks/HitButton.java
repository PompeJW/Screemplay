package com.devcognitio.screenplay.avianca.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HitButton implements Task {
    public Target  button;


    public HitButton(Target button){
        this.button = button;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Hit.the(Keys.ENTER).into(button)
        );
    }
    public static Performable hit(Target button){
        return instrumented(HitButton.class, button);
    }
}
