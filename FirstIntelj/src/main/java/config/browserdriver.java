package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class browserdriver {
    public static WebDriver mDriver;
    public static WebDriver getCurrentDriver(String browserType) {

        if(mDriver==null) {

            try {

                mDriver = browserfactory.startBrowser(browserType);

            }catch(UnreachableBrowserException e) {
                e.printStackTrace();
            }
        }

        return mDriver;

    }


    public static WebDriver getCurrentDriver() {

        return getCurrentDriver("chrome");

    }
}
