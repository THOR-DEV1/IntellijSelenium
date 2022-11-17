package hooks;


import config.browserdriver;
import io.cucumber.java.Before;

public class hook2 {@Before("@tag2")
public  void starts(){
    browserdriver.getCurrentDriver("chrome").get("https://www.ishahomes.com/");

}

}

