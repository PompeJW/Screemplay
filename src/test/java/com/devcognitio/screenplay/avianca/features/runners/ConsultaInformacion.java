package com.devcognitio.screenplay.avianca.features.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/consulta_de_tiquetes/informacion.feature",
        glue = "com/devcognitio/screenplay/avianca/features/step_definitions",
        tags = "@Revistas")
public class ConsultaInformacion {

}
