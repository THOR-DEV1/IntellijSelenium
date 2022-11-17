package Step_Definitions;

import config.browserdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class main {
    @Given("Launch browser and  navigate url")
    public void launch_browser_and_navigate_url() {

    }

    @When("Take Screenshot")
    public void take_screenshot() throws IOException {
        browserdriver.getCurrentDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        TakesScreenshot shot = (TakesScreenshot) browserdriver.getCurrentDriver();
        File file = shot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./shots/shot.png"));
    }

    @Then("Close browser")
    public void close_browser() {
        browserdriver.getCurrentDriver().close();
    }
}
