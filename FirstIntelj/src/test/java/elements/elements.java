package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class elements {

    @FindBy(xpath = "//*[contains(@id,'app')]//following::input[2]")
    WebElement user;
    @FindBy(xpath = "//*[contains(@id,'app')]//following::input[3]")
    WebElement pass;
    @FindBy(xpath = "//*[contains(@id,'app')]//following::button")
    WebElement button;
    public   void  userdetails(String us,String pas){
        user.sendKeys(us);
        pass.sendKeys(pas);
    }
    public   void  buttons(){
        button.click();
    }
    public String elem(WebDriver driver){
        String s = driver.getCurrentUrl();
        return s;
    }
}
