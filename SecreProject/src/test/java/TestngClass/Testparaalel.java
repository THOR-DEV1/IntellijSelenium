package TestngClass;


import Config.BrowserDriver;
import elements.element;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import util.JiraPolicy;
import util.LoaderClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Testparaalel {
	 BrowserDriver driver=new BrowserDriver();
     LoaderClass ld=new LoaderClass();
	element ele=new element();

    @JiraPolicy(logTicketReady = true)
  @Test()
  public void f() throws IOException, InterruptedException {
	 ele=PageFactory.initElements(driver.getCurrentDriver(),element.class);
     driver.getCurrentDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     ele.logindata(ld.load("Baseuser"), ld.load("Basepass") );

     Assert.assertEquals("hehe","hehee");
     ele.loginbtn();
     ele.llist();
     if(ele.namell()=="Paul Collings"){
        ele.cancelM();
     }else{
         System.out.print("Leave Applied by: "+ele.namell());
     }
     ele.logout();


  }

    @BeforeTest
    @Parameters("browser")
    public void start(String browser) throws IOException {
      driver.getCurrentDriver(browser).get(ld.load("BaseUrl"));
      }
      @AfterTest
    public void close(){

        driver.close();
      }

  }

