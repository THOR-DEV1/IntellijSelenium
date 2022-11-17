package Config;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory 
{
	
static WebDriver drivers;
	
	public static WebDriver startBrowser(String browserType) {

		switch (browserType) {
			case "chrome": {
				WebDriverManager.chromedriver().setup();
				drivers = new ChromeDriver();
				SelfHealingDriver driver = SelfHealingDriver.create(drivers);
				break;
			}
			case "firefox": {
				WebDriverManager.firefoxdriver().setup();
				drivers = new FirefoxDriver();
				SelfHealingDriver driver = SelfHealingDriver.create(drivers);
				break;
			}
			case "edge": {
				WebDriverManager.edgedriver().setup();
				drivers = new EdgeDriver();
				SelfHealingDriver driver = SelfHealingDriver.create(drivers);
				break;
			}
		}
		
		
		//driver.get(appurl);
		drivers.manage().window().maximize();
		//Thread.sleep(3000);
		
		
		return drivers;
		
	}
	
    
}
