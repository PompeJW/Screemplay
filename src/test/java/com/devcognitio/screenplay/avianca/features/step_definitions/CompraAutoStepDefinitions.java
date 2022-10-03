package com.devcognitio.screenplay.avianca.features.step_definitions;

import com.devcognitio.screenplay.avianca.tasks.Clicks;
import com.devcognitio.screenplay.avianca.tasks.ContinuacionAutomatizacion;
import com.devcognitio.screenplay.avianca.tasks.LlenarInfoFromExcel;
import com.devcognitio.screenplay.avianca.user_interface.LocalizadoresAuto;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;

import java.io.IOException;

import static com.devcognitio.screenplay.avianca.utils.Excel.getInfoExcel;


public class CompraAutoStepDefinitions {

    @Dado("^que ya me encuentro en (.*)$")
    public void que_ya_me_encuentro_en_http_opencart_abstracta_us_index_php_route_common_home(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url(url)
        );

    }

    @Dado("^que me encentro en la pagina agrego al carrito de compras la mac$")
    public void que_me_encentro_en_la_pagina_agrego_al_carrito_de_compras_la_mac() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Clicks.On(LocalizadoresAuto.DESKTOPS));

    }

    @Cuando("^ingrese al carro de compra llenara toda la informacion solicitada$")
    public void ingrese_al_carro_de_compra_llenara_toda_la_informacion_solicitada() throws IOException {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LlenarInfoFromExcel.with(getInfoExcel())
        );

    }

    @Entonces("^culminara lo escenarios faltantes para la compra$")
    public void culminara_lo_escenarios_faltantes_para_la_compra() {

    }

}
