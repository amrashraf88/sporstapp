package StepDefinitions;

import POM.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    static WebDriver driver = null;

    @Before
	public static void openBrowser() throws InterruptedException {
      
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.navigate().to("https://hotfix.el-dokan.com/en");
        Thread.sleep(9000);
        System.out.println("dddddd");
    }
    

    @After
    public static void closeBrowser()
    {
        try{
            Thread.sleep(2000);
            driver.quit();
        }catch (NullPointerException e) {
            System.out.println("NullPointerException Thrown!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
