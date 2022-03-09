package starter.stepdefinitions.moduloLoguin;

import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoguinPageStepDefinitions {

    @Entonces("inicia sesion con {string} y {string}")
    public void iniciaSesionConUsuarioYClave(String usuario, String clave) {
        System.out.println("Ruptura" + usuario + clave);
        theActorInTheSpotlight().attemptsTo(

        );
    }
}
