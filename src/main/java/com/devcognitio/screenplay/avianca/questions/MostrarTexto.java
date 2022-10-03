package com.devcognitio.screenplay.avianca.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class MostrarTexto implements Question <String> {
    private Target target;
    public MostrarTexto(Target target){
        this.target = target;
    }


    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(target, WebElementStateMatchers.isVisible());
        return Text.of(target).viewedBy(actor).asString();
    }
    public static MostrarTexto with(Target target){
        return new MostrarTexto(target);
    }
}
