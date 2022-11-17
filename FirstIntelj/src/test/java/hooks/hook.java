package hooks;


import config.browserdriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hook {
    @Before("@tag1")
    public  void starts(){
    System.out.print("First Feature file Starts"+"\n");
        browserdriver.getCurrentDriver("chrome").get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){

        //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) browserdriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }

}
@After("@tag1")
public void end1(){
    System.out.print("----First Feature file ends-----");

}
}
