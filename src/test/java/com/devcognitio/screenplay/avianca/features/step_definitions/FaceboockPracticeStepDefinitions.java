package com.devcognitio.screenplay.avianca.features.step_definitions;

import com.devcognitio.screenplay.avianca.tasks.EnterText;
import com.devcognitio.screenplay.avianca.tasks.busqueda.Loguearse;
import com.devcognitio.screenplay.avianca.user_interface.Facebook;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class FaceboockPracticeStepDefinitions {


    @Dado("^que me encuentro en la plataforma de inico de sesion con la url (.*)$")
    public void que_me_encuentro_en_la_plataforma_de_inico_de_sesion_con_la_url_https_www_facebook_com(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @Cuando("^me encuentre en la pagina ya logueado con el gmail y passport$")
    public void me_encuentre_en_la_pagina_ya_logueado_con_el_gmail_y_passport() {
        OnStage.theActorInTheSpotlight().attemptsTo(Loguearse.Next());
    }

    @Cuando("^busque el nombre de (.*) le dare like en sus fotos$")
    public void busque_el_nombre_de_Eliza_Gonzalez_le_dare_like_en_sus_fotos(String name)  {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterText.enter(Facebook.BUSCAR, name));
    }

    @Entonces("^le mandare un mensaje y finalizare$")
    public void le_mandare_un_mensaje_y_finalizare()  {
        OnStage.theActorInTheSpotlight().should();

    }

}
