package TestngClass;

import com.epam.healenium.SelfHealingDriver;
import excel.excelreader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class demoexcel {
    public static void main(String...strings) throws IOException {
        excelreader obj = new excelreader();
        int i=obj.totalCell();
        WebDriverManager.chromedriver().setup();
        WebDriver delegate = new ChromeDriver();
//create Self-healing driver
           SelfHealingDriver driver = SelfHealingDriver.create(delegate);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        for (int j=1;j<=i;j++) {
            driver.findElement(By.className("//input[contains(@name,'username')]")).clear();
            driver.findElement(By.xpath("//input[contains(@name,'password')]")).clear();
            driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(obj.username(j));
            driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys(obj.password(j));
            driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
            int s=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).size();
            if(s==1) {
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
            }else{
                System.out.print("hee..hee..!");
            }


        }
        driver.close();
    }
}
