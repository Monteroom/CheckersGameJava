package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.DBUtilities;
import utilities.Driver;

public class Hooks {
    private static final Logger logger = LogManager.getLogger(Hooks.class);
    @Before
    public void setup(Scenario scenario){
        logger.info("Scenario: " + scenario.getName() + " is starting");
    }
    @After
    public void cleanUp(Scenario scenario){

        if (scenario.isFailed()){
            logger.error("Scenario FAILED");
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        else{
            logger.info("Scenario PASSED");
        }
        Driver.quit();
    }
}
