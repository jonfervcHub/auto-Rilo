package starter.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import io.cucumber.java.es.Y;
import starter.navigation.NavigateTo;


public class AmbienteRilo {
    @Y("se ingresa al portal de home Rilo")
    public void se_ingresa_al_portal_de_home_Rilo(){
        System.out.println("ingreso al portal home page");
        theActorInTheSpotlight().attemptsTo(
                NavigateTo.theRiloHomePage()
        );
    }

}
