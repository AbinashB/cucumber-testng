import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by abiswal on 5/18/17.
 */

@CucumberOptions(features = { "src/test/java/features/TwoWayFlightReservation.feature" },
        tags = {"@Smoke"})

public class RunnerClassTestForTwoWay extends AbstractTestNGCucumberTests {
    @Managed(driver = "chrome")
    WebDriver driver;
}
