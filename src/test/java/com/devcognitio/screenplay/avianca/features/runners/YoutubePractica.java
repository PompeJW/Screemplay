package com.devcognitio.screenplay.avianca.features.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/consulta_de_tiquetes/automatizacion_youtube.feature",
        glue = "com.devcognitio.screenplay.avianca.features.step_definitions",
        tags = "@PracticeYoutube"
)
public class YoutubePractica {
}
