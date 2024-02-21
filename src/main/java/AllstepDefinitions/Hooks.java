package AllstepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.DriverClass;

public class Hooks {
    @Before
    public void beforeScenario() {
        System.out.println("Scenario is starting");
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) DriverClass.getDriver());
            final byte[] byteImage = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", "screenshot name");
        }
        DriverClass.quitDriver();
    }
}

