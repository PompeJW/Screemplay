package com.devcognitio.screenplay.avianca.features.step_definitions;


import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hook {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myBrowser));
    }
}
