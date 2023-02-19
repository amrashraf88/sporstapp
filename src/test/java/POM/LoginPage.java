package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginPage {

    WebDriver driver = null;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
//
    public WebElement accept_cookie()
    {
        return driver.findElement(By.xpath("//*[@id=\"cookieNotice\"]/div[3]/div/div/button"));
    }
    public void userName()
    {
        WebElement user_name=  driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/div[1]/mat-form-field/div/div[1]/div/input"));
        StringBuilder data = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/amr/Downloads/hotfix_final/fileName.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dataString = data.toString();
        System.out.println(dataString);

        user_name.sendKeys(dataString);


    }

    public WebElement password()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/div[2]/mat-form-field/div/div[1]/div[1]/input"));
    }

    public WebElement loginButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/button"));
    }

    public WebElement forgotPassword()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/div[3]/a"));
    }



}
