package com.devcognitio.screenplay.avianca.features.step_definitions;

import com.devcognitio.screenplay.avianca.tasks.ClickElement;
import com.devcognitio.screenplay.avianca.tasks.DarLikeYouTube;
import com.devcognitio.screenplay.avianca.tasks.EnterText;
import com.devcognitio.screenplay.avianca.user_interface.Youtube;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class AutomatizacionYoutubeStepDefinitions {


    @Dado("^que ya pude ingresar a la pagina de (.*)$")
    public void que_ya_pude_ingresar_a_la_pagina_de_https_www_youtube_com(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));

    }


    @Dado("^que me encuentro en la pagina y busco el video llamado (.*)$")
    public void que_me_encuentro_en_la_pagina_y_busco_el_video_llamado_I_Wanna_Know(String name) {
        OnStage.theActorInTheSpotlight().wasAbleTo(EnterText.enter(Youtube.SEARCH, name));

    }

    @Cuando("^se desplegue la lista de opciones escogere uno en especifico$")
    public void se_desplegue_la_lista_de_opciones_escogere_uno_en_especifico() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.accion(Youtube.LIST_VIDEOS.of(
                "Alesso - I Wanna Know ft. Nico & Vinz"))
               // QuitarAnuncio.video()
        );

    }

    @Entonces("^despues de esto le dara like y finalizara: nose$")
    public void despues_de_esto_le_dara_like_y_finalizara_nose() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DarLikeYouTube.on()
        );
    }


}
