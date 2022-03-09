package starter.runner.ayudaPage;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/homeRiloPage/HomeRilo.feature",
        glue="starter",
        tags = "@PortalLoginRilo",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class homeRilo {
}