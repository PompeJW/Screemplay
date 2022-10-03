package com.devcognitio.screenplay.avianca.tasks;

import com.devcognitio.screenplay.avianca.user_interface.LocalizadoresAuto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarInfoFromExcel implements Task {

    List<String> datos;

    public LlenarInfoFromExcel(List<String> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0)).into(LocalizadoresAuto.NAME),
                Enter.theValue(datos.get(1)).into(LocalizadoresAuto.LASTNAME),
                Enter.theValue(datos.get(2)).into(LocalizadoresAuto.EMAIL),
                Enter.theValue(datos.get(3)).into(LocalizadoresAuto.CELL),
                Enter.theValue(datos.get(4)).into(LocalizadoresAuto.PASSWORD),
                Enter.theValue(datos.get(4)).into(LocalizadoresAuto.CONFIRM),
                Enter.theValue(datos.get(5)).into(LocalizadoresAuto.ADDRESS),
                Enter.theValue(datos.get(6)).into(LocalizadoresAuto.CITY),
                Enter.theValue(datos.get(7)).into(LocalizadoresAuto.POSSTCODE),
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
    }

    public static Performable with(List<String> datos) {
        return instrumented(LlenarInfoFromExcel.class, datos);
    }
}
