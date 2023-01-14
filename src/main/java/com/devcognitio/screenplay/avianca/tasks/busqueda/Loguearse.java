package com.devcognitio.screenplay.avianca.tasks.busqueda;

import com.devcognitio.screenplay.avianca.tasks.EnterText;
import com.devcognitio.screenplay.avianca.tasks.HitButton;
import com.devcognitio.screenplay.avianca.user_interface.Facebook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Loguearse implements Task {
    String gmail = "oscardphernandez@gmail.com";
    String pass = "1070987130";


    public Loguearse() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterText.enter(Facebook.CORREO, gmail), EnterText.enter(Facebook.CONTRASEÑA, pass),
                HitButton.hit(Facebook.LOGIN));
    }

    public static Performable Next() {
        return instrumented(Loguearse.class);


    }

}
