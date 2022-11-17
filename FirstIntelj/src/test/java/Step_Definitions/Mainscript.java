package Step_Definitions;

import config.browserdriver;
import elements.elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Mainscript {

    elements ele;

    @Given("open OrangeHrms website")
    public void open_orange_hrms_website() {
        System.out.print("Start");
    }

    @When("Enter Valid Credentials")
    public void enter_valid_credentials() {
        browserdriver.getCurrentDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ele= PageFactory.initElements(browserdriver.getCurrentDriver(),elements.class);
        ele.userdetails("Admin","admin123");
        ele.buttons();

    }
    @Then("UserPage Should be displayed")
    public void user_page_should_be_displayed() throws IOException, InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("https://opensource-dem.orangehrmlive.com/web/index.php/dashboard/index",ele.elem(browserdriver.getCurrentDriver()));
        TakesScreenshot shot=(TakesScreenshot) browserdriver.getCurrentDriver();
        File file=shot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./shot/shot.png"));
            System.out.print("End");
        }

    }

