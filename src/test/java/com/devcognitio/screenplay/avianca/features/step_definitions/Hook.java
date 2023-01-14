package com.devcognitio.screenplay.avianca.features.step_definitions;


import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        try {
            OnStage.setTheStage(new OnlineCast());
            OnStage.theActorCalled("Actor");
        }catch (NullPointerException e)
        {
            System.out.println("El error es aca"+ e.getMessage());
        }

}
}
