package TestngClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ErrorClass;

import javax.swing.*;

public class demo {
    static ErrorClass err=new ErrorClass();
    public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
        //WebDriver driver=new ChromeDriver();

        //String ex=null;

//            try {
//                //Launch the application
//                driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
//
//                //Locating element by link text and store in variable "Element"
//                WebElement Element = driver.findElement(By.linkText("Try Selenium Testing For Free"));
//
//            }catch(Exception e){
//                /*String exceptionClassName = e.getMessage();
//                exceptionClassName.concat(ExceptionUtils.getFullStackTrace(getThrowable())));*/
//                ex=e.getMessage().substring(0,90);
//            }
//            ITestResult result = null;
//            System.out.print(ExceptionUtils.getFullStackTrace(result.getThrowable()));
//            driver.close();
        JFrame f= new JFrame("TextField Example");
        JTextField t1;
        t1=new JTextField("yes");
        t1.setBounds(50,100, 200,30);

        f.add(t1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        System.out.print(t1.getText());
        //return t1;
    }
}
