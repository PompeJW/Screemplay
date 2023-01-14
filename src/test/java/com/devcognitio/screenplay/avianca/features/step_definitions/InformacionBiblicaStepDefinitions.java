package com.devcognitio.screenplay.avianca.features.step_definitions;


import com.devcognitio.screenplay.avianca.exceptions.ElementException;
import com.devcognitio.screenplay.avianca.questions.MostrarTexto;
import com.devcognitio.screenplay.avianca.tasks.ClickElement;
import com.devcognitio.screenplay.avianca.tasks.EnterText;
import com.devcognitio.screenplay.avianca.tasks.HitButton;
import com.devcognitio.screenplay.avianca.tasks.RealizarBusqueda;
import com.devcognitio.screenplay.avianca.user_interface.BusquedaBiblicaPage;
import com.devcognitio.screenplay.avianca.utils.Messages;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class InformacionBiblicaStepDefinitions {

    @Dado("^el usuario fue capaz de abrir la pagina (.*)$")
    public void el_usuario_fue_capaz_de_abrir_la_pagina_https_www_jw_org_es(String url)  {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @Cuando("^que me encuentro en la pagina y escribo la palabra (.*)$")
    public void que_me_encuentro_en_la_pagina_y_escribo_la_palabra_familia(String palabraClave)  {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RealizarBusqueda.from(palabraClave, BusquedaBiblicaPage.SEARCH)
        );
    }


    @Entonces("^me comparara con el link del ejemplo: (.*)$")
    public void me_comparara_con_el_link_del_ejemplo_Familias_felices_Más_ayuda_para_las_familias(String titulo) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MostrarTexto.with(BusquedaBiblicaPage.LINK),
                Matchers.is(Matchers.equalTo(titulo))).orComplainWith(ElementException.class, Messages.ELEMENTO_INEXISTENTE));

    }
    @Dado("^que me encuentro en la pagina principal busco en la biblioteca la opcion de revistas$")
    public void que_me_encuentro_en_la_pagina_principal_busco_en_la_biblioteca_la_opcion_de_revistas()  {
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickElement.accion(BusquedaBiblicaPage.BIBLIOTECA));

    }

    @Cuando("^de click en revistas seleccionara todos los tipos escribira (.*) y seleccionara antiguedad$")
    public void de_click_en_revistas_seleccionara_todos_los_tipos_escribira_Atalaya_y_seleccionara_antiguedad(String revista) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.accion(BusquedaBiblicaPage.REVISTAS),
                EnterText.enter(BusquedaBiblicaPage.FILTRO, revista),
                HitButton.hit(BusquedaBiblicaPage.BUSQUEDA),
                Scroll.to(BusquedaBiblicaPage.VALIDACION)

                );

    }

    @Entonces("^me deberia arrojar un resultado como el ejemplo: (.*)$")
    public void me_deberia_arrojar_un_resultado_como_el_ejemplo_Cómo_puede_asegurarse_un_buen_futuro(String title)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MostrarTexto.with(BusquedaBiblicaPage.VALIDACION),
                Matchers.is(Matchers.endsWith(title))).orComplainWith(ElementException.class, Messages.ELEMENTO_INEXISTENTE));

    }

}
