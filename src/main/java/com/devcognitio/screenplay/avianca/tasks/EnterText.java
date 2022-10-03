package com.devcognitio.screenplay.avianca.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterText implements Task {

    public Target elemento;
    public String contain;

    public EnterText(Target elemento, String contain){
        this.contain = contain;
        this.elemento = elemento;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Enter.theValue(contain).into(elemento),
                Hit.the(Keys.ENTER).into(elemento)
        );
    }
    public static Performable enter(Target elemento,String contain){
        return instrumented(EnterText.class, elemento, contain);
    }



}
