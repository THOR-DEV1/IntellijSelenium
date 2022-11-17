package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoaderClass {
    public Properties loadOR() throws IOException {
        Properties obj=new Properties();
        FileInputStream objfile=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
        obj.load(objfile);
        return obj;
    }
    public String load(String s) throws IOException {
        return loadOR().getProperty(s);

    }
}
