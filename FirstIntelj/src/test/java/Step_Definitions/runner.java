package Step_Definitions;

import io.cucumber.junit.Cucumber;

//import io.cucumber.junit.Cucumber;



import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features/orange.feature","src/test/resources/features/parallel.feature"},
        glue= {"Step_Definitions","hooks"},
        dryRun = false,
        monochrome=false,
//        stepNotifications = true,
        //plugin = { "pretty", "html:target/cucumber-reports" }
        //plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"}
        //plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class runner {
}
